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
    
    boolean insert(E e);
    boolean update(E e);
    boolean remove(E e);
    List<E> listAll(E e);
    E findOne(E e);
}
