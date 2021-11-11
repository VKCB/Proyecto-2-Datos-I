/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datos1proyecto2;

/**
 *
 * @author Familia Rayo
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Stack;

/**
 *
 * @author Familia Rayo
 */
public class Solucion {
    public static Double operacion(double op1, double op2, char operador){
    switch(operador){
        case '+':
            return op1 + op2;
            
        case '-':
            return op2 - op1;
        case '*':
            return op1*op2;
        case '/':
            return op2/op1;
            
    
    
    
    
    
    }
    return 0.0;
    }
   
    
    public static Double resolution(String expresion){
        Stack<Double> stack=new Stack<>();
        for(int i=0; i<expresion.length(); i++){
            char caracter=expresion.charAt(i);
            if(Conversion_a_Postfijo.nivelJerarquico(caracter)>0){
                double op1= stack.pop();
                double op2=stack.pop();
                double resultado=operacion(op1,op2,caracter);
                stack.push(resultado);
            
            }
            else{
                stack.push((double)(caracter-'0'));
            
            }
      
        }
    double resultadoN=stack.pop();
    return resultadoN;
    }
    
}

