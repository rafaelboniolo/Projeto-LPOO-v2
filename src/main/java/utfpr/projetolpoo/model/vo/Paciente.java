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
 * @author User
 */
@Entity
public class Paciente extends Pessoa{
    @Id
    @GeneratedValue
    private long codPaciente;
    
    private String laudo;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
    
    @ManyToOne
    private Responsavel responsavel;
    
    @ManyToOne
    private Enfermeiro enfermeiro;

    public Paciente() {
        endereco = new Endereco();
        responsavel = new Responsavel();
        enfermeiro = new Enfermeiro();
    }

    public String getLaudo() {
        return laudo;
    }

    public void setLaudo(String laudo) {
        this.laudo = laudo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
    }
}
