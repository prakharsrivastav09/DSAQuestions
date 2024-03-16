class LinkedList {
    Node head;

    class Node{
    int data;
    Node next;

    Node (int x) {

        data = x;

        next = null;
    }
}

     void rotate(  int k){

         if(k==0)
             return ;

         Node current = head;

         int count =1;

         while(count < k && current!=null){

             current = current.next;

             count++;
         }
         if(current==null)
             return;

         Node kthNode = current;

         while (current.next!=null)

             current = current.next;

             current.next = head;

             head = kthNode.next;

             kthNode.next = null;



     }
     void push( int data){


         Node newNode = new Node(data);
         newNode.next = head;
         head = newNode;

     }
     void printlist(){
         Node temp = head;
         while (temp!=null){
             System.out.print(temp.data + " ->");
             temp = temp.next;
         }
         System.out.println( " ");
     }



    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        // create a list 10->20->30->40->50->60
        for (int i = 60; i >= 10; i -= 10)
            llist.push(i);

        System.out.println("Given list");
        llist.printlist();

        llist.rotate(3);

        System.out.println("Rotated Linked List");
        llist.printlist();
        
    }
}