/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.controller;

import java.util.List;
import utfpr.projetolpoo.model.dao.GenericDAO;
import utfpr.projetolpoo.model.vo.Estoque;

/**
 *
 * @author ALUNO
 */
public class EstoqueController {
    private GenericDAO<Estoque> genericDao;
    
    public EstoqueController()
    {
        genericDao = new GenericDAO<>();
    }
    
    public void gravar(Estoque estoque) {
        genericDao.insert(estoque);
    }
    
    public void remover (Estoque estoque) {
        genericDao.remove(estoque);
    }
    
    public void atualizar(Estoque estoque){
        genericDao.update(estoque);
    }
    
    public List buscarTodos()
    {
        List<Estoque> estoques = genericDao.listAll(Estoque.class);
        
        return estoques;
    }
    
    public List buscarTodosInRange(long first, long max){
        List<Estoque> estoques = genericDao.listAll(Estoque.class, first, max);
        
        return estoques;
    }
    
    public Estoque buscarUm(long id){
        Estoque estoques = genericDao.findOne(id, Estoque.class);
        
        return estoques;
    }
    
    public List listarConformeCampo(String string){
        List<Estoque> estoques = genericDao.refresh(Estoque.class, string);
        
        return estoques;
    }
}
