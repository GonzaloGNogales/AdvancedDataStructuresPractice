package edalearning;
/**
 *
 * @author Gonzalo Gómez Nogales
 */

public class EDALearning {

    public static void main(String[] args) {        
        LinkedList<Integer> l = new LinkedList<>();
        
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        l.show();
        System.out.println();
        
        System.out.println(l.get(2));
        System.out.println(l.get(4));
        System.out.println();
        
        System.out.println(l.remove(7));
        System.out.println(l.remove(9));
        System.out.println();
        l.show();
        System.out.println();
        
        l.add(0,0);
        l.add(3,27);
        l.add(10,123);
        l.add(20,123);
        System.out.println();
        l.show();
        System.out.println();
        
        System.out.println(l.get());
        System.out.println(l.size());
        System.out.println();
        
        l.remove();
        l.remove();
        l.remove();
        l.remove();
        l.remove();
        l.show();
        System.out.println();
        
        System.out.println(l.search(7));
        System.out.println(l.contains(7));  
        System.out.println();
        System.out.println();
    }

}
