package com.mateusborja.javabegin.aula4;

/**
 *
 * @author mateus.borja main class
 */
public class ClienteApp {

    public static void main(String[] args) {

        PessoaFisica clientepf1 = new PessoaFisica("xxxxx", "O endereco é", "cpf");
        PessoaJuridica clientepj1 = new PessoaJuridica("xxx", "end", "xxxxxxxxx");
        
        PessoaFisica clientepf2 = new PessoaFisica("xxxxx", "O endereco é", "cpf");
        PessoaJuridica clientepj2 = new PessoaJuridica("xxx", "end", "xxxxxxxxx");
        
        clientepf1.setNome("Mateus Borja");
        clientepf1.setEndereco("Rua Tucanos N,09 - Aleixo");
        clientepf1.setCpf("xxx.xxx.xxx-xx");

        clientepj1.setNome("Maria dos Santos");
        clientepj1.setEndereco("Rua Tomaz N.100, Bosque das Oliveiras");
        clientepj1.setCnpj("xx.xxx.xxx.xxx.xxx");
        
        
        clientepf2.setNome("Joana D´Arc");
        clientepf2.setEndereco("Rua Feliz da Silva, N.100, Felicidade da Silva");
        clientepf2.setCpf("888.888.888-88");
        
                
        clientepj2.setNome("Joana D´Arc Ribeiro");
        clientepj2.setEndereco("Rua Felicidade, N.100, Feliz Cidade Perfeita");
        clientepj2.setCnpj("888.888.888-88");
        
        
        
        //System.out.println("O nome da pessoa é =>" + clientepf1.getNome() + "\n" + "Seu Endereço é: => " + clientepf1.getEndereco() + "\n" + "E seu CPF são: =>" + clientepf1.getCpf());
        //System.out.println("O nome da pessoa é =>" + clientepj1.getNome() + "\n" + "Seu Endereço é: => " + clientepj1.getEndereco() + "\n" + "E seu CPF são: =>" + clientepj1.getCnpj());
   
        System.out.println(clientepf1.toString() + "\n");
        System.out.println(clientepj1.toString()+ "\n");
        
        System.out.println(clientepf2.toString()+ "\n");
        System.out.println(clientepj2.toString()+ "\n");
    
    }
    
   

}
