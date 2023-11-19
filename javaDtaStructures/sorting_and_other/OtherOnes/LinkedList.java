package javaDtaStructures.sorting_and_other.OtherOnes;
public class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static LinkedList insert(LinkedList list,int data){
        Node mynode = new Node(data);
        if(list.head == null){
            list.head = mynode;
        }
        else{
            Node lastNode = list.head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = mynode;
        }
        return list;
    }
    public static void printList(LinkedList list){
        Node point = list.head;
        while(point != null){
            System.out.println(point.data);
            point = point.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = insert(list, 0);
        list = insert(list, 1);
        printList(list);
    }
}