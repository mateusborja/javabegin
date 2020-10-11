//methods and java encapsulation
package com.mateusborja.javabegin.aula1;

/**
 *
 * @author mateus.borja
 */
    public class Pessoa {
    
    private int codigo;
    private String nome;
    
    public Pessoa(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    
    
    
   
    
    
}
