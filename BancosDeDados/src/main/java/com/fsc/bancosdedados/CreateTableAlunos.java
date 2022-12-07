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
public class CreateTableAlunos{
    
    public static void main(String[] args) throws SQLException{
       
        
       Connection con = MinhaConexao.getConexao();
        
        String sql = "CREATE TABLE IF NOT EXISTS alunos("
                + "id INT AUTO_INCREMENT PRIMARY KEY,"
                + "nome VARCHAR(80) NOT NULL,"
                + "materia VARCHAR(50) NOT NULL"
                + ")";
        
        Statement st = con.createStatement();
        st.execute(sql);
        
        System.out.println("Conexão efetuada com sucesso!!!!");
        
       con.close();
        st.close();
    }
    }
            
    

