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
    int detectAndRemove(Node node){
        Node slow = node;
        Node fast = node;

        while (slow!=null && fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                removeloop(slow,node);
                return 1;
            }
        }
        return 0;

    }
    //function to remove loop
     void removeloop (Node loop, Node s ){
        Node ptr1 = loop;
        Node ptr2 = loop;
        //count
        int k =1, i;

        Node prevNode = ptr1;

        while (ptr1.next!=ptr2){
            prevNode = ptr1;
            ptr1 = ptr1.next;
            k++;
        }
        prevNode.next =null;

     }
     void printlist(Node node){
        while (node!=null){
            System.out.print(node.data + " ");
            node= node.next;
        }
     }

    public static void  main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new  Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);

        // Creating a loop for testing

        head.next.next.next.next.next = head.next.next;
        list.detectAndRemove(head);
        System.out.println(
                "Linked List after removing loop : ");
        list.printlist(head);
    }
}