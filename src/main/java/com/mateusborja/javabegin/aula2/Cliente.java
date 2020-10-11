//java encapsulation and 
package com.mateusborja.javabegin.aula2;

/**
 *
 * @author mateus.borja
 */
public class Cliente {

    private String nome;
    private String endereco;

    public Cliente(String nome,
            String endereo) {
        this.nome = nome;
        this.endereco = endereo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
