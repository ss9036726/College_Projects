import java.util.*;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
    }
}

class LinkedList{
    Node head;
    public void insertionBeg(int data){
        Node node = new Node(data);
        node.next=head;
        node.prev=null;

        if(head!=null){
            head.prev=node;
        }
        head = node;
    }

    public void insertionEnd(int data){
        Node node = new Node(data);
        node.prev=head;
        node.next=null;
        if(head == null){
            node.prev = null;
            head = node;
        } else {
            Node current = head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=node;
            node.prev = current;
        }
    }


    public void printList(){
        if(head==null){
            System.out.println("List is Empty!");
        } else {
            Node current = head;
            while(current!=null){
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.print(" NULL");
            System.out.println();
        }
    }
}

class doublyinsertion{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        LinkedList list1 = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int i,n,m;
        System.out.println("Enter the size of the linked list : ");
        n = sc.nextInt();
        System.out.println("Enter the value in the linked list : ");
        for(i=0;i<n;i++){
            m = sc.nextInt();
            list.insertionEnd(m);
        }
        list.printList();

        System.out.println("Enter the value in the linked list : ");
        for(i=0;i<n;i++){
            m = sc.nextInt();
            list1.insertionBeg(m);
        }
        list1.printList();
    }
}