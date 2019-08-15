package LinkedList;

public interface List<E> {
    
    public int size ();
    
    public boolean isEmpty();
    
    public void add (E value);
    
    public void add (int index, E value);
    
    public E remove();
    
    public E remove (int index);
    
    public E get ();
    
    public E get (int index);
    
    public int search (E value);
    
    public boolean contains (E value);
    
}
