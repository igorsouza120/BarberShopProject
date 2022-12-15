/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Helper;

import Model.Usuario;
import view.Login;

/**
 *
 * @author Igor Souza
 */
public class LoginHelper implements iHelper {
    
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    
    
    //função para pegar os valores nos campos usuario e senha
    public Usuario obterModelo(){
        
        String nome = view.getTxtUsuario().getText(); // pega o valor de usuário do campo de texto
        String senha = view.getTxtSenha().getText();  // pegar o valor de senha do campo de senha
        
       Usuario modelo = new Usuario(0, nome, senha);
        
        return modelo; //retorna o tipo usuário, que é um objeto com ID, Nome e Senha.
        
    }
    
    
    //função para colocar valores nos campos usuario e senha
    public void setarModelo(Usuario modelo){ 
        String nome = modelo.getNome(); 
        String senha = modelo.getSenha();
        
        view.getTxtUsuario().setText(nome);
        view.getTxtSenha().setText(senha);
    }
    
    
    // limpa os valores dos campos usuário e senha
    public void limparTela(){
        view.getTxtUsuario().setText("");
        view.getTxtSenha().setText("");
    }
    
    
    
    
    
}
