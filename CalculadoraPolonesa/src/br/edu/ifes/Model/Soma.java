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
public class Soma extends AbsOperador{
    public Soma(){
        super('+');
    }

    public int make(int a, int b, char operador) {
        if (operador == meuOperador) return (a+b);
        else return getProximo().make(a, b, operador);
    } 
}
