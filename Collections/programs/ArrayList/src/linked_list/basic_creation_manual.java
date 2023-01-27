package linked_list;

public class basic_creation_manual {
    
    static class Node {
        int data;
        Node next;

    Node(int data) {
        this.data = data;
        next      = null;
        }
    }
        
    static class LinkedList {
        Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head         = newNode;
        }
    }
    
    public static void main(String[] args) {
       LinkedList list = new LinkedList();
       list.add(10);
       list.add(100);
       
       
  
        
    }
}
