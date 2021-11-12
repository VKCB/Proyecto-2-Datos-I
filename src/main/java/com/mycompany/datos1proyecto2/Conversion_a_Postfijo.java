/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *////
package com.mycompany.datos1proyecto2;
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
public class Conversion_a_Postfijo {
    
    
    
    
    
  public static String conversion(String expresionMatematica){// metodo statico para convetri de infija a postfija
        String expresionPost="";// uso de de una variable para realizar la convercion
        Stack<Character> stack=new Stack<>();// se contruye una pila de caracter
        for(int i=0; i< expresionMatematica.length(); i++){// se recorre la expresion a convertir que entra como parametro del metodo conversion
            char caracter=expresionMatematica.charAt(i); // en una varible tipo char se almacena cada caracter que se recorre de la expresion original esto para analizar si hay paraentesis o numeros y darle un nivel jerarquico
       
            
            //evalucacion de cada carater de la expresion
        if (nivelJerarquico(caracter)>0){ // si caracter es mayor que cero entonces quiere decir que puede ser un operador + o - o puede ser un * o /
            while(stack.isEmpty()==false && nivelJerarquico(stack.peek())>=nivelJerarquico(caracter)){
                 expresionPost+=stack.pop();
            
            }// fin del while
               
             stack.push(caracter);// se agrega el caracter al stack
            
            }// fin del if
          
        
        
        
        
        
        else if(caracter==')'){ // quita los parentesis de cierre
            char aux=stack.pop();
            while(aux!='('){
                expresionPost+=aux; /// quita los parentesis de abertura
                aux=stack.pop();
               
            }// fin del while
        
           
        }// fin del else if
        else if(caracter=='('){
            stack.push(caracter);
           
        
        
        }// fin del else if
        else{
        expresionPost+=caracter;
        
        
        }
        
    
    
   
    }// fin del for
        for(int i=0; i <stack.size(); i++){
            expresionPost+=stack.pop();
        
        
        }
        return expresionPost;
    }
   
    
    
    //metodo para ver el nivel de jereraquia de los operadores
  public  static int nivelJerarquico(char operador){
        switch(operador){// los operadores de suma y resta tiene un valor jerarquico de 1
        case '+':
        case '-':
            return 1;
            
        case '*':
        case '/':
            return 2;// tiene un valor de dos en el rango jerarquico tiene mas valor estas operaciones
   }
    return -1;
    
    }
    
    
    
    

  


}
/////