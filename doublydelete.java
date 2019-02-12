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
    Node tail;
    public Node insertionBeg(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        return head;
    }

    public void deleteBeg(){
        if(head == null){
            System.out.println("List is Empty!");
        } else {
            Node node = head;
            head=head.next;
            head.prev=null;
            node = null;
        }
    }

    public void deleteEnd(){
        if(head==null){
            System.out.println("List is Empty!");
        } else {
            if(tail!=null && tail==head){
                head=null;
                tail=null;
            }
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void deletionAny(int pos){
        Node current;
        current = head;
        int i;
        for(i=1;i<pos && current!=null;i++){
            current= current.next;
        }
        if(pos == 1){
            deleteBeg();
        } else if(current == tail){
            deleteEnd();
        } else if( current != null) {
            current.prev.next = current.next;
            current.next.prev = current.prev;

            current = null;
        } else {
            return;
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

class doublydelete{
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
            list.insertionBeg(m);
        }
        list.printList();
        list.deleteBeg();
        list.printList();

        int pos;
        System.out.println("Enter the Position : ");
        pos = sc.nextInt();

        list.deletionAny(pos);
        list.printList();

        System.out.println("Enter the value in the linked list : ");
        for(i=0;i<n;i++){
            m = sc.nextInt();
            list1.insertionBeg(m);
        }
        list1.printList();
        list1.deleteEnd();
        list1.printList();

        int pos1;
        System.out.println("Enter the Position : ");
        pos1 = sc.nextInt();

        list1.deletionAny(pos1);
        list1.printList();
    }
}