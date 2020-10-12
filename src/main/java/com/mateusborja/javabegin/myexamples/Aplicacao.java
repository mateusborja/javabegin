package com.mateusborja.javabegin.myexamples;

/**
 *
 * @author mateus.borja
 */
public class Aplicacao {

    public static void main(String[] args) {

        Operacao o = new Operacao();
        Valor valor = new Valor();
        Paciente consulta1 = new Paciente();
        
        String c1 = "José Alexandre";
        int c2 = 75;
        
 
        int v1 = 100;
        o.trocar(v1);
        System.out.println(v1);

        valor.v = 200;
        o.alterarValor(valor);
        System.out.println(valor.v);
        
        System.out.println(c1);
        
        
        
       

    }

}
