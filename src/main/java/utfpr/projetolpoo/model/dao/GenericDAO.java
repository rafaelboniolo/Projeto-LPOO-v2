/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ALUNO
 */
public class GenericDAO<E> implements iGenericDAO<E>{

    EntityManager manager = HibernateConnection.getInstance();
    
    public void commit()
    {
        manager.getTransaction().commit();
    }

    @Override
    public Boolean insert(E object) {
        manager.getTransaction().begin();
        manager.persist(object);
        manager.getTransaction().commit();
        System.out.println(object.getClass().getSimpleName() + " salvo som sucesso!");
        return true;
    }

    @Override
    public Boolean update(E object) {
        manager.getTransaction().begin();
        manager.persist(object);
        manager.getTransaction().commit();
        System.out.println(object.getClass().getSimpleName() + " atualizado som sucesso!");
        return true;
    }

    @Override
    public Boolean remove(E object) {
        manager.getTransaction().begin();
        manager.remove(object);
        manager.getTransaction().commit();
        System.out.println(object.getClass().getSimpleName() + " excluído som sucesso!");
        return true;
    }

    @Override
    public List<E> listAll(E object) {
        String jpql = " SELECT e FROM " + object.getTypeName() + " e";
        Query query = manager.createQuery(jpql);
        List<E> objects = query.getResultList();
        return objects;
    }

    @Override
    public List<E> listAll(E object,Long first, Long max) {
        //SELECT campos FROM tabela WHERE campo BETWEEN inicio_intervalo AND fim_intervalo;
        String jpql = " SELECT e FROM " + object.getTypeName() + " e WHERE e.id BETWEEN "+ first +" AND " + max;
        Query query = manager.createQuery(jpql);
        List<E> objects = query.getResultList();
        return objects;
    }

    @Override
    public E findOne(Long id, E object) {
        String jpql = " SELECT e FROM " + object.getTypeName() + " e WHERE e.id = " + id;
        Query query = manager.createQuery (jpql);
        Object obj = query.getSingleResult();
        return (E) obj;
    }

    @Override
    public List<E> refresh(E object, String string) {
        //"SELECT * FROM tb_cliente c WHERE c.CLI_CPF LIKE ? OR c.CLI_NOME LIKE ?
        String jpql = "SELECT e FROM " + object.getTypeName() + " e WHERE e.nome LIKE %" + string +" OR e.cpf LIKE %" + string;
        Query query = manager.createQuery(jpql);
        List<E> objects = query.getResultList();
        return objects;
    }
    
}
