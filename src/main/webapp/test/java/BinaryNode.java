/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valerine
 */
/**
 * Clase nodo para el arbol de busqueda binaria
 * @param <T>: elemento
 */
public class BinaryNode<T extends Comparable>
{

    private T element;
    private BinaryNode<T> left;
    private BinaryNode<T> right;


    public BinaryNode(T elem)
    {
        this.element = elem;
        this.left = null;
        this.right = null;
    }


    public BinaryNode(T elem, BinaryNode lt, BinaryNode rt)
    {
        this.element = elem;
        this.left = lt;
        this.right = rt;
    }

    public void setRight(BinaryNode<T> right) {
        this.right = right;
    }

    public void setLeft(BinaryNode<T> left) {
        this.left = left;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public BinaryNode<T> getLeft() {
        return this.left;
    }

    public BinaryNode<T> getRight() {
        return this.right;
    }

    public T getElement() {
        return this.element;
    }
}