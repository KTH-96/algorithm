package m08.w01.day0807;

public class S2798 {
    public static void main(String[] args) {

        Node node = new Node(1);
        node.append(2);
        node.retrieve();
    }
}
class Node{
    int data;
    Node next = null;

    Node(int d) {
        this.data = d;
    }

    void append(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    void delete(int d) {
        Node n = this;
        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
            }else{
                n = n.next;
            }
        }
    }

    void retrieve() {
        Node n = this;
        while (n.next != null) {
            System.out.print(n.data + " ->");
            n = n.next;
        }
        System.out.print(n.data);
    }
}