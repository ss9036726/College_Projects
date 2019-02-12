import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class LinkedList{
    Node head;
    public void insertBeg(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void deleteBeg(){
        if(head == null){
            return;
        }
        Node node;
        node = head;
        head = head.next;
        node = null;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is Empty!");
        } else {
            Node current;
            current = head;
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}

class DeletionAtBeg{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int i,n,m;
        System.out.println("Enter the size of the linked list : ");
        n = sc.nextInt();
        System.out.println("Enter the value in the linked list : ");
        for(i=0;i<n;i++){
            m = sc.nextInt();
            list.insertBeg(m);
        }
        list.printList();

        System.out.println("Deletion of first Element : ");
        list.deleteBeg();

        System.out.println("List After Deletion is : ");
        list.printList();
    }
}