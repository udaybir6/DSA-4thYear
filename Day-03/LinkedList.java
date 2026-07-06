class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
    }
}

class LinkedList {
    Node head;

    void addLast(int d) {
        Node newNode = new Node(d);

        // if list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // go to last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // attach new node
        temp.next = newNode;
    }
}