/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.dao;

import java.util.List;

/**
 *
 * @author ALUNO
 */
public interface iGenericDAO<E> {
    
    boolean insert(E object);
    boolean update(E object);
    boolean remove(E object);
    List<E> listAll(E object);
    List<E> listAll(final long first,final long max);
    E findOne(String name, long id, Class classe);
}
