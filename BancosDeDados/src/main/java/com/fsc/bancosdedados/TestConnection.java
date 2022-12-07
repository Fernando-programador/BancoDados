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
public class TestConnection {
 
    public static void main(String[] args) throws SQLException {
        
        final String url = "jdbc:mysql://localhost:3306";
        final String user = "root";
        final String pass = "";
        
        Connection c1 = DriverManager.getConnection(url, user, pass);
        
        System.out.println("Conexão efetuada com sucesso!!!!");
        
        c1.close();
        
        
        
        
        
        
        
    }
    
    
    
}
