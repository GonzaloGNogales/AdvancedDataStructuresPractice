package edalearning;

public class Node<E> {
    private Node next;
    private E elem;
    
    
    public E getElem () {
        return this.elem;
    }
    
    public Node getNext () {
        return this.next;
    }
    
    public void setElement (E e) {
        this.elem = e;
    }
    
    public void setNext (Node node) {
        this.next = node;
    }
}
