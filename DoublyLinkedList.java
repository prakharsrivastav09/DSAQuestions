class Node {
    int data;

    Node next;
    Node prev;


    Node(int x) {

        data = x;
        next = null;
        prev = null;

    }
}
class LinkedList{

    static Node insertstart(Node head , int data){

        Node newNode = new Node(data);

        newNode.next = head;

        if(head!=null)

            head.prev = newNode;

            head = newNode;
        return head;
    }
    static void display(Node node){
        //As LinkedList Will end When node is null
        Node end = null;

        System.out.println("List in forward Direction");

        while (node!= null){
            System.out.print(node.data + " ");

            end =node;

            node = node.next;
        }
        System.out.println("\n List is in Backward direction");
        while (end!=null){

            System.out.print(end.data + " ");

            end = end.prev;
        }

    }
    static Node insertlast(Node head , int data){
        Node newNode = new Node(data);
        //need this when there is no node
        if(head==null) {
            head = newNode;
            newNode.prev = null;

            return head;
        }
        Node temp = head;

        while(temp.next!=null){

            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

        return head;

    }

    public static void main(String[] args) {
        Node head = null;
        head = insertstart(head , 12);
        head = insertstart(head, 16);
        head = insertstart (head, 20);
        head = insertstart (head, 24);
        head = insertlast (head, 30);
        head = insertlast (head, 22);
        display(head);
        
    }
}