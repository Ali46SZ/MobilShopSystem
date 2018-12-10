/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mobile;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Mobile {


    public static void main(String[] args) {
        
        try {
            AACC.f();
        } catch (SQLException ex) {
            Logger.getLogger(Mobile.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
