package collections.nodeClass;

import collections.nodeClass.MyNode;

public class NodeTest {
    public static void main(String[] args) {
        MyNode myNode=new MyNode();
        myNode.appendToTail(100);
        myNode.appendToTail(102);
        myNode.appendToTail(170);
        myNode.appendToTail(3);
        myNode.appendToTail(80);
        myNode.print();
        myNode.deleteMyNode(myNode,102);
        myNode.print();
    }
}
