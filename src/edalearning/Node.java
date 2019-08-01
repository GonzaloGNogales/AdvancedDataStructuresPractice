package edalearning;

public class Node<E> {
    private Node next;
    private E elem;
    
    
    public Node (Node n) {
        this.elem = (E) n.getElem();
        this.next = n.getNext();
    } 
    
    public Node (E value, Node nxt) {
        this.elem = value;
        this.next = nxt;
    }
    
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
