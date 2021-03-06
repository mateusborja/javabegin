package com.mateusborja.javabegin.aula3;

/**
 *
 * @author mateus.borja
 *
 * sobrecaga
 */
public class ContaCorrente {

    private String cliente;
    private int conta;
    private int agencia;
    private float limite;

    public ContaCorrente(String cliente, int conta, int agencia, float limite) {
        this.cliente = cliente;
        this.conta = conta;
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

    public String toString() {
        return "Nome do Cliente: => " + cliente + "\nNúmero da conta: => " + conta + "\nNúmero da Agência: => " + agencia + "\nLimite da conta: =" + limite;
    }

}
