

package com.mateusborja.javabegin.aula1;

/**
 *
 * @author mateus.borja
 */
public class PessoaApp {
    
    public static void main(String[] args) {

        Pessoa pessoap1 = new Pessoa(8, "Helder");
        Pessoa pessoap2 = new Pessoa(2, "Ana");
        pessoap1.setNome("Felipe Cardoso");
        pessoap1.setCodigo(320);
        
        pessoap2.setNome("Joana Cardoso");
        pessoap2.setCodigo(520);
        
        System.out.println("O nome da pessoa1 é => " + pessoap1.getNome());
        System.out.println("E seu código  é => " + pessoap1.getCodigo());
        
        System.out.println("O nome da outra pessoa1 é => " + pessoap2.getNome());
        System.out.println("O nome da pessoa1 é " + pessoap2.getCodigo());
        
    }
    
}
