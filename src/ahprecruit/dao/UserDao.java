/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ahprecruit.dao;

import ahprecruit.models.UserModel;

/**
 *
 * @author yusuf
 */
public interface UserDao {
    
    public UserModel findOneByUsernameAndPassword(String username, String password);
    
}
