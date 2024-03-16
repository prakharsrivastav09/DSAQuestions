
import org.w3c.dom.Node;
import java.util.*;

class LinkedList {

    static Node head;

    static class Node{
        int data;
        Node next;
         
        Node(int x){
            data = x;
            next = null;
            
        }
    }
    Node reverse(Node node){

        Node prev = null;

        Node curr = node;

        Node next = null;

        while (curr!=null){

            next = curr.next;

            curr.next = prev;

            prev= curr;

            curr = next;
        }
        node = prev;
        return node;

    }
    void printlist(Node node){
        while (node!=null){
            System.out.print(node.data + "-> ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head =new Node(85);
        list.head.next = new Node(15);
        list.head.next.next= new Node(78);
        list.head.next.next.next= new Node(77);
        list.head.next.next.next.next= new Node(89);
        list.head.next.next.next.next.next= new Node(78);
        System.out.print("Given Linked list");
        list.printlist(head);
        head = list.reverse(head);
        System.out.print(" ");

        System.out.print("Reversed Linked List ");
        list.printlist(head);
        
    }
}