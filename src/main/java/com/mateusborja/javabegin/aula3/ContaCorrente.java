package com.mateusborja.javabegin.aula3;

/**
 *
 * @author mateus.borja
 * 
 * sobrecaga
 */
public class ContaCorrente {
    
    private String cliente;
    private int conta, agencia;
    private float limite;
    
    
    public ContaCorrente(int numero, int agencia) {
        this.conta = numero;
        this.agencia = agencia;
    }
    
    public ContaCorrente(String cliente, int numero, int agencia) {
        this.cliente = cliente;
        this.conta = numero;
        this.agencia = agencia;
    }
    
    public ContaCorrente(String cliente, int numero, int agencia, float limite) {
        this.cliente = cliente;
        this.conta = numero;
        this.agencia = agencia;
        this.limite = limite;
    }


    
    public ContaCorrente() {
    }


    public String getCliente() {
        return cliente;
    }

    public int getConta() {
        return conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public float getLimite() {
        return limite;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    


    
    
    
}
