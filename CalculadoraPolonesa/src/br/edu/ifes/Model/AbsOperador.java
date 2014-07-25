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
    
    private AbsOperador proximo = null;
    public char meuOperador;
    
    public AbsOperador(char op){
        this.meuOperador = op;
    }
   
    public AbsOperador getProximo(){
       return proximo;
    }
    
    public void setProximo(AbsOperador o) {
        this.proximo = o;
    }
    
    public abstract double calcular(double a, double b, char operador);
}
