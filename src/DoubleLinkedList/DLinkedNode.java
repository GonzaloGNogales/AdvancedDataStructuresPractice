package DoubleLinkedList;

public class DLinkedNode<E> {
    private DLinkedNode next;
    private DLinkedNode prev;
    private E element;
   
    public DLinkedNode (DLinkedNode n) {
        this.element = (E) n.getElement();
        this.next = n.getNext();
    } 
    
    public DLinkedNode (E value, DLinkedNode nxt, DLinkedNode pre) {
        this.element = value;
        this.next = nxt;
        this.prev = pre;
    }
    
    
    public void setElement(E e) {
        this.element = e;
    }
    
    public void setNext(DLinkedNode node) {
        this.next = node;
    }
    
    public void setPrev(DLinkedNode node) {
        this.prev = node;
    }
    
    public E getElement() {
        return element;
    }
    
    public DLinkedNode getNext() {
        return next;
    }
    
    public DLinkedNode<E> getPrev() {
        return prev;
    }
}
