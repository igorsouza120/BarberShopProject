/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.DAO.UsuarioDAO;
import Model.Usuario;
import controller.Helper.LoginHelper;
import view.Login;
import view.MenuPrincipal;

/**
 *
 * @author Igor Souza
 */
public class LoginController {

    private final Login View;
    private LoginHelper helper;

    public LoginController(Login View) { // vinculando LoginController a View de Login
        this.View = View;
        this.helper = new LoginHelper(View); // chamando o helper e passando essa view como parâmetro 
        
    }
    
    
    
    
    // Regras de negócio da tela de login serão criadas aqui.
    
    // função de login (entrar no sistema)
      public void entrarNoSistema(){
        // o sistema vai ter que pegar o usuário e senha que foi preenchido na view
        // pesquisar o usuário e senha digitado no banco de dados para verificar se confere
        // se não conferir mostra mensagem de usuario e senha invalido
        
        // pega um usuário da view
        Usuario usuario = helper.obterModelo();
        
        // pesquisa usuário no banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        if(usuarioAutenticado != null){ // se usuárioAUtenticado retornar NULL quer dizer que não encontrei usuário e senha iguais
            // navega para o menu principal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.View.dispose();
            
        } else{
            View.exibeMensagem("Usuário ou senha invalidos!");
        }
        
        
        
    }
    
      
     
    
    public void fizTarefa(){
        System.out.println("Busquei algo no banco de dados");
   
        this.View.exibeMensagem("Executei e fiz tarefa");
    }
    
   
        
    
    
    
}
