/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fsc.bancosdedados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author notebook
 */
public class UpdateAlunos {
    public static void main(String[] args) throws SQLException {
                 Scanner sc  = new Scanner(System.in);    
    Connection con = MinhaConexao.getConexao();
    
    String sql = "UPDATE alunos SETNOME nome ";
    
        System.out.println("Informe o que deseja pesquisar: ");
        String pesquisa = sc.nextLine();
    
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1, "%" + pesquisa + "%");
        ResultSet res = st.executeQuery();
        
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
        sc.close();
    }
    }
}
