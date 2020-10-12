/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mateusborja.javabegin.myexamples;

/**
 *
 * @author mateus.borja
 */
public class Paciente {

    private String nome;
    private int idade;

    public Paciente pacienteParaTriagem( String nome, int idade) {
        Paciente paciente = new Paciente();
        this.nome = (nome);
        this.idade = (idade);

        return paciente;

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String toString() {
        return "Nome do paciente é : => " + nome + " e sua idade é: => " + idade;
        
    }
    
    

}
