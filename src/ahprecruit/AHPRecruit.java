/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ahprecruit;

import ahprecruit.utils.DatabaseUtil;
import ahprecruit.views.LoginView;
import ahprecruit.views.LoginView;

/**
 *
 * @author yusuf
 */
public class AHPRecruit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        try {
            Config.load();
            DatabaseUtil.getInstance().getConnection();

            new LoginView().start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
