package linkedlist;

public class CircularDoubleLinkedListFunc {


    private LinkNode head;
    private LinkNode tail;

    private static class LinkNode{

        private int nodeValue;
        private LinkNode next;
        private LinkNode prev;

        LinkNode(int data){
            this.nodeValue = data;
            this.next = null;
            this.prev =  null;
        }

    }

    public boolean isEmpty(){
        if (head == null){return true;}
        else{
            return false;
        }
    }
    public  void printTailValue(){

        System.out.println("Data in Tail Node : " + tail.nodeValue);
    }

    public void insertFirst(int data){
        if(isEmpty()){
            LinkNode node = new LinkNode(data);
            node.prev = node;
            node.next = node;
            head = node;
            tail = node;
        }
        else{
            LinkNode node = new LinkNode(data);
            node.next = head;
            node.prev = tail;
            head.prev = node;
            tail.next = node;
            head = node;
        }
    }

    public void insertLast(int data){
        if(isEmpty()){
            LinkNode node = new LinkNode(data);
            node.prev = node;
            node.next = node;
            head = node;
            tail = node;
        }
        else{
            LinkNode node = new LinkNode(data);
            node.prev = tail;
            head.prev = node;
            tail.next = node;
            node.next = head;
            tail = node;
        }
    }

    public void insertWhere(int data, int location){
        int size = sizeOfList();
        if(isEmpty()){
            LinkNode node = new LinkNode(data);
            node.prev = node;
            node.next = node;
            head = node;
            tail = node;
        }
        else{
            if(location > size){
                System.out.println("Location entered : " + location + " is bigger than DLL size : "+ size);
            }
            else if(location == size){
                insertLast(data);
            }
            else if( location == 0){
                insertFirst(data);
            }
            else{
                int i = 0;
                LinkNode current = head;
                while(current.next != head){
                    if(i == location -1){
                        LinkNode node = new LinkNode(data);
                        node.next = current.next;
                        current.next.prev = node;
                        node.prev = current;
                        current.next= node;
                        break;
                    }
                    i++;
                    current = current.next;
                }
            }
        }

    }

    public void printList(){
        if(isEmpty()){
            System.out.println("List is Empty!!");
        }
        else{
            LinkNode current = head;
            while(current.next != head){
                System.out.print("[data : "+ current.nodeValue + " ]"+"-->");
                current = current.next;
            }
            System.out.print("[data : "+ current.nodeValue + " ]"+"-->");
        }
    }

    public int sizeOfList(){
        int i =0;
        if(isEmpty()){
            System.out.println("List is Empty!!");
        }
        else{

            LinkNode current = head;
            while(current.next != head){
                i++;
                current = current.next;
            }
        }
        return i+1;
    }
}
