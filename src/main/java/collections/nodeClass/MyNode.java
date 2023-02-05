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

    public Node deleteMyNode(MyNode myNode,int d){
        if (head==null){
            return null;
        }
        Node temp=head;
        while (temp.next !=null){
            if (temp.next.data==d){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }
        return head;
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
