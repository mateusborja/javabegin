package com.mateusborja.javabegin.aula2;

/**
 *
 * @author mateus.borja main class
 */
public class ClienteApp {

    public static void main(String[] args) {

        PessoaFisica clientepf1 = new PessoaFisica("xxxxx", "O endereco é", "cpf");
        PessoaJuridica clientepj1 = new PessoaJuridica("xxx", "end", "xxxxxxxxx");

        clientepf1.setNome("Mateus Borja");
        clientepf1.setEndereco("Rua Tucanos N,09 - Aleixo");
        clientepf1.setCpf("xxx.xxx.xxx-xx");

        clientepj1.setNome("Maria dos Santos");
        clientepj1.setEndereco("Rua Tomaz N.100, Bosque das Oliveiras");
        clientepj1.setCnpj("xx.xxx.xxx.xxx.xxx");

        System.out.println("O nome da pessoa é =>" + clientepf1.getNome() + "\n" + "Seu Endereço é: => " + clientepf1.getEndereco() + "\n" + "E seu CPF são: =>" + clientepf1.getCpf());
        System.out.println("O nome da pessoa é =>" + clientepj1.getNome() + "\n" + "Seu Endereço é: => " + clientepj1.getEndereco() + "\n" + "E seu CPF são: =>" + clientepj1.getCnpj());

    }

}
