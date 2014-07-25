/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.Model;

import java.util.LinkedList;

/**
 *
 * @author Henrique
 */
public class Interprete {
    private LinkedList<Integer> monte = new LinkedList<Integer>();
    private ChainfCalculator pipeline = new ChainfCalculator();
    private String operators = "+-/*";

    
    public void imprimirMonte(){
        for (int i=0; i<monte.size(); i++) System.out.println(monte.get(i));
    }
    
    public boolean isOperator(char c){
        for (int i=0; i<operators.length(); i++){
            if (operators.charAt(i) == c) return true;
        }
        return false;
    }
    
    
    public int solve(String f){
        String buffer = "";
        for (int i=0; i<f.length(); i++){
            
            if (isOperator(f.charAt(i))){
            	int r = pipeline.dropInPipeline(monte.removeFirst(), monte.removeFirst(), f.charAt(i));
                monte.add(r);
            }
            
            else if (f.charAt(i) == ' '){
            	if (!buffer.isEmpty()) monte.add(Integer.parseInt(buffer));
                buffer = "";
            }
            
            else buffer+=f.charAt(i);
        }
        
        return monte.removeFirst();
    }
}
