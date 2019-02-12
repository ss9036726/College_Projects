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
        Node ptr = new Node(data);
        if(head == null){
            head = ptr;
        } else {
            Node ptr1 ;
            ptr1 = head;
            while(ptr1.next != null){
                ptr1 = ptr1.next;
            } 
            ptr1.next = ptr;
        }
    }

    public Node insertAny(int value,int position){
        Node ptr = new Node(value);
        if(head == null){
            return ptr;
        }
        if(position == 0){
            ptr.next = head;
            head = ptr;
            return head;
        }

        int i=0;
        Node prev = null;
        Node current = head;
        while(current!=null && i<position){
            prev = current;
            current = current.next;
            i++;
        }
        ptr.next = prev.next;
        prev.next = ptr;
        return head;
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

class insertatany{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int i,n,m,pos,value;
        System.out.println("Enter the size of the linked list : ");
        n = sc.nextInt();
        System.out.println("Enter the value in the linked list : ");
        for(i=0;i<n;i++){
            m = sc.nextInt();
            list.insertEnd(m);
        }
        list.printList();
        System.out.println("Enter the position : ");
        pos = sc.nextInt();
        System.out.println("Enter the value : ");
        value = sc.nextInt();
        Node result= list.insertAny(value,pos);
        list.printList();
    }
}