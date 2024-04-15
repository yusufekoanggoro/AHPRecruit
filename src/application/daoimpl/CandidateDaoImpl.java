/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.daoimpl;

import application.dao.CandidateDao;
import application.models.CandidateModel;
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
public class CandidateDaoImpl implements CandidateDao {
    private final Connection dbConnection;
    private PreparedStatement pstmt;
    private ResultSet resultSet;
    private String query;
    
    public CandidateDaoImpl(){
        dbConnection = DatabaseUtil.getInstance().getConnection();
    }
        
    @Override
    public int insertOne(CandidateModel candidate) {
        try {
            query = "INSERT INTO candidates(name,gender,last_education,phone_number,address,leadership_score,knowledge_score,technical_skill_score,advanced_skill_score) "
                    + "VALUES (?,?,?,?,?,?,?,?,?)";
            
            pstmt = dbConnection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, candidate.getName());
            pstmt.setString(2, candidate.getGender());
            pstmt.setString(3, candidate.getLastEducation());
            pstmt.setString(4, candidate.getPhoneNumber());
            pstmt.setString(5, candidate.getAddress());
            pstmt.setInt(6, candidate.getLeadershipScore());
            pstmt.setInt(7, candidate.getKnowledgeScore());
            pstmt.setInt(8, candidate.getTechnicalSkillScore());
            pstmt.setInt(9, candidate.getAdvancedSkillScore());
            
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
    public List<CandidateModel> findAll() {
        try {
            query = "SELECT * FROM candidates";

            pstmt = dbConnection.prepareStatement(query);
            resultSet = pstmt.executeQuery();

            List<CandidateModel> candidates = new ArrayList<>();

            while (resultSet.next()) {
                CandidateModel candidate = new CandidateModel();
                candidate.setId(resultSet.getInt("id"));
                candidate.setName(resultSet.getString("name"));
                candidate.setGender(resultSet.getString("gender"));
                candidate.setLastEducation(resultSet.getString("last_education"));
                candidate.setPhoneNumber(resultSet.getString("phone_number"));
                candidate.setAddress(resultSet.getString("address"));
                candidate.setLeadershipScore(resultSet.getInt("leadership_score"));
                candidate.setKnowledgeScore(resultSet.getInt("knowledge_score"));
                candidate.setTechnicalSkillScore(resultSet.getInt("technical_skill_score"));
                candidate.setAdvancedSkillScore(resultSet.getInt("advanced_skill_score"));
                candidates.add(candidate);
            }

            return candidates;
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
            query = "DELETE FROM candidates WHERE id = ?";
            
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

    @Override
    public int update(CandidateModel candidate) {
        try {
            query = "UPDATE candidates " 
                    + "SET name = ?, gender = ?, last_education = ?, phone_number = ?, address = ?, leadership_score = ?, knowledge_score = ?, technical_skill_score = ?, advanced_skill_score = ? "
                    + "WHERE id = ?";

            pstmt = dbConnection.prepareStatement(query);
            pstmt.setString(1, candidate.getName());
            pstmt.setString(2, candidate.getGender());
            pstmt.setString(3, candidate.getLastEducation());
            pstmt.setString(4, candidate.getPhoneNumber());
            pstmt.setString(5, candidate.getAddress());
            pstmt.setInt(6, candidate.getLeadershipScore());
            pstmt.setInt(7, candidate.getKnowledgeScore());
            pstmt.setInt(8, candidate.getTechnicalSkillScore());
            pstmt.setInt(9, candidate.getAdvancedSkillScore());
            pstmt.setInt(10, candidate.getId());
            
            return pstmt.executeUpdate();
	} catch (SQLException e) {
            // e.printStackTrace();
            System.out.println(e);
            throw new RuntimeException(e);
        }finally{
            closeStatement();
        }
    }

    @Override
    public CandidateModel findOneById(int id) {
                try {
            query = "SELECT * FROM candidates " 
                    + "WHERE id = ?";
            
            pstmt = dbConnection.prepareStatement(query);
            pstmt.setInt(1, id);
            
            resultSet = pstmt.executeQuery();
            if(resultSet.next()){
                CandidateModel candidateFound = new CandidateModel();
                candidateFound.setId(resultSet.getInt("id"));
                candidateFound.setName(resultSet.getString("name"));
                candidateFound.setGender(resultSet.getString("gender"));
                candidateFound.setLastEducation(resultSet.getString("last_education"));
                candidateFound.setPhoneNumber(resultSet.getString("phone_number"));
                candidateFound.setAddress(resultSet.getString("address"));
                candidateFound.setLeadershipScore(resultSet.getInt("leadership_score"));
                candidateFound.setKnowledgeScore(resultSet.getInt("knowledge_score"));
                candidateFound.setTechnicalSkillScore(resultSet.getInt("technical_skill_score"));
                candidateFound.setAdvancedSkillScore(resultSet.getInt("advanced_skill_score"));
                return candidateFound;
            }
            return null;
	} catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            closeStatement();
        }
    }
    
}
