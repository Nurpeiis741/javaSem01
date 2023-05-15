package Java_seminar.seminar_6.HwSeminar6;

public class Ex1 {
    /**
     * ДЗ:
     * 1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
     * Пример:
     * 1 -> 2->3->4
     * Вывод:
     * 4->3->2->1
     */
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    static Node head;
    static void reverse(Node curr) {
        if (curr == null) {
            return;
        }
        reverse(curr.next);
        System.out.print(curr.data + "->");
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.print("List: ");
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.print("null\nList: ");
        reverse(head);
        System.out.print("null");
    }
}
