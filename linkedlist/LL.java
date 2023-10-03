package linkedlist;
import java.util.*;
public class LL {
    public static void main(String[] args) {

        // Format to create a empty list
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("this");
        list.addLast("list");
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0; i<list.size(); i++){
            // we use .get when we need element
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");

        // list.removeFirst();
        // System.out.println(list);

        // list.removeLast();
        // System.out.println(list);

        list.remove(3);
        System.out.println(list);
    }
    
}
