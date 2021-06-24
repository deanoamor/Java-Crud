/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KoneksiDb;
import java.sql.*;
/**
 *
 * @author deano
 */
public class Koneksi {
   private Connection connection = null;
   
   public Connection SetConnection(){
       
       try{
           String url ="jdbc:mysql://localhost:3306/baranggudang";
           String user="root";
           String pass="";
           String db = "baranggudang";
                
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(url,user,pass);    
           
       }catch (Exception e) {
           System.out.println("error" + e.getMessage());
       }
       
       return connection;
   }
}
