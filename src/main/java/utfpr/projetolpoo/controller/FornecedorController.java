/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.controller;

import java.util.List;
import utfpr.projetolpoo.model.dao.GenericDAO;
import utfpr.projetolpoo.model.vo.Fornecedor;

/**
 *
 * @author ALUNO
 */
public class FornecedorController {
    private GenericDAO<Fornecedor> genericDao;
    
    public FornecedorController()
    {
        genericDao = new GenericDAO<>();
    }
    
    public void gravar(Fornecedor fornecedor) {
        genericDao.insert(fornecedor);
    }
    
    public void remover (Fornecedor fornecedor) {
        genericDao.remove(fornecedor);
    }
    
    public void atualizar(Fornecedor fornecedor){
        genericDao.update(fornecedor);
    }
    
    public List buscarTodos()
    {
        List<Fornecedor> fornecedores = genericDao.listAll(Fornecedor.class);
        
        return fornecedores;
    }
    
    public List buscarTodosInRange(long first, long max){
        List<Fornecedor> fornecedores = genericDao.listAll(Fornecedor.class, first, max);
        
        return fornecedores;
    }
    
    public Fornecedor buscarUm(long id){
        Fornecedor fornecedores = genericDao.findOne(id, Fornecedor.class);
        
        return fornecedores;
    }
    
    /*public List listarConformeCampo(String string){
        List<Fornecedor> fornecedores = genericDao.refresh(Fornecedor.class, string);
        
        return fornecedores;
    }*/
}
