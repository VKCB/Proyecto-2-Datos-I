/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datos1proyecto2;

 
import javax.swing.JOptionPane;
public class PruebaRun {
    
    public static void main(String args[]){
        //String expresion, 
        String resultado;
        double solucion;
        
        //expresion=JOptionPane.showInputDialog("introduzca la expresion matematica");
        resultado="15*8/4";
        solucion=Solucion.resolution(resultado);
        JOptionPane.showMessageDialog(null, resultado);
         JOptionPane.showMessageDialog(null, solucion);
        
        
        
        
    
        
    
    }    
}

