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
public interface Operador {
    public int make(int a, int b, char operador);
    
    public void setProximo(Operador op);
    public Operador getProximo();
}
