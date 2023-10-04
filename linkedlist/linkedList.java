package linkedlist;

public class linkedList {
    Node head;
    private int size;

    linkedList() {
        this.size=0;
    }
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add - first ,last 
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    //print
    public void printList() {
        if(head == null){
            System.out.println("list is empty");
            return;
        }
         Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    //delete first
    public void deleteFirst() {
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }

        size--;
        head=head.next;
    }

    //delete last
    public void deleteLast() {
        if(head == null){
            System.out.println("The list is empty");
            return;
        }

        size--;
        if(head.next==null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next; // head.next = null -> lastNode= null
        while(lastNode.next!=null){ // null.next
            lastNode=lastNode.next;
            secondLast = secondLast.next;

        }

        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }

    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode !=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;

    }


    public static void main(String[] args) {
        linkedList list = new linkedList();
        // list.addFirst("a");
        // list.addFirst("is");
        // list.printList();

        // list.addLast("list");
        // list.printList();

        // list.addFirst("this");
        // list.printList();
        
        // list.deleteFirst();
        // list.printList();
        
        // list.deleteLast();
        // list.printList();

        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        
        list.reverseIterate();
        list.printList();

        // System.out.println(list.getSize());
    }
}
