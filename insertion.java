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
            current.next=node;
        }
    }

    public void insertBeg(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        else {
            node.next = head;
            head = node;
        }
    }

    public void traverse(){
        if(head== null) {
            System.out.println("List is Empty!");
        } else {
            Node current;
            current = head;
            while(current != null) {
                System.out.print(current.data + " ");
                current=current.next;
            }
            System.out.println();
        }
    }
}

class insertion{
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);
        list.insertEnd(50);

        list.traverse();

        LinkedList list1 = new LinkedList();

        list1.insertBeg(10);
        list1.insertBeg(20);
        list1.insertBeg(30);
        list1.insertBeg(40);
        list1.insertBeg(50);

        list1.traverse();
    }
}