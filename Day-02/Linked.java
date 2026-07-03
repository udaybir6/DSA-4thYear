class Linked{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
            
        }
        Node(Node temp){
            this.data= temp.data;
            this.next = temp.next;
        }


    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node temp = head;
        for (int i = 0; i < 10; i++) {
            temp.next = new Node(i+2);
            temp = temp.next;
        }
        temp = head;
        while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    }
