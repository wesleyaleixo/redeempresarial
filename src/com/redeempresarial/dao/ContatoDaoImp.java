package com.redeempresarial.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.redeempresarial.model.Contato;
import com.redeempresarial.utils.HibernateUtil;

/**
 * 
 * @author Wesley Aleixo de Souza - Entrevista Rede Empresarial
 */

@SuppressWarnings("unchecked")
public class ContatoDaoImp implements ContatoDao {

    public void save(Contato contato) {
    	
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sessao.beginTransaction();
        sessao.save(contato);
        t.commit();
        
        sessao.close();
        
    }
    
    public Contato getContato(long id) {
    	
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        return (Contato) sessao.load(Contato.class, id);
        
    }
    
	public List<Contato> list() {
    	
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sessao.beginTransaction();
        List<Contato> lista = sessao.createQuery("from Contato").list();
        t.commit();
        
        return lista;
        
    }
    
    public void remove(Contato contato) {
    	
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sessao.beginTransaction();
        sessao.delete(contato);
        t.commit();
        
        sessao.close();
        
    }
    
    public void update(Contato contato) {
    	
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sessao.beginTransaction();
        sessao.update(contato);
        t.commit();
        
        sessao.close();
        
    }
}
