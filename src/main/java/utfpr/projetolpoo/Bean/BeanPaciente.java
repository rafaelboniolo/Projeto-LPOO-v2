/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.Bean;

import java.util.Date;

/**
 *
 * @author User
 */
public class BeanPaciente {
    String nome;
    String cpf;
    String rg;
    Date nascimento;
    String cpfResponsavel;
    String laudo;
    BeanEndereco endereco = new BeanEndereco();

    public BeanPaciente(String nome, String cpf, String rg, Date nascimento, String cpfResponsavel, String laudo) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.nascimento = nascimento;
        this.cpfResponsavel = cpfResponsavel;
        this.laudo = laudo;
    }

    public BeanPaciente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpfResponsavel() {
        return cpfResponsavel;
    }

    public void setCpfResponsavel(String cpfResponsavel) {
        this.cpfResponsavel = cpfResponsavel;
    }

    public String getLaudo() {
        return laudo;
    }

    public void setLaudo(String laudo) {
        this.laudo = laudo;
    }

    public BeanEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(BeanEndereco endereco) {
        this.endereco = endereco;
    }
    
    
}
