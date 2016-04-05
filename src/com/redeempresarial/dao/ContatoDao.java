package com.redeempresarial.dao;

import java.util.List;

import com.redeempresarial.model.Contato;

/**
 * 
 * @author Wesley Aleixo de Souza - Entrevista Rede Empresarial
 */

public interface ContatoDao {

    public void save(Contato contato);
    
    public Contato getContato(long id);
    
    public List<Contato> list();
    
    public void remove(Contato contato);
    
    public void update(Contato contato);

}
