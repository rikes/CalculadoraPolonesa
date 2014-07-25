/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.Model;

/**
 *
 * @author Henrique
 */
public abstract class AbsOperador{
    
    private Operador proximo = null;
    public char meuOperador;
    
    public AbsOperador(char op){
        this.meuOperador = op;
    }
    
    
    public Operador getProximo(){
       return proximo;
    }
    

    public void setProximo(Operador o) {
        this.proximo = o;
    }
    
}
