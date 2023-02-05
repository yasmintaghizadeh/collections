package collections.nodeClass;

public class MyNode {


    class Node {
        Node next;
        int data;


        

        public Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    Node head;
    public Node tail;

    public void appendToTail(int d){
            Node node=new Node(d);
        if (head == null) {
            head = node;
        }else {
            tail.next=node;
        }
        tail = node;

    }

    public void deleteMyNode(MyNode myNode,int d){
        if (head==null){
            return;
        }
        Node temp=head;

    }




    public void print()

    {

        Node current = head;

        if(head == null) {

            System.out.println("The given list is empty");

            return;

        }

        System.out.println("The data in the given list are: ");

        while(current != null)

        {

            System.out.print(current.data + " ");

            current = current.next;

        }

        System.out.println();

    }
}
