package com.mateusborja.javabegin.myexamples;

/**
 *
 * @author mateus.borja
 */
public class Carro {

    /*atributos
    segundo oop atributos devem ser private
     */
    private String marca;
    private int ano;
    private int marcha;
    private int velocidade;
    private boolean ligado;
    
    //usar metodos get e set
    public boolean freio = true;

    /* metodos
    metodos devem ser public
     */
    public void ligar() {
        if (this.ligado == false) {
            this.ligado = true;
            System.out.println("O Carro foi Ligado.");
        } else {
            this.ligado = true;
            System.out.println("O Carro ja está ligado...");

        }

    }

    public void desligar() {
        if (this.ligado == true) {
            this.ligado = false;
            System.out.println("O Carro foi desligado");
        } else {
            System.out.println("O Carro não esta ligado.");

        }

        System.out.println("Carro desligado.");

    }

    public void acelerar(int velocidade) {
        if (this.ligado == true) {
            if (this.freio == false) {
                this.velocidade = velocidade;
                System.out.println("Você está a: => " + this.velocidade + " Kilometros por hora.");
            }

        }

    }
    
    
    public void frear() {
        this.freio = freio;
      
    }

    public void trocarMarcha() {
        System.out.println("Marcha trocada.");

    }

}
