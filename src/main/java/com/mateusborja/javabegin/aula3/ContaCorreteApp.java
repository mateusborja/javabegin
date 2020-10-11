
package com.mateusborja.javabegin.aula3;

/**
 *
 * @author mateus.borja
 */
public class ContaCorreteApp {
    public static void main(String[] args) {
        
        ContaCorrente contacomum = new ContaCorrente(0230, 8000461);
        ContaCorrente contacomumc1 = new ContaCorrente("Joao Paulo", 0230, 8000461);
        
        contacomum.getAgencia();
        contacomum.getConta();

        contacomum.setCliente("Mateus");
                
        ContaCorrente c1 = new ContaCorrente();
        c1.setCliente("Joao");
        
        System.out.println("Sua agencia é: => " + contacomum.getAgencia() + "e sua conta é: => " + contacomum.getConta());
        
        System.out.println(contacomum.getCliente());
        
        System.out.println(c1.getCliente());
        
        
    }
    
}
