/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author ALUNO
 */
@Entity
public class Funcionario extends Pessoa{
    @Id
    @GeneratedValue
    private long codFuncionario;
    
    private double salario;
    private int pis;
    private String cargo;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    public Funcionario() {
        endereco = new Endereco();
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getPis() {
        return pis;
    }

    public void setPis(int pis) {
        this.pis = pis;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
