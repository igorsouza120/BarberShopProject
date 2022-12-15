/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Igor Souza
 */
public class Cliente extends Pessoa { // extends é o comando para herança
    
    // os demais atributos virão por herança da classe Pessoa.
    private String endereco;
    private String cep;

    public Cliente(int id,  String nome, char sexo,String nascimento, String telefone, String email, String rg, String endereco, String cep) {
        super(id, nome, sexo, nascimento, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
        
       
    }

    public Cliente(int id, String nome, String endereco, String cep) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }
    
       
    
        //getter e setters
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    
    @Override
    public String toString() { //sobrescrevendo o método toString para pegar apenas o nome e usar no jComboBox
               return getNome();
    }


    
        
    
    
    
    
    
    
    
    
    
}
