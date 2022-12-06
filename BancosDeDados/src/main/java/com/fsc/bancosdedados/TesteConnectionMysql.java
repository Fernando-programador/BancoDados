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
public class TesteConnectionMysql {
    
    public static void main(String[] args) throws SQLException {
        
        String url = "jdbc:mysql://localhost:3306";
        String user = "root";
        String password = "";
        
        Connection c1 = DriverManager.getConnection(url, user, password);
        
        
        System.out.println("Conexão estabelecida com sucesso, siga o nosso canal");
        
    }
    
}
