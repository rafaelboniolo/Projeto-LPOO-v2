/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.controller;

import java.util.List;
import utfpr.projetolpoo.model.dao.GenericDAO;
import utfpr.projetolpoo.model.vo.Enfermeiro;

/**
 *
 * @author ALUNO
 */
public class EnfermeiroController {
    private GenericDAO<Enfermeiro> genericDao;
    
    public EnfermeiroController()
    {
        genericDao = new GenericDAO<>();
    }
    
    public void gravar(Enfermeiro enf) {
        genericDao.insert(enf);
    }
    
    public void remover (Enfermeiro enf) {
        genericDao.remove(enf);
    }
    
    public void atualizar(Enfermeiro enf){
        genericDao.update(enf);
    }
    
    public List buscarTodos()
    {
        List<Enfermeiro> enfermeiros = genericDao.listAll(Enfermeiro.class);
        
        return enfermeiros;
    }
    
    public List buscarTodosInRange(long first, long max){
        List<Enfermeiro> enfermeiros = genericDao.listAll(Enfermeiro.class, first, max);
        
        return enfermeiros;
    }
    
    public Enfermeiro buscarUm(long id){
        Enfermeiro enfermeiro = genericDao.findOne(id, Enfermeiro.class);
        
        return enfermeiro;
    }
    
    public List listarConformeCampo(String string){
        List<Enfermeiro> enfermeiros = genericDao.refresh(Enfermeiro.class, string);
        
        return enfermeiros;
    }
}
