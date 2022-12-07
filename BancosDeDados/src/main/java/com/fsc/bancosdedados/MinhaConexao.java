/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fsc.bancosdedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Fernando Correa
 */
public class MinhaConexao {
    
    public static Connection getConexao(){
        try {
        final String url = "jdbc:mysql://localhost:3306/impl_banco?verifyServerCertificate=false&SSL=true";
        final String user = "root";
        final String pass = "";
         
            Connection c1 = DriverManager.getConnection(url, user, pass);
            
            return c1;
 
        }catch (SQLException e){
           throw  new RuntimeException(e);
        }
    }
    
    
}
