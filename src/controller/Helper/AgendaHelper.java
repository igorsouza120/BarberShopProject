/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import view.Agenda;

/**
 *
 * @author Igor Souza
 */
public class AgendaHelper implements iHelper{

    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }
    
    
    // função para preencher tabela na agenda

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
         
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel(); // converte a tabela para o tipo DefaultTableModel
        
        tableModel.setNumRows(0);
        
        // Percorrer a lista preenchendo o table model.
        for (Agendamento agendamento : agendamentos) { // percorre os agendamentos, ao achar um agendamento preenche com as infos abaixo
            
            tableModel.addRow(new Object[]{// cria uma nova linha e preenche as colunas com as informações abaixo.
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()                
                
            });
            
            
            
        }        
} // fim de preenchertabela
    
    public void preencherClientes(ArrayList<Cliente> clientes){
       
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxCliente().getModel();
        
        for (Cliente cliente : clientes) {
            
            comboBoxModel.addElement(cliente); // adicionando o elemento no comboBox passando objeto diretamente, pois sobrescrevemos o toString para retornar o getNome().
            
        }
        
    
 
    }

    
    public void preencherServicos(ArrayList<Servico> servicos) {

        DefaultComboBoxModel comboBoxModelServicos = (DefaultComboBoxModel) view.getjComboBoxServiço().getModel();
        
        for (Servico servico : servicos) {
           
            comboBoxModelServicos.addElement(servico);
            
        }

    }
    
    // seleciona o cliente que está selecionado no jComboBox
    public Cliente obterCliente(){    
        return (Cliente) view.getjComboBoxCliente().getSelectedItem();
    }
    
    
    // seleciona o serviço que está no jComboBoxServiço
    public Servico obterServico() {
        return (Servico) view.getjComboBoxServiço().getSelectedItem(); 
        
            }

    
    // método para colocar o valor do serviço de acordo com o que está selecionado no campo de serviço
    public void setarValor(float valor) {
        view.getTxtValor().setText(valor + "");
    
    
    }

    
    // pego as informações da tela e crio um novo agendamento com o objeto agendamento.
    @Override
    public Agendamento obterModelo() {
     
       String idString  = view.getTxtID().getText();
       int id = Integer.parseInt(idString); // pego o ID que está no txtView
       Cliente cliente = obterCliente(); // obtem quem é o cliente selecionado
       Servico servico = obterServico(); // obtem o serviço selecionado
       String valorString = view.getTxtValor().getText(); // obtem o valor digitado no campo em forma de string
       float valor = Float.parseFloat(valorString); // converte o valor de String para Float
       String data = view.getTxtData().getText(); // obtém a data do campo de texto
       String hora = view.getTxtHora().getText(); // obtém a hora do campo de texto
       String dataHora = data + " " + hora; // junta a data e hora obtida anteriormente.
       String observacao = view.getjTextAreaObservacao().getText(); // obtém o campo observação
       
       
       Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora, observacao);
        
       return agendamento;
    }

    @Override
    public void limparTela() {
        view.getTxtID().setText("0");
        view.getTxtData().setText("");
        view.getTxtHora().setText("");
        view.getjTextAreaObservacao().setText("");
            
    }
    


 
    
}
