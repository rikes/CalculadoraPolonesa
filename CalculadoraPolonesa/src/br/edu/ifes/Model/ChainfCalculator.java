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
public class ChainfCalculator {
    public AbsOperador operador;
    
    public ChainfCalculator(){
        operador = new Soma();
        AbsOperador m = new Multiplicacao();
        AbsOperador sub = new Subtracao();
        AbsOperador d = new Divisao();
        operador.setProximo(m);
        m.setProximo(sub);
        sub.setProximo(d);
    }
    
    public double baixa(double a, double b, char operacao){
        return operador.calcular(a, b, operacao);
    }
}
