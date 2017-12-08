/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import javax.persistence.Column;
import utfpr.projetolpoo.model.vo.abstrato.Pessoa;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

/**
 *
 * @author ALUNO
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Funcionario extends Pessoa{
    //@Column(nullable=false, unique=true)
    private double salario;
    
    //@Column(nullable=false, unique=true)
    private int pis;
    
    //@Column(nullable=false, unique=true)
    @ManyToOne
    private Gerente gerente;
    
    //@Column(nullable=false, unique=true)
    @ManyToOne
    private Cargo cargo;
    
    public Funcionario() {
        //endereco = new Endereco();
        //gerente = new Gerente();
        //cargo = new Cargo();
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

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    
}
