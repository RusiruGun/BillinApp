/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingsystem;

/**
 *
 * @author Rusiru
 */
public class BillingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DBConnectionClass connect=new DBConnectionClass();
      
        connect.checkLogin("Pasan", "12345678");
    }
    
}
