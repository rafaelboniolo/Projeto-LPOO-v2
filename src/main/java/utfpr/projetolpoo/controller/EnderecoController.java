/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.controller;

import java.util.List;
import utfpr.projetolpoo.model.dao.GenericDAO;
import utfpr.projetolpoo.model.vo.Endereco;

/**
 *
 * @author ALUNO
 */
public class EnderecoController {
    private GenericDAO<Endereco> genericDao;
    
    public EnderecoController()
    {
        genericDao = new GenericDAO<>();
    }
    
    public void gravar(Endereco end) {
        genericDao.insert(end);
    }
    
    public void remover (Endereco end) {
        genericDao.remove(end);
    }
    
    public void atualizar(Endereco end){
        genericDao.update(end);
    }
    
    public List buscarTodos()
    {
        List<Endereco> enderecos = genericDao.listAll(Endereco.class);
        
        return enderecos;
    }
    
    public List buscarTodosInRange(long first, long max){
        List<Endereco> enderecos = genericDao.listAll(Endereco.class, first, max);
        
        return enderecos;
    }
    
    public Endereco buscarUm(long id){
        Endereco enderecos = genericDao.findOne(id, Endereco.class);
        
        return enderecos;
    }
    
    /*public List listarConformeCampo(String string){
        List<Endereco> enderecos = genericDao.refresh(Endereco.class, string);
        
        return enderecos;
    }*/
}
