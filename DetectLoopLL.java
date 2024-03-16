import java.util.HashSet;
import java.util.*;

class LinkedList {
    static Node head;
    class Node{
        int data;
         Node next;

         Node (int x){

             data=x;

             next=null;
         }
    }
    void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    static boolean detectloop(Node h){
        HashSet<Node> s = new HashSet<Node>();
        while (h!=null){
            if (s.contains(h))
                return true;

            s.add(h);
            h=h.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
        llist.head.next.next.next.next = llist.head;

        if (detectloop(head))
            System.out.println("Loop Found");
        else
            System.out.println("No Loop");
    }
}