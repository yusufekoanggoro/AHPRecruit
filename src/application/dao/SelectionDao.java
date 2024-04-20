/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package application.dao;

import application.models.SelectionModel;
import java.util.List;

/**
 *
 * @author yusuf
 */public interface SelectionDao {
    
    public int insertOne(SelectionModel selection);
    public List<SelectionModel> findAll();
    public int delete(int id);
    public int update(SelectionModel selection);
    public SelectionModel findOneById(int id);
    public int upsertOne(SelectionModel selection);
    public int deleteByUserId(int id);
    
}
