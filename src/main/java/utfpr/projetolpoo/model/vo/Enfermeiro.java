/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 *
 * @author ALUNO
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Enfermeiro extends Funcionario{
    
    @OneToMany(mappedBy = "enfermeiro")
    private List<Paciente> pacientes;
    
    private String nomeEnfermeiro;
    
    public Enfermeiro() {
        
    }
    
    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public String getNomeEnfermeiro() {
        return nomeEnfermeiro;
    }

    public void setNomeEnfermeiro(String nomeEnfermeiro) {
        this.nomeEnfermeiro = nomeEnfermeiro;
    }
    
    
    
}
