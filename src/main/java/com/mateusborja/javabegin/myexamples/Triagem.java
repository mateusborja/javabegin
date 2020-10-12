package com.mateusborja.javabegin.myexamples;

/**
 *
 * @author mateus.borja
 */
public class Triagem {

    public static void main(String[] args) {
        
        Paciente consulta1 = new Paciente();
        
        consulta1.pacienteParaTriagem("Joao Honorio", 75);
        
        //consulta1.setNome("Joao Honório Dutra");
        //consulta1.setIdade(85);
                
        
        System.out.println(consulta1.toString());

    }

}
