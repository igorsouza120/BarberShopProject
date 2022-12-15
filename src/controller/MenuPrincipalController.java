/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.Agenda;
import view.MenuPrincipal;

/**
 *
 * @author Igor Souza
 */
public class MenuPrincipalController {
    
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    // método para navegar para agenda através do MenuPrincipal
    public void navegarParaAgenda(){
        
        Agenda agenda = new Agenda();
        
        agenda.setVisible(true);
        
    }  
    
    
    
    
    
}
