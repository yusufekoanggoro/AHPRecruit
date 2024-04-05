/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahprecruit.daoimpl;

import ahprecruit.dao.UserDao;
import ahprecruit.models.UserModel;
import ahprecruit.utils.DatabaseUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author yusuf
 */
public class UserDaoImpl implements UserDao {
    private final Connection dbConnection;
    private PreparedStatement pstmt;
    private ResultSet resultSet;
    private String query;
 
    public UserDaoImpl(){
        dbConnection = DatabaseUtil.getInstance().getConnection();
    }

    @Override
    public UserModel findOneByUsernameAndPassword(String username, String password) {
        try {
            query = "SELECT * FROM users WHERE username=? and password=?";
 
            pstmt = dbConnection.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            
            resultSet = pstmt.executeQuery();
            if(resultSet.next()){
                UserModel user = new UserModel();
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                return user;
            }
            return null;
	} catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            closeStatement();
        }
    }
    
    private void closeStatement() {
        try {
            if(pstmt != null){
                pstmt.close();
                pstmt = null;
            }
            if(resultSet != null){
                resultSet.close();
                resultSet = null;
            }   
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
