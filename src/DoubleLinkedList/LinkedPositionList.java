package DoubleLinkedList;

public class LinkedPositionList<E> implements Iterable<E> {
    private DLinkedNode head;
    private int size;

    public int size () {
        return this.size;
    }
    
    public boolean isEmpty() {
        return (head == null);
    }
    
    public Position<E> add (E e) {
        DLinkedNode newNode = new DLinkedNode(e,null,null);
        
        if (this.isEmpty()) {
            this.head = newNode;
        }
        else {
            DLinkedNode aux = this.head;
            
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            
            aux.setNext(newNode);
        }

        this.size++;
        
        return (Position<E>) newNode;
    }
    
    public Position<E> addBefore (Position<E> pos, E e) {
        DLinkedNode<E> nextNode = (DLinkedNode<E>) pos;
        DLinkedNode<E> newNode = new DLinkedNode<E>(e, nextNode, nextNode.getPrev()); 
        
        if (this.head == nextNode) {
            this.head = newNode;
        }
        else {
            nextNode.getPrev().setNext(newNode);
        }
        
        nextNode.setPrev(newNode);
        
        this.size++;
        return (Position<E>) newNode;
    }
    
    
}
