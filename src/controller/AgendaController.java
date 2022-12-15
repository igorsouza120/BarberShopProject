/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import controller.Helper.AgendaHelper;
import java.util.ArrayList;
import view.Agenda;

/**
 *
 * @author Igor Souza
 */
public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;


    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);

    }
    
    
    
    public void atualizaTabela(){
        
        // buscar uma lista com os agendamentos do banco de dados.
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        // Exibir essa lista na view
         
        helper.preencherTabela(agendamentos);
        
        
        }
    
    
    public void atualizaCliente(){
       // buscar clientes no banco e exibir 
       ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        //exibir clientes no combobox clientes
        
        helper.preencherClientes(clientes);
        
        
    }
    
    
    public void atualizaServico(){
        //buscar clientes no banco e exibir
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        
        //exibir clientes no comboBox Servicos
        helper.preencherServicos(servicos);
        
    }
    
        
    public void atualizaValor(){
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
        
        
    }
    
        public void agendar(){
        // buscar objeto agendamento da tela.
        Agendamento agendamento = helper.obterModelo();
        // salvar objeto o banco de dados.
        new AgendamentoDAO().insert(agendamento);
        
        // inserir elemento na Tabela
        atualizaTabela();
        helper.limparTela();
        
          
     }
    
        
    
    
}
