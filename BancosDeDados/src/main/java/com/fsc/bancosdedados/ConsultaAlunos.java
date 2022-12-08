/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fsc.bancosdedados;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fernando Correa
 */
public class ConsultaAlunos {
    public static void main(String[] args) throws SQLException {
        
    Connection con = MinhaConexao.getConexao();
    
    String sql = "SELECT * FROM alunos";
    
    Statement st = con.createStatement();
        ResultSet res = st.executeQuery(sql);
        
        List<Model> alunos = new ArrayList<>();
        while (res.next()) {
            int id  = res.getInt("id");
            String nome = res.getString("nome");
            String materia = res.getString("materia");
            
            alunos.add(new Model(id, nome, materia));            
        }
    
        for (Model model: alunos){
            System.out.println(model.getId() + " -> " + model.getNome() + " estuda " + model.getMateria());
        }
        st.close();
        con.close();
    }
    
}
