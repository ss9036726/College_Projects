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
    public void insertEnd(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        } else {
            Node current;
            current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = node;
        }
    }

    public void deleteList(){
        head = null;
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

class deleteLinkedList{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int i,n,m;
        System.out.println("Enter the size of the linked list : ");
        n = sc.nextInt();
        System.out.println("Enter the value in the linked list : ");
        for(i=0;i<n;i++){
            m = sc.nextInt();
            list.insertEnd(m);
        }
        list.printList();

        System.out.println("Deleting the linked list....");
        list.deleteList();
        System.out.println("List is deleted...");
        list.printList();
    }
}