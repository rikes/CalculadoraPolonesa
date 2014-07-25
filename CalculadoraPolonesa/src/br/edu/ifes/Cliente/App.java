/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.Cliente;

import br.edu.ifes.Model.Interprete;

/**
 *
 * @author Henrique
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        
        Interprete interpretador = new Interprete();        
        System.out.println(interpretador.solve("21 1 * 3 + 10 / "));
        
        
    }
    
}
