/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.controller;

import java.util.List;
import utfpr.projetolpoo.model.dao.GenericDAO;
import utfpr.projetolpoo.model.vo.Responsavel;

/**
 *
 * @author ALUNO
 */
public class ResponsavelController {
    private GenericDAO<Responsavel> genericDao;
    
    public ResponsavelController()
    {
        genericDao = new GenericDAO<>();
    }
    
    public void gravar(Responsavel responsavel) {
        genericDao.insert(responsavel);
    }
    
    public void remover (Responsavel responsavel) {
        genericDao.remove(responsavel);
    }
    
    public void atualizar(Responsavel responsavel){
        genericDao.update(responsavel);
    }
    
    public List buscarTodos()
    {
        List<Responsavel> responsaveis = genericDao.listAll(Responsavel.class);
        
        return responsaveis;
    }
    
    public List buscarTodosInRange(long first, long max){
        List<Responsavel> responsaveis = genericDao.listAll(Responsavel.class, first, max);
        
        return responsaveis;
    }
    
    public Responsavel buscarUm(long id){
        Responsavel responsaveis = genericDao.findOne(id, Responsavel.class);
        
        return responsaveis;
    }
    
    public List listarConformeCampo(String string){
        List<Responsavel> responsaveis = genericDao.refresh(Responsavel.class, string);
        
        return responsaveis;
    }
}
