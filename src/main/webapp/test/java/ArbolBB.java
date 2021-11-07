
/**
 *
 * @author Valerine
 */
/**
 * Clase Arbol binario de búsqueda
 * @param <T>
 */
/**
 * Clase Arbol binario de búsqueda
 * @param <T>
 */
public class ArbolBB<T extends Comparable<? super T>>
{

    private BinaryNode<T> root;
    private boolean removalSuccesful;


    public ArbolBB()
    {
        this.root = null;
    }


    /**
     * Verifica si el nodo esta vacío
     * @return Boolean
     */
    public boolean isEmpty()
    {
        return (this.root == null);
    }


    /**
     * Encuentra un valor dentro del arbol binario de busqueda.
     * Va comparando si es valor buscado es menor o mayor que el
     * nodo raíz en donde esta posicionado.
     * @param elem: es de tipo genérico
     * @return el nodo encontrado
     */
    public T find(T elem)
    {
        BinaryNode found = find(this.root, elem);
        return (found == null) ? null : (T) found.getElement();
    }


    private BinaryNode find(BinaryNode start, T elem)
    {
        if (start == null)
        {
            return null;
        }

        int comparison = start.getElement().compareTo(elem);


        if (comparison > 0)
        {
            return find(start.getLeft(), elem);
        }
        else if (comparison < 0)
        {
            return find(start.getRight(), elem);
        }
        else
        {
            return start;
        }
    }


    /**
     * Inserta un nuevo elemento al arbol
     * @param elem: nuevo elemento
     * @return boolean: si lo inserto o ya existia (False)
     */
    public boolean insert(T elem)
    {
        return insert(this.root, elem);
    }


    private boolean insert(BinaryNode start, T elem)
    {
        if (start == null)
        {
            this.root = new BinaryNode<>(elem, null, null);
            return true;
        }

        int comparison = start.getElement().compareTo(elem);

        if (comparison > 0)
        {
            if (start.getLeft() == null)
            {
                start.setLeft(new BinaryNode<>(elem, null, null));
                return true;
            }

            return insert(start.getLeft(), elem);
        }
        else if (comparison < 0)
        {
            if (start.getRight() == null)
            {
                start.setRight(new BinaryNode<>(elem, null, null));
                return true;
            }

            return insert(start.getRight(), elem);
        }
        else
        {
            return false;
        }
    }


    /**
     * Borra un elemento del arbol
     * @param elem: elemento que se quiere borrar
     * @return boolean
     */
    public boolean remove(T elem)
    {
        removalSuccesful = true;
        this.root = remove(root, elem);
        return removalSuccesful;
    }


    private BinaryNode<T> remove(BinaryNode<T> start, T elem)
    {
        if (start == null)
        {
            removalSuccesful = false;
            return null;
        }

        int comparison = start.getElement().compareTo(elem);

        if (comparison > 0)
        {
            start.setLeft(remove(start.getLeft(), elem));
        }
        else if (comparison < 0)
        {
            start.setRight(remove(start.getRight(), elem));
        }
        else
        {
            if (start.getLeft() != null && start.getRight() != null)
            {
                BinaryNode<T> left = start.getLeft();
                BinaryNode<T> right = start.getRight();

                start = removeMin(start.getRight(), start);

                BinaryNode minRight = start.getRight();

                start.setLeft(left);
                start.setRight(right);

                if (start.getRight().getElement() == start.getElement())
                {
                    start.setRight(minRight);
                }
            }
            else if (start.getLeft() == null && start.getRight() == null)
            {
                start = null;
            }
            else if (start.getLeft() != null)
            {
                start = start.getLeft();
            }
            else
            {
                start = start.getRight();
            }
        }

        return start;
    }


    /**
     * Borra el elemento cuya llave sea la menor
     * @param start: nodo raíz
     * @param parent: nodo que se anda buscando
     * @return min
     */
    private BinaryNode<T> removeMin(BinaryNode<T> start, BinaryNode parent)
    {
        if (start == null)
        {
            return null;
        }

        if (start.getLeft() == null)
        {

            if (parent != this.root)
            {
                parent.setLeft(start.getRight());
            }

            return start;
        }

        return removeMin(start.getLeft(), start);
    }


    /**
     * Deja vacío el árbol
     */
    public void clear()
    {
        this.root = null;
    }


    @SuppressWarnings("unchecked")
    public boolean equals(Object other)
    {
        if (other instanceof ArbolBB)
        {
            try
            {
                ArbolBB<T> compare = (ArbolBB<T>) other;
                return equals(this.root, compare.root);
            }
            catch (Exception e)
            {
                return false;
            }
        }

        return false;
    }


    /**
     * Compara si dos nodos son iguales
     * @param start1: nodo 1
     * @param start2: nodo 2
     * @return boolean
     */
    private boolean equals(BinaryNode<T> start1, BinaryNode<T> start2)
    {
        if (start1 == null && start2 == null)
        {
            return true;
        }
        else if (start1 == null || start2 == null)
        {
            return false;
        }

        boolean leftSame = equals(start1.getLeft(), start2.getLeft());

        boolean currentSame = start1.getElement().equals(start2.getElement());

        boolean rightSame = equals(start1.getRight(), start2.getRight());

        return (leftSame && currentSame && rightSame);
    }


    /**
     * Imprime el arbol
     */
    public void print()
    {
        print(this.root);
    }


    private void print(BinaryNode start)
    {
        if (start != null)
        {
            print(start.getLeft());
            System.out.println(start.getElement());
            print(start.getRight());
        }
    }
}