/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import utfpr.projetolpoo.model.vo.interfaces.iPagamento;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

/**
 *
 * @author NataN
 */
@Entity
public class Gerente extends Funcionario{
    
    @Transient
    private iPagamento pagamento;

    public Gerente() {
        //pagamento = new ;
    }

    public iPagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(iPagamento pagamento) {
        this.pagamento = pagamento;
    }
    
    
    
}
