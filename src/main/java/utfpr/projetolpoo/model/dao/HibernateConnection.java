/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.projetolpoo.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.HibernateException;

/**
 *
 * @author ALUNO
 */
public class HibernateConnection {
    
    private static EntityManagerFactory factory;
    private volatile static EntityManager  manager;
    
    //public static Connection connection = null; // manages connection
 
    private HibernateConnection() { }

    public static EntityManager getInstance() {
            if (manager == null) {
                    synchronized (HibernateConnection.class) {
                            if (manager == null) {
                                  
                                try {
                                    factory = Persistence.createEntityManagerFactory("ClinicaMedica");
                                    manager = factory.createEntityManager ();
                                } catch(HibernateException error)
                                {
                                    System.err.println(error.getMessage());
                                }
                               
                            }
                    }
            }
            return manager;
    }
    
    public static void close(){
        manager.close();
        factory.close();
        
    }
}
