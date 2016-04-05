package com.redeempresarial.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author Wesley Aleixo de Souza - Entrevista Rede Empresarial
 */

@Entity
public class Contato implements Serializable {

	private static final long serialVersionUID = -5716028965203479538L;
	
	@Id
    @GeneratedValue
    private long id;
    private String nome;
    private String email;
    private Integer telefone;

    public Contato() {
    }

    public Contato(long id, String nome, String email, Integer telefone) {
    	
        this.id = id;
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }    
    
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

}
