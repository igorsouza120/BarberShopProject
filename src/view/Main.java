/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;
import controller.AgendaController;

/**
 *
 * @author Igor Souza
 */
public class Main {

      
    public static void main(String[] args){
         String nome = "igor";
          System.out.println(nome);
          
          Servico servico = new Servico(1, "barba", 30); // criando um novo serviço
          
                      
          /*System.out.println(servico.getDescricao());
          System.out.println(servico.getValor());
         */
          
          
          Cliente cliente = new Cliente(0, "Igor", "Rua dos alfineiros", "00065-000");
          
          System.out.println(cliente.getNome());
          
         Usuario usuario = new Usuario(0, "Harry", "potter");
          
         System.out.println("Usuario: " + usuario.getNome() + "\nsenha: " + usuario.getSenha());
          
         
         Agendamento agendamento = new Agendamento(0, cliente, servico, 30, "30/12/2022 17:55");
         
        System.out.println("nome: " + agendamento.getCliente().getNome() + "\nData: " + agendamento.getData());
        
   
    }
    
}
