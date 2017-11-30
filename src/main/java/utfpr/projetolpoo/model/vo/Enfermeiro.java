/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author ALUNO
 */
@Entity
public class Enfermeiro extends Funcionario{
    @Id
    @GeneratedValue
    private long codEnfermeiro;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
    
    @OneToMany(mappedBy = "enfermeiro")
    private List<Paciente> pacientes;

    public Enfermeiro() {
        endereco = new Endereco();
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    
}
