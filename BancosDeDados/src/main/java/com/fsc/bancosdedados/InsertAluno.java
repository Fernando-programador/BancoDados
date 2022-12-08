/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fsc.bancosdedados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author notebook
 */
public class InsertAluno {
    public static void main(String[] args) throws SQLException {
        
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Informe nome do aluno: ");
        String nome = sc.nextLine();
        
        System.out.println("Informe a materia matriculada: ");
        String materia  = sc.nextLine();
        
        Connection c1 = MinhaConexao.getConexao();
        String sql = "INSERT INTO alunos (nome, materia)VALUES (?,?)";
        PreparedStatement st = c1.prepareStatement(sql);
        st.setString(1, nome);
        st.setString(2, materia);
        st.execute();
    
    sc.close();
}
}