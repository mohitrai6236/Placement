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
    }
    
}
