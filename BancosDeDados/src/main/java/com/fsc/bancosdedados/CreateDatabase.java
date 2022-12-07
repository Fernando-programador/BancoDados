/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fsc.bancosdedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Fernando Correa
 */
public class CreateDatabase {
    
    public static void main(String[] args) throws SQLException {
       
        final String url = "jdbc:mysql://localhost:3306";
        final String user = "root";
        final String pass = "";
        
        Connection c1 = DriverManager.getConnection(url, user, pass);
        
        Statement st = c1.createStatement();
        
        st.execute("CREATE DATABASE IF NOT EXISTS impl_banco");
                
        c1.close();
        st.close();
          
    }
    
}
