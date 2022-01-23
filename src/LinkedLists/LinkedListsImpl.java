package LinkedLists;

public class LinkedListsImpl {

    //traversing LinkedList
    private static void printLinkedList(Node head) {
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
    }

    //traversing with recursion
    private static void printLinkedListRecursive(Node head) {

        if(head == null) return;
        System.out.println(head.data);
        printLinkedListRecursive(head.next);
    }

    //insert begin function
    static Node insertBegin(Node head, int x){

        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    //insert at the end


    public static void main(String[] args) {

        Node head = null;
        head = insertBegin(head, 30);
        head = insertBegin(head, 20);

        /*Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);*/

        printLinkedList(head);
        //printLinkedListRecursive(head);

        /*Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;*/
    }

}
