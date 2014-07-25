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
    public Operador operador;
    public ChainfCalculator(){
        operador = new Somar();
        operador m = new Multiplicar();
        operador s = new Subtrair();
        operador d = new Dividir();
        operador.setProximo(m);
        m.setProximo(s);
        s.setProximo(d);
    }
    
    public int dropInPipeline(int a, int b, char operacao){
        return pipeline.make(a, b, operacao);
    }
}
