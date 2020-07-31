/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class MyConnection {
    Connection con;
    Statement st;
    static ResultSet rs;
    
    MyConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");   
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
        st=con.createStatement();
      
    }
    
}
