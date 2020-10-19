package com.mateusborja.javabegin.myexamples;

/**
 *
 * @author mateus.borja
 */
public class AplicacaoCarro {

    public static void main(String[] args) {

        //instanciar uma classe => objeto
        Carro c4 = new Carro();
        Carro ix35 = new Carro();

        c4.ligar();
        c4.freio = false;

        c4.acelerar(40);
        
        c4.desligar();
        


        
    }
    

}
