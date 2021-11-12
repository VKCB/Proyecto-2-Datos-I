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
public class Solucion {// clase solucion
    public static Double operacion(double op1, double op2, char operador){//  metodo que realiza las operaciones dependiendo del operador insertado
    switch(operador){
        case '+':
            return op1 + op2;//suma
            
        case '-':
            return op2 - op1;//resta
        case '*':
            return op1*op2;// multiplicacion
        case '/':
            return op2/op1;// division
            
    
    
    
    
    
    }
    return 0.0;
    }
   
    
    public static Double resolution(String expresion){// 
        Stack<Double> stack=new Stack<>();// stack de almacenamiento de los datos
        for(int i=0; i<expresion.length(); i++){// se recorre la expresion para la solucion
            char caracter=expresion.charAt(i);// se obtiene caracter por caracter
            if(Conversion_a_Postfijo.nivelJerarquico(caracter)>0){// se envia el String postfijo y se evalua si es mayor que cero es un operador
                double op1= stack.pop();// se obienen los datos para realizar la operacion los numeros
                double op2=stack.pop();
                double resultado=operacion(op1,op2,caracter);
                stack.push(resultado);// se agrega al stack el resultado pasra que este se operado con los otros numeros
            
            }
            else{
                stack.push((double)(caracter-'0'));// si el caracter es un numero se hace un casting para convertir el dato a double
            
            }
      
        }
    double resultadoN=stack.pop();// 
    return resultadoN;// se retorna el resultad
    }
    
}

