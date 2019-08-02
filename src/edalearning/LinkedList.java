package edalearning;

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
    
    //Review
    @Override
    public void add (int index, E value) {
        Node actual = new Node(this.head);
        Node anterior = new Node(this.head);
        int i = 0;
        
        if (index == i) {
            Node newNode = new Node(value,this.head);
            this.head = newNode;
            this.size++;
        }
        else {
            actual = actual.getNext();
            i++;
        }
        
        while (i < size) {
            if (index == i) {
                Node newNode = new Node(value,actual);
                anterior.setNext(newNode);
                this.size++;
            }
            else {
                anterior = anterior.getNext();
                actual = actual.getNext();
                i++;
            }
        }
    }
    
    @Override
    public E remove() {
        E elem = (E) this.head.getElem();
        this.head = this.head.getNext();
        size--;  
        return elem;
    }
    
    //Review
    @Override
    public E remove (int index) {
        Node actual = new Node(this.head);
        Node anterior = new Node(this.head);
        Node posterior = new Node(this.head.getNext());
        E elem = null;
        int i = 0;
        boolean encontrado = false;
        
        if (index == i) {
            elem = (E) actual.getElem();
            this.head = this.head.getNext();
            encontrado = true;
            this.size--;  
        }
        else {
            actual = actual.getNext();
            posterior = posterior.getNext();
            i++;
        }
        
        while ((i < this.size) && !(encontrado)) {
            if (index == i) {
                elem = (E) actual.getElem();
                anterior.setNext(posterior);
                encontrado = true;
                this.size--; 
            }
            else {
                anterior = anterior.getNext();
                actual = actual.getNext();
                posterior = posterior.getNext();
                i++;
            }
        }
        
       
        return elem;
    }

    @Override
    public E get () {
        return (E) this.head.getElem();
    }
    
    //Review
    @Override
    public E get (int index) {
        Node aux = new Node(this.head);
        E elem = null;
        int i = 0;
        
        while (i < this.size) {
            if (i == index) {
                elem = (E) aux.getElem();
            }
            else {
                aux = aux.getNext();
                i++;
            }
        }
        
        return elem;
    }
    
    @Override
    public int search (E value) {
        Node aux = new Node(this.head);
        int i = 0;
        int contador = 0;
        
        while (i < this.size) {
            if (value == aux.getElem()) {
                contador++;
            }
            
            aux = aux.getNext();
            i++;
        }
        
        return contador;
    }
    
    @Override
    public boolean contains (E value) {
        Node aux = new Node(this.head);
        int i = 0;
        boolean contenido = false;
        
        while (i < this.size) {
            if (value == aux.getElem()) {
                contenido = true;
            }
            
            aux = aux.getNext();
            i++;
        }
        
        return contenido;
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
