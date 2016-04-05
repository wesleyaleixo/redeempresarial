package com.redeempresarial.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.redeempresarial.model.Contato;

/**
 * 
 * @author Wesley Aleixo de Souza - Entrevista Rede Empresarial
 */

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    private HibernateUtil() {
        
    }

    public static SessionFactory getSessionFactory() {

        if (sessionFactory == null) {
            try {
            	
                AnnotationConfiguration ac = new AnnotationConfiguration();
                ac.addAnnotatedClass(Contato.class);
                sessionFactory = ac.configure().buildSessionFactory();                

            } catch (Throwable ex) {

                System.err.println("Erro na criação, SessionFactory." + ex);
                throw new ExceptionInInitializerError(ex);
                
            }

            return sessionFactory;

        } else {
        	
            return sessionFactory;
        }
        
    }

    public static void main(String[] args) {
    	
        HibernateUtil.getSessionFactory();
    }

}
