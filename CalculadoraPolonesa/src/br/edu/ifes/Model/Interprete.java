/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.Model;

import br.edu.ifes.Model.ChainfCalculator;
import java.util.LinkedList;

/**
 *
 * @author Henrique
 */
public class Interprete {
    private LinkedList<Double> monte = new LinkedList<Double>();
    private ChainfCalculator calculator = new ChainfCalculator();
    private final String operators = "+-/*";

    
    public void imprimirMonte(){
        for (Double monte1 : monte) {
            System.out.println(monte1);
        }
    }
    
    public boolean isOperator(char c){
        for (int i=0; i<operators.length(); i++){
            if (operators.charAt(i) == c) return true;
        }
        return false;
    }
    
    
    public Double solve(String f){
        String buffer = "";
        for (int i=0; i<f.length(); i++){
            
            if (isOperator(f.charAt(i))){
            	double r = calculator.baixa(monte.removeFirst(), monte.removeFirst(), f.charAt(i));
                monte.add(r);
            }
            else if (f.charAt(i) == ' '){
            	if (!buffer.isEmpty()) monte.add(Double.parseDouble(buffer));
                buffer = "";
            }
            else buffer+=f.charAt(i);
        }
        
        return monte.removeFirst();
    }
}
