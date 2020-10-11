//java inheritance and polymorphism
package com.mateusborja.javabegin.aula4;

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
    
    public String toString() {
        return "Seu nome é =>" + nome + " e seu \n Endereço é: =>" + endereco;
    }

}
