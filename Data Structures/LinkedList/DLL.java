package LinkedList;

public class DLL {

    private Node head;
    private Node tail;
    private int size;
    DLL(){
        this.size = 0;
    }

    public class Node{
        private Node prev;
        private int val;
        private Node next;
        public Node(int val){
            this.val = val;
        }
        public Node(Node prev, int val, Node next){
            this.prev = prev;
            this.val = val;
            this.next = next;
        }
    }

    //insert operations
    public void insertAtFirst(int val){
        Node node = new Node(val);
        if(size == 0){
            head = node;
            head.prev = null;
            head.next = null;
            tail = head;
        }
        else{
            head.prev = node;
            node.prev = null;
            node.next = head;
            head = node;
        }
        size++;
    }
    public void insertAtEnd(int val){
        Node node = new Node(val);
        if(size==0){
            head = node;
            head.prev = null;
            head.next = null;
            tail = head;
        }
        else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }
    public void displayDLL(){
        Node temp = head;
        while(temp != null){
            System.out.print("[ ");
            if(temp.prev == null){
                System.out.print(0+" ");
            }
            else{
                System.out.print(temp.prev.val+" ");
            }
            System.out.print(temp.val+" ");
            if(temp.next == null){
                System.out.print(0+" ]");
            }
            else{
                System.out.print(temp.next.val+" ]");
            }
            if(temp.next!=null){
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
    public void displayReverse(){
        Node temp = tail;
        while(temp != null){
            System.out.print("[ ");
            if(temp.next == null){
                System.out.print(0+" ");
            }
            else{
                System.out.print(temp.next.val+" ");
            }
            System.out.print(temp.val+" ");
            if(temp.prev == null){
                System.out.print(0+" ]");
            }
            else{
                System.out.print(temp.prev.val+" ]");
            }
            if(temp.prev!=null){
                System.out.print(" -> ");
            }
            temp = temp.prev;
        }
        System.out.println();
    }
}
