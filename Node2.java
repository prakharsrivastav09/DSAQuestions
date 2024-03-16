package LinkedLists;
import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;

        next = null;

    }

}
    class LinkedList{

        static Node insert(Node head, int data){

            Node newNode = new Node(data);

            newNode.next =  head;
            head = newNode;

            return head;

        }
        static int calcsize(Node node){
            int size =0;
            while (node!=null){
                node = node.next;
                size++;
            }
            return size;
        }

        static void display(Node node){

            while (node!=null){

                System.out.print(node.data + "->");

                node = node.next;
            }
            System.out.println(" ");
        }

        static Node deletenode(Node head , int delval) {
            Node temp = head;
            Node previous = null;
            //if there is  no node
            if (temp.next == null) {
                head = null;

                System.out.print("Value deleted " + delval);

                return head;
            }
            //if node needs to be deleted itself
            if (temp != null && temp.data == delval) {

                head = temp.next;
                System.out.print("Value deleted " + delval);
                return head;

            }
            //if we have to search till last
            while (temp!=null && temp.data!=delval){
                previous = temp;
                temp = temp.next;
            }
            //if value is not present
            if (temp==null){
                System.out.println("Value not found");
                return head;
            }
            previous.next = temp.next;
            System.out.println("Values deleted " + delval );
            return head;



        }

        public static void main(String [] args){
            Node head = null;

            head = insert (head, 12);
            head = insert (head, 16);
            head = insert (head, 20);
            head = insert (head, 24);
            head = insert (head, 30);
            head = insert (head, 22);

            System.out.println("Linked List before operation");
            display(head);

            head = deletenode(head, 22);
            head = deletenode(head, 10);
            head = deletenode(head, 12);

            System.out.println("Linked List after operations");

            display(head);

            head = deletenode(head,2);
            display(head);

            head = deletenode(head,5);
            display(head);
        }


    }

