public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void printList(LinkedList list) {
        if (list.head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = list.head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();

        }
    }

    static void insertFront(LinkedList list, int data) {
        Node n = new Node(data);
        if (list.head == null) {
            list.head = n;
        } else {
            n.next = list.head;
            list.head = n;
        }
    }

    static void insertEnd(LinkedList list, int data) {
        Node n = new Node(data);
        if (list.head == null) {
            list.head = n;
        } else {
            Node temp = list.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    static void insertatIndex(LinkedList list, int data, int index) {
        Node n = new Node(data);
        Node temp = list.head;

        for (int i = 1; i < index - 1; i++) {
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
    }

    static int deleteatFront(LinkedList list) {
        if (list.head == null) {
            System.out.println("List empty");
            return -1;
        }

        int del_data = list.head.data;
        list.head = list.head.next;

        return del_data;
    }

    static int deletefromEnd(LinkedList list) {
        if (list.head == null) {
            System.out.println("List empty");
            return -1;
        }

        Node temp = list.head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int del_data = temp.data;
        temp.next = null;

        return del_data;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        insertFront(list, 10);
        insertFront(list, 20);
        insertFront(list, 30);
        insertFront(list, 40);
        insertEnd(list, 1000);
        insertatIndex(list, 3000, 3);
        insertEnd(list, 2000);
        printList(list);
        deleteatFront(list);
        deletefromEnd(list);
        printList(list);

    }
}
