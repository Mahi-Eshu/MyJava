package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    LL(){
        this.size = 0;
    }
    public class Node{
        private int val;
        private Node next;
        Node(int val){
            this.val = val;
        }//when the next should be set by us
        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }//when the next node is given
    }

    //insertion operations
    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null){
            tail = head;
        }
        size++;
    }
    public void insertAtEnd(int val){
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        node.next = null;
        size++;
    }
    public void insertAfter(int val, int after){
        Node node = new Node(val);
        Node temp = head;
        while(temp.val != after){
            temp = temp.next;
        }
        Node afterNode = temp.next;
        temp.next = node;
        node.next = afterNode;
        size++;
    }
    public void insertAtIndex(int val, int index){
        if(index > size){
            System.out.print("Index is out of Bound");
            return;
        }
        if(index == 0){
            insertAtFirst(val);
            return;
        }
        if(index == size){
            insertAtEnd(val);
            return;
        }
        int count = 0;
        Node node = new Node(val);
        Node temp = head;
        while(count != index){
            temp = temp.next;
            count++;
        }
        Node nodeAtIndex = temp.next;
        temp.next = node;
        node.next = nodeAtIndex;
        size++;
    }


    //deletion operations
    public void deleteAtFirst(){
        int val = head.val;
        head = head.next;
        size--;
        System.out.println(val + " was removed");
    }
    public void deleteAtEnd(){
        int val = tail.val;
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        tail = temp;
        temp.next = null;
        size--;
        System.out.println(val + " was removed");
    }

    public void displayLinkedList(){
        Node temp = head;
        while(temp != null){
            if(temp.next == null) System.out.print(temp.val);
            else System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
    }
}
