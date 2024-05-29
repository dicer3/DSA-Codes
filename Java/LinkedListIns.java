public class LinkedListIns {
    
    static Node head = null;
    static class Node {
 
        int data;
        Node next;
 
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public static void insert(int data){
        
        Node newNode = new Node(data);

        if(head == null){
           head = newNode;
           return;
        }   
        
        System.out.println("inset suchdful ### "+data);

        Node ptr = head;
        while(ptr.next != null){
           //System.err.println("ok "+ptr.toString()); 
           ptr = ptr.next;
        }
        ptr.next = newNode;   
        System.out.println("inset suchdful "+data);
        //return head;
    }

    public static void printLL(){
        Node ptr = head;
        while(ptr.next != null){
           System.err.println("node data "+ptr.data);
           ptr = ptr.next;
        }
    }
    
    
    public static void main(String[] args) {
        insert(71);
        insert(75);
        insert(22);
        insert(47);
        insert(16);

        printLL();
    }
}
