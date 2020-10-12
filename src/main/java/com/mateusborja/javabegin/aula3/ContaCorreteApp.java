package com.mateusborja.javabegin.aula3;

/**
 *
 * @author mateus.borja
 */
public class ContaCorreteApp {

    public static void main(String[] args) {

        ContaCorrente contacomum = new ContaCorrente("", 5630, 8000461, 10000);
        ContaCorrente contacomumc1 = new ContaCorrente("Joao Paulo", 5230, 8000461, 10000);
        ContaCorrente c1 = new ContaCorrente(" ",0230, 8000461, 100);
        contacomum.setCliente("Mateus");

        contacomum.getAgencia();
        contacomum.getConta();

        c1.setCliente("Joao Honório");
        c1.setAgencia(230);
        c1.setAgencia(566);
        c1.setConta(8000461);
        c1.setLimite(10000);

        //System.out.println("Sua agencia é: => " + contacomum.getAgencia() + "e sua conta é: => " + contacomum.getConta());
        //System.out.println(contacomum.getCliente());
        //System.out.println(c1.getCliente());
        System.out.println(c1.toString());

    }

}
