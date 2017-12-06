/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import utfpr.projetolpoo.model.vo.abstrato.Pessoa;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author User
 */
@Entity
public class Paciente extends Pessoa{
    
    private String laudo;
    
    @ManyToOne
    private Responsavel responsavel;
    
    @ManyToOne
    private Enfermeiro enfermeiro;

    public Paciente() {
        responsavel = new Responsavel();
        enfermeiro = new Enfermeiro();
    }

    public String getLaudo() {
        return laudo;
    }

    public void setLaudo(String laudo) {
        this.laudo = laudo;
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
