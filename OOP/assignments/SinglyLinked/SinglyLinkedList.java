public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        // your code here
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            // System.out.println("head is null addding new node");
            head = newNode;
            // System.out.println(head.value);
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
        // System.out.println(head.value);
    }
    public void remove(){
        if(head != null){
            Node runner = head;
            while(runner.next.next != null){
                runner = runner.next;
            }
            runner.next = null;
        }
    }
    public void printValues(){
        if(head == null){
            System.out.println("Nothing in the list");            
        } else {
            Node runner = head;
            while(runner.next != null){
                System.out.println(runner.value);
                runner = runner.next;
            }
            System.out.println(runner.value);
        }
    }    
}