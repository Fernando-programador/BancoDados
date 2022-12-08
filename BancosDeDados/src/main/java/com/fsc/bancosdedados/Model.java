/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fsc.bancosdedados;

import java.util.logging.Logger;

/**
 *
 * @author Fernando Correa
 */
public class Model {
    
    private long id;
    private String nome;
    private String materia;

    public Model() {
    }

    public Model(long id, String nome, String materia) {
        this.id = id;
        this.nome = nome;
        this.materia = materia;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    

   
    
    
    
}
