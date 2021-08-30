package exo.ourLinkedList;

public class MyLinkedList {
    private Node head;

    public void appendToTail(int data) {
        Node end = new Node(data);

        // cas si la liste est vide
        if (head == null) {
            this.head = end;
            return;
        }

        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        // à ce niveau, on obtient le dernier noeud de la liste
        // celui qui ne pointe vers rien, vers null
        // node == le dernier élément de la liste

        // on fait pointer le dernier élément vers le nouveau dernier
        node.next = end;
    }

    public void display() {
        if (head == null) {
            return;
        }
        Node current = head;
        String description = head.toString();
        while (current.next != null) {
            description += current.next.toString();
            current = current.next;
        }
        System.out.println(description);
    }

}
