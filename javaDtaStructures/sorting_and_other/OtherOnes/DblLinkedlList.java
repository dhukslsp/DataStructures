package javaDtaStructures.sorting_and_other.OtherOnes;

public class DblLinkedlList {
    Node head;
    static class Node{
        Node prev;
        int data;
        Node next;
        Node(int data){
            this.prev = null;
            this.data = data;
            this.next = null;
        }
    }
    public static DblLinkedlList insert(DblLinkedlList list,int data){
        Node new_Node = new Node(data);
        if(list.head == null){
            list.head = new_Node;
        }
        else{
            Node last_Node = list.head;
            while (last_Node.next != null) {
                last_Node = last_Node.next;
            }
            last_Node.next = new_Node;
            new_Node.prev = last_Node;
        }
        return list;
    }
    public static void Printlist(DblLinkedlList list){
        Node point = list.head;
        while (point != null) {
            System.out.println(point.data);
            point = point.next;
        }

    }
    public static void printListBack(DblLinkedlList list,int data){
        try {
        Node point = list.head;
        while (point.data != data) {
            point = point.next;
        }
        System.out.println(point.prev.data);   
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        DblLinkedlList list = new DblLinkedlList();
        list = insert(list,13);
        list = insert(list,15);
        list = insert(list,16);
        list = insert(list,17);
        list = insert(list,10);
        list = insert(list,1878);


        Printlist(list);
        printListBack(list,10);
    }
}
