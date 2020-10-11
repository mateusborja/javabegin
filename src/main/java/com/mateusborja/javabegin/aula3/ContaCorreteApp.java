
package com.mateusborja.javabegin.aula3;

/**
 *
 * @author mateus.borja
 */
public class ContaCorreteApp {
    public static void main(String[] args) {
        
        ContaCorrente contacomum = new ContaCorrente(0230, 8000461);
        ContaCorrente contacomumc1 = new ContaCorrente("Joao Paulo", 0230, 8000461);
                
        contacomumc1.setCliente("Mateus Borja");
        
        System.out.println(contacomum.getCliente());
        
        System.out.println();
        
        
    }
    
}
