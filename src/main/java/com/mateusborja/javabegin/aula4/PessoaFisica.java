
package com.mateusborja.javabegin.aula4;

/**
 *
 * @author mateus.borja
 */
public class PessoaFisica extends Cliente{
    
    private String cpf;
    
    public PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nseu CPF é: \n=>" +cpf;
    }
    
    
}
