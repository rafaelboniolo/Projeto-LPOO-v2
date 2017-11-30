/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import utfpr.projetolpoo.model.vo.interfaces.iPagamento;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author NataN
 */
@Entity
public class Gerente extends Funcionario{
    
    @OneToMany
    private Funcionario funcionario;
    
    private iPagamento pagamento;

    public Gerente() {
        funcionario = new Enfermeiro();
        //pagamento = new ;
    }
    
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
}
