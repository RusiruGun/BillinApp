/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billingsystem;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.*;
import java.sql.ResultSet;

/**
 *
 * @author Rusiru
 */
public class DBConnectionClass {
   
    private Connection conn;
    private Statement std;
    private ResultSet res;
    
    public DBConnectionClass(){
    try{
       Class.forName("com.mysql.jdbc.Driver");
       
     conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/biilinsof?autoReconnect=true&useSSL=false","root","");
      std= (Statement) conn.createStatement();
       
    }catch(Exception ex){
        System.out.println("Connection Err.");
    }
    
    }
    public void checkLogin(String uName,String Pass){
    try{
        String query="select * from user where UserName='"+uName+"' and Pass='"+Pass+"' ";
        res=std.executeQuery(query);
        System.out.println("recordSubmited");
        
        while(res.next()){
        String Name=res.getString("UserName");
         String Password=res.getString("Pass");
         
         if(uName.equals(Name)&&Pass.equals(Password) ){
         System.out.println("Login True");
         }
        
        }
        
         
        
    }catch(Exception ex){
        System.out.println("Loading error");
    }
    }
        
    
}
    

