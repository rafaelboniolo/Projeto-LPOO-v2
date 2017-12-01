/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.vo;

import utfpr.projetolpoo.model.vo.interfaces.iPagamento;

/**
 *
 * @author NataN
 */
public class Aprazo{

    iPagamento pagamento;

    public Aprazo(String tipo) {
        if(tipo.equals("Dinheiro")){
            pagamento = new Dinheiro();
        }else if(tipo.equals("Cartao")){
            pagamento = new Cartao();
        }else if(tipo.equals("Boleto")){
            pagamento = new Boleto();
        }
    }

    
    
}
