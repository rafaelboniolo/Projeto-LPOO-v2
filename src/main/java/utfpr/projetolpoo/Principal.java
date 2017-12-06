/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo;

import javax.persistence.EntityManager;
import utfpr.projetolpoo.controller.EnfermeiroController;
import utfpr.projetolpoo.controller.SistemaController;
import utfpr.projetolpoo.model.dao.HibernateConnection;
import utfpr.projetolpoo.model.vo.Enfermeiro;

/**
 *
 * @author ALUNO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SistemaController sistema = new SistemaController();
        
        sistema.start();
        
        EnfermeiroController enfermeiroEnf = new EnfermeiroController();
        
        Enfermeiro enf = new Enfermeiro();
        
        enf.setCpf("069.870.619-63");
        enf.setNome("Natanael");
        enf.setIdade(19);
        enf.setCel("(45)99811-8261");
        enf.setPis(51515545);
        enf.setRg("10.705.132-65");
        enf.setSalario(1500);
        enf.setTel("(45)3096-8860");
        
        enfermeiroEnf.gravar(enf);
        
    }
    
}
