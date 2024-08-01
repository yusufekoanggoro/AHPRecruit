/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.daoimpl;

import application.dao.SelectionDao;
import application.models.SelectionModel;
import application.utils.DatabaseUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yusuf
 */
public class SelectionDaoImpl implements SelectionDao {
    private final Connection dbConnection;
    private PreparedStatement pstmt;
    private ResultSet resultSet;
    private String query;
    
    public SelectionDaoImpl(){
        dbConnection = DatabaseUtil.getInstance().getConnection();
    }
        
    @Override
    public int insertOne(SelectionModel selection) {
        try {
            query = "INSERT INTO selections(user_id,score) "
                    + "VALUES (?,?)";
            
            pstmt = dbConnection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            pstmt.setInt(1, selection.getUserId());
            pstmt.setDouble(2, selection.getScore());
            
            return pstmt.executeUpdate();
	} catch (SQLException e) {
            System.out.println(e);
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
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<SelectionModel> findAll() {
        try {
            query = "SELECT selections.id,candidates.name,candidates.phone_number,selections.score FROM selections " +
            "INNER JOIN candidates ON selections.user_id = candidates.id " +
            "ORDER BY selections.score DESC";

            pstmt = dbConnection.prepareStatement(query);
            resultSet = pstmt.executeQuery();

            List<SelectionModel> selections = new ArrayList<>();
            
            int rank = 1;
            while (resultSet.next()) {
                SelectionModel selection = new SelectionModel();
                selection.setId(resultSet.getInt("id"));
                selection.setName(resultSet.getString("name"));
                selection.setPhoneNumber(resultSet.getString("phone_number"));
                selection.setScore(resultSet.getDouble("score"));
                selection.setRanking(rank);
                selections.add(selection);
                rank++;
            }

            return selections;
        } catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            closeStatement();
        }
    }

    @Override
    public int delete(int id) {
        try {
//            query = "DELETE FROM selections WHERE id = ?";
            query = "DELETE FROM selections";
            
            pstmt = dbConnection.prepareStatement(query);
//            pstmt.setInt(1, id);
            
            return pstmt.executeUpdate();
	} catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            closeStatement();
        }
    }

    @Override
    public int upsertOne(SelectionModel selection) {
        try {
            query = "INSERT INTO selections(user_id,score) " +
                    "VALUES(?,?) " +
                    "ON DUPLICATE KEY UPDATE user_id=VALUES(user_id), score=VALUES(score)";
            
            pstmt = dbConnection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            pstmt.setInt(1, selection.getUserId());
            pstmt.setDouble(2, selection.getScore());
            
            int result = pstmt.executeUpdate();
            resultSet = pstmt.getGeneratedKeys();
            return result;
	} catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            closeStatement();
        }
    }

    @Override
    public int update(SelectionModel selection) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SelectionModel findOneById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int deleteByUserId(int id) {
            try {
            query = "DELETE FROM selections WHERE user_id = ?";
            
            pstmt = dbConnection.prepareStatement(query);
            pstmt.setInt(1, id);
            
            return pstmt.executeUpdate();
	} catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            closeStatement();
        }
    }
    
}
