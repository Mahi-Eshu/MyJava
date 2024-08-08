package LinkedList;
import java.util.*;

public class SinglyLinkedList {
    public static void main(String[] args){
        LL llist = new LL();
        llist.insertAtFirst(1);// (1)
        llist.insertAtFirst(2);// (2) 1
        llist.insertAtFirst(3);// (3) 2 1
        llist.insertAtFirst(4);// (4) 3 2 1
        llist.insertAtFirst(5);// (5) 4 3 2 1
        llist.insertAtFirst(6);// (6) 5 4 3 2 1
        llist.insertAtEnd(7);//6 5 4 3 2 1 (7)
        llist.insertAtEnd(10);//6 5 4 3 2 1 7 (10)
        llist.insertAfter(9,5);//6 5 (9) 4 3 2 1 7 10
        llist.insertAtIndex(999, 4);//6 5 9 4 3 (999) 2 1 7 10
        llist.insertAtIndex(999, 0);//(999) 6 5 9 4 3 999 2 1 7 10
        llist.deleteAtFirst();//removed 999
        llist.deleteAtEnd();//removed 10
        llist.deleteAtEnd();//removed 7
        llist.deleteAtEnd();//removed 1
        llist.displayLinkedList();
    }
}
