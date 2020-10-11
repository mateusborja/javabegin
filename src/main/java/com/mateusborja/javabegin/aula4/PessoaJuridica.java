package com.mateusborja.javabegin.aula4;

/**
 *
 * @author mateus.borja
 * 
 * a subclass and using super method
 */
public class PessoaJuridica extends Cliente {

    private String cnpj;

    public PessoaJuridica(String nome,
            String endereco,
            String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public String toString() {
        return super.toString() + "seu CPNJ é: => ";
    }
    
    
}
