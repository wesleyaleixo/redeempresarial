package com.redeempresarial.controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import com.redeempresarial.dao.ContatoDao;
import com.redeempresarial.dao.ContatoDaoImp;
import com.redeempresarial.model.Contato;

/**
 * 
 * @author Wesley Aleixo de Souza - Entrevista Rede Empresarial
 */

@ManagedBean
@SessionScoped
public class AgendaController {

    private Contato contato;
    private DataModel<Contato> listaContatos;

    public DataModel<Contato> getListarContatos() {
    	
        List<Contato> lista = new ContatoDaoImp().list();
        listaContatos = new ListDataModel<Contato>(lista);
    
        return listaContatos;
        
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public void prepararAdicionarContato(ActionEvent actionEvent){
        contato = new Contato();
    }

    public void prepararAlterarContato(ActionEvent actionEvent){
    	
        contato = (Contato)(listaContatos.getRowData());
    }

    public String excluirContato(){

        Contato contatoTemporario = (Contato)(listaContatos.getRowData());
        ContatoDao dao = new ContatoDaoImp();
        dao.remove(contatoTemporario);
        return "index";

    }

    public void adicionarContato(ActionEvent actionEvent){
    	
        ContatoDao dao = new ContatoDaoImp();
        dao.save(contato);
        
    }

    public void alterarContato(ActionEvent actionEvent){
    	
        ContatoDao dao = new ContatoDaoImp();
        dao.update(contato);

    }

}
