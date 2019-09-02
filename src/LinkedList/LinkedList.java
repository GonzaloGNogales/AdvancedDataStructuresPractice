package LinkedList;

public class LinkedList<E> implements List<E> {
    private Node head;
    private int size;
    
    
    public LinkedList () {
        this.head = null;
        this.size = 0;
    }
    
    @Override
    public int size () {
        return this.size;
    }
    
    @Override
    public boolean isEmpty() {
        return (head == null);
    }
    
    @Override
    public void add (E value) {
        Node newNode = new Node(value,null);
        
        if (this.isEmpty()) {
            this.head = newNode;
        }
        else {
            Node aux = this.head;
            
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            
            aux.setNext(newNode);
        }

        this.size++;
    }

    @Override
    public void add (int index, E value) {
        Node act = this.head;
        Node pre = this.head;
        
        if (index == 0) {
            Node newNode = new Node(value,this.head);
            this.head = newNode;
            this.size++;
        }
        else if (index < this.size) {
            act = act.getNext();
            int cont = 1;
            
            while (cont < index) {
                pre = pre.getNext();
                act = act.getNext();
                cont++;
            }
            
            Node newNode = new Node(value,act);
            pre.setNext(newNode);
            this.size++;
        }
        else {
            System.out.println("Out of size index.");
        }
        
    }

    @Override
    public E remove() {
        E elem = (E) this.head.getElem();
        this.head = this.head.getNext();
        size--;  
        return elem;
    }
    
    @Override
    public E remove (int index) {
        Node act = this.head;
        Node pre = this.head;
        Node post = this.head.getNext();
        E elem = null;

        if (index == 0) {
            elem = (E) act.getElem();
            this.head = this.head.getNext();
            this.size--; 
        }
        else if (index < this.size) {
            act = act.getNext();
            post = post.getNext();
            int cont = 1;
            
            while (cont < index) {
                post = post.getNext();
                pre = pre.getNext();
                act = act.getNext();
                cont++;
            }
            
            elem = (E) act.getElem();
            pre.setNext(post);
            this.size--; 
        }
        else {
            System.out.println("Out of size index.");
        }
        
       
        return elem;
    }

    @Override
    public E get () {
        return (E) this.head.getElem();
    }
    
    @Override
    public E get (int index) {
        Node aux = this.head;
        E elem = null;

        if (index == 0) {
            elem = (E) aux.getElem();
        }
        else if (index < this.size) {
            aux = aux.getNext();
            int cont = 1;
            
            while (cont < index) {
                aux = aux.getNext();
                cont++;
            }
            
            elem = (E) aux.getElem();
        }
        else {
            System.out.println("Out of size index.");
        }
        
        return elem;
        
    }
    
    @Override
    public int search (E value) {
        Node aux = new Node(this.head);
        int i = 0;
        int cont = 0;
        
        while (i < this.size) {
            if (value == aux.getElem()) {
                cont++;
            }
            
            aux = aux.getNext();
            i++;
        }
        
        return cont;
    }
    
    @Override
    public boolean contains (E value) {
        Node aux = new Node(this.head);
        int i = 0;
        boolean contained = false;
        
        while (i < this.size) {
            if (value == aux.getElem()) {
                contained = true;
            }
            
            aux = aux.getNext();
            i++;
        }
        
        return contained;
    }
    
    public void show () {
        Node aux = new Node(this.head);
        int i = 0;
        
        while (i < this.size) {
            System.out.println(aux.getElem());
            aux = aux.getNext();
            i++;
        }
        
    }
}
