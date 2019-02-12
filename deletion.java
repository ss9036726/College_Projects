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
        if(head==null){
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void deleteBeg(){
        if(head == null){
            System.out.println("List is Empty!");
        }
        Node current = head;
        head = head.next;
        current = null;
    }

    public void deleteEnd(){
        if(head == null){
            System.out.println("List is Empty!");
        }
        else {
            Node current = head;
            Node prev = head;

            while(current.next!=null){
                prev = current;
                current=current.next;
            }

            if(current == head){
                head = null;
            } else {
                prev.next=null;
            }
            current = null;
        }
    }

    public Node deletionAny(Node head,int pos){

        if(pos == 0){
            return head.next;
        }
        head.next = deletionAny(head.next,pos-1);
        return head;
    }

    public void printList(){
        if(head==null){
            System.out.println("List is Empty!");
        } else {
            Node current = head;
            while(current!=null){
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}

class deletion{
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
        list.deleteBeg();
        list.printList();
        list.deleteEnd();
        list.printList();

        int pos;
        System.out.println("Enter the Position : ");
        pos = sc.nextInt();

        Node result = list.deletionAny(list.head,pos);
        list.printList();
    }
}