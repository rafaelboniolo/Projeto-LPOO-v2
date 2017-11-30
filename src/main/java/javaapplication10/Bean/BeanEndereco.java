/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10.Bean;

/**
 *
 * @author User
 */
public class BeanEndereco {
    String cep;
    String cidade;
    String uf;
    String rua;
    String n = "";

    public BeanEndereco() {
    }

    public BeanEndereco(String cep, String cidade, String uf, String rua) {
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }
    
    
}
