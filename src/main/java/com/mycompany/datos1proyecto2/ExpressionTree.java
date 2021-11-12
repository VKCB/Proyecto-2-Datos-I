/*
 *@author Valerine
 */
package com.mycompany.datos1proyecto2;
import java.util.Stack;






// Java program to construct an expression tree
 

 
// Java program for expression tree
class Node {// clase nodo
 
    char value;// valor del nodo que va ser un tipo char
    Node left, right;// variables para los nodos izquierdo left y derecho right
 
    Node(char item) {//constructor de el nodo le llega un parametro tipo char
        value = item; 
        left = right = null;// el nodo izquierdo como el dercho no tienen ningun valor
    }
}
 
public class ExpressionTree {
 
    // A utility function to check if 'c'
    // is an operator
    
    String resultado;
    public ExpressionTree(){
        resultado="";


}
 
    boolean isOperator(char c) {// metodo que permite saber si hay operadores en la expresion 
        if (c == '+' || c == '-'
                || c == '*' || c == '/'
                || c == '^') {
            return true;// retorna true en el caso que se encuentre los operadores
        }
        return false;//false en el caso de no encontrarse
    }
 
    // Utility function to do inorder traversal
    void recorrer(Node t) {
        
        if (t != null) {
            recorrer(t.left);
            resultado+=String.valueOf(t.value);
            recorrer(t.right);
        }
    }
    String get_datos(){// se obtiene los datos de la operacion
    
    return resultado;
    }
 
    // Returns root of constructed tree for given
    // postfix expression
    Node constructTree(char postfix[]) {// metodo que devuelve un objeto de tipo nodo y tiene como parametro un array de tipo char
        Stack<Node> stack = new Stack<Node>(); // se crea una pila para almacenar datos y quitar
        Node t, t1, t2;// creacion de variables nodos 
 
        // Traverse through every character of
        // input expression
        for (int i = 0; i < postfix.length; i++) { // se recorre la expresion post fija
 
            // If operand, simply push into stack
            if (!isOperator(postfix[i])) {//  si el char a evalucar no es un operador
                t = new Node(postfix[i]);// se crea un nodo con el valor de ese caracter numerico
                stack.push(t);// y se agrega al stack el nodo
            } else // esoperator
            {
                t = new Node(postfix[i]);
 
                // Pop two top nodes
                // Store top
                t1 = stack.pop();      // Remove top
                t2 = stack.pop();
 
                //  make them children
                t.right = t1;
                t.left = t2;
 
                // System.out.println(t1 + "" + t2);
                // Add this subexpression to stack
                stack.push(t);
            }
        }
 
        //  only element will be root of expression
        // tree
        t = stack.peek();
        stack.pop();
 
        return t;
    }
 
    public static void main(String args[]) {
 
        ExpressionTree et = new ExpressionTree();
        String postfix = "1089*-5*";
        char[] charArray = postfix.toCharArray();
        Node root = et.constructTree(charArray);
        System.out.println("infix expression is");
        et.recorrer(root);
        System.out.println(et.get_datos());
 
    }
    
}
 
// This code has been contributed by Mayank Jaiswal
