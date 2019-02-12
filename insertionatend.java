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
                current=current.next;
            }
            current.next = node;
        }
    }

    public void traverse(Node node){
        if(node.next != null){
            traverse(node.next);
        }
        System.out.print(node.data + " ");
        
    }
}

class insertionatend{
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);
        list.insertEnd(50);

        list.traverse(list.head);
    }
}