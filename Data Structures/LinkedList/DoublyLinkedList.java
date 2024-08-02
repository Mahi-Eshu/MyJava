package LinkedList;

public class DoublyLinkedList {
    public static void main(String[] args){
        DLL dllist = new DLL();
        dllist.insertAtFirst(9);
        dllist.insertAtFirst(8);
        dllist.insertAtEnd(10);
        dllist.displayDLL();
        dllist.displayReverse();
//        System.out.print(dllist);

    }
}
