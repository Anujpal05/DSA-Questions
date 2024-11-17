
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkList {
    Node head;

    public LinkList() {
        this.head = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("LinkList is empty!");
            return;
        }

        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("LinkList is empty!");
            return;
        }

        Node currNode = head;
        Node nextNode = head.next;

        if (head.next == null) {
            head = null;
            return;
        }

        while (nextNode.next != null) {
            currNode = currNode.next;
            nextNode = nextNode.next;
        }
        currNode.next = null;
    }

    public void insertAtIndex(int data, int i) {
        if (i < 0) {
            System.out.println("Invalid Index!");
        }

        if (head == null) {
            System.out.println("Empty List!");
            return;
        }

        Node newNode = new Node(data);
        Node currNode = head;
        int j = 0;

        if (head.next == null && i != 0) {
            head.next = newNode;
            return;
        }

        while (currNode.next != null && j < i - 1) {
            currNode = currNode.next;
            j++;
        }

        Node nextNode = currNode.next;
        currNode.next = newNode;
        newNode.next = nextNode;
    }

    public void traverse() {
        Node curr = head;
        if (curr == null) {
            System.out.println("Empty linked list!");
            return;
        }
        while (curr != null) {
            System.err.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void deleteAtIndex(int i) {
        if (i < 0) {
            System.out.println("Invalid Index!");
        }

        Node currNode = head;
        int j = 0;
        if (head == null) {
            System.out.println("Empty linkList!");
            return;
        }

        while (currNode.next != null && j < i - 1) {
            currNode = currNode.next;
            j++;
        }

        currNode.next = currNode.next.next;
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        Node currNode = head;
        int len = 1;
        while (currNode.next != null) {
            currNode = currNode.next;
            len++;
        }
        return len;
    }

    public int search(int data) {
        if (head == null) {
            System.out.println("LinkList is empty!");
            return -1;
        }

        Node currNode = head;
        int i = 0;
        while (currNode.next != null) {
            if (currNode.data == data) {
                return i;
            }
            currNode = currNode.next;
            i++;
        }
        return -1;
    }

    public boolean isEmptyList() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public int getElementAtIndex(LinkList list, int i) {
        if (head == null) {
            System.out.println("LinkList is Empty!");
            return -1;
        }

        if (i > list.size() || i < 0) {
            throw new IndexOutOfBoundsException("Invalid Index : " + i);
        }

        Node currNode = head;
        int j = 0;

        while (currNode.next != null && j < i) {
            currNode = currNode.next;
            j++;
        }

        return currNode.data;
    }

    public void sort() {
        if (head == null || head.next == null) {
            return;
        }

        Node currNode;
        Node indexNode;
        int temp;

        for (currNode = head; currNode.next != null; currNode = currNode.next) {
            for (indexNode = currNode.next; indexNode != null; indexNode = indexNode.next) {
                if (currNode.data > indexNode.data) {
                    temp = currNode.data;
                    currNode.data = indexNode.data;
                    indexNode.data = temp;
                }
            }
        }
    }

    public void merge(int a, int b, Node list2) {
        Node currNode = head;
        Node nextNode = head.next;
        for (int i = 0; i < b + 1; i++) {
            if (i < a - 1) {
                currNode = currNode.next;
                System.out.println("a : " + i);
            }
            nextNode = nextNode.next;
            System.out.println("b :" + i);
        }
        System.out.println(nextNode.data);
        System.out.println(currNode.data);
    }
}

public class Dsa25 {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertAtBeginning(5);
        list.insertAtBeginning(4);
        list.insertAtBeginning(19);
        list.insertAtBeginning(40);
        list.insertAtBeginning(4);
        System.out.println("LinkList after insertion first position:");
        list.traverse();
        // 4 -> 40 -> 19 -> 4 -> 5 -> null

        list.insertAtLast(10);
        list.insertAtLast(100);
        System.out.println("LinkList after insertion last position:");
        list.traverse();
        // 4 -> 40 -> 19 -> 4 -> 5 -> 10 -> 100 -> null

        list.insertAtIndex(30, 2);
        System.out.println("LinkList after insertion at specific index:");
        list.traverse();
        // 4 -> 40 -> 19 -> 30 -> 4 -> 5 -> 10 -> 100 -> null (starting index = 0)

        list.deleteFirst();
        System.out.println("LinkList after deletion at first position:");
        list.traverse();
        // 40 -> 19 -> 30 -> 4 -> 5 -> 10 -> 100 -> null

        list.deleteLast();
        System.out.println("LinkList after deletion at last position: ");
        list.traverse();
        // 40 -> 19 -> 30 -> 4 -> 5 -> 10 -> null

        list.deleteAtIndex(2);
        System.out.println("LinkList after deletion at specific index: ");
        list.traverse();
        // 40 -> 30 -> 4 -> 5 -> 10 -> null

        System.out.println("Linklist length is : " + list.size());
        // 5

        System.out.println("Search Index of 30 in linklist :" + list.search(30)); // 1
        System.out.println("Search Index of 40 in linklist :" + list.search(42)); // -1

        System.out.println("Get Element at index 2 :" + list.getElementAtIndex(list, 2)); // 4
        // System.out.println("Get Element at index -2 :" + list.getElementAtIndex(list,
        // -2));
        // Exception in thread "main" java.lang.IndexOutOfBoundsException: Invalid Index
        // : -2
        // System.out.println("Get Element at index 10 :" + list.getElementAtIndex(list,
        // 10));
        // Exception in thread "main" java.lang.IndexOutOfBoundsException: Invalid Index
        // : 10

        list.sort();
        System.out.println("LinkList after sorting :");
        list.traverse();
        // 4 -> 5 -> 10 -> 30 -> 40 -> null

        list.merge(2, 2, null);
        list.traverse();
    }

}
