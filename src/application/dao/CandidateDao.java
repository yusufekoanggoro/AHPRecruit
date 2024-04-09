/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package application.dao;

import application.models.CandidateModel;
import java.util.List;

/**
 *
 * @author yusuf
 */
public interface CandidateDao {
    
    public int insertOne(CandidateModel candidate);
    public List<CandidateModel> findAll();
    public int delete(int id);
    public int update(CandidateModel candidate);
    
}
