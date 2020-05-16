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

    public void deleteFirst(){
        if(isEmpty()){System.out.println("List is Empty. Nothing to delete!!");}
        else{
            head = head.next;
            head.prev = tail;
            tail.next =head;
        }
    }

    public void deleteLast(){
        if(isEmpty()){System.out.println("List is Empty. Nothing to delete!!");}
        else{
            tail = tail.prev;
            tail.next=head;
            head.prev = tail;
        }
    }
    public void deleteAnywhere(int location){
        int size = sizeOfList();
        if (isEmpty()){System.out.println("List is Empty. Nothing to Delete");}
        if(location == 0){
            deleteFirst();
        }
        else if (location == size){
            deleteLast();
        }
        else if (location > size){
            System.out.println("Location value : "+ location+" is greater than "+ "size of the list : "+ size);
        }
        else{
            int i = 0;
            LinkNode current = head;
            while(i != location -1){
                i++;
                current = current.next;
            }
            current.next = current.next.next;
            current.next.prev = current;
        }

    }

    public void reverseList(){
        if(isEmpty()){System.out.println("List is Empty");}
        else{
            LinkNode last = tail;
            while(last.prev != tail){
                System.out.print("[data : "+ last.nodeValue + " ]"+"-->");
                last = last.prev;
            }
            System.out.print("[data : "+ last.nodeValue + " ]"+"-->");
        }
    }

    public void deleteEntireList(){
        if(isEmpty()){System.out.println("List is Empty");}
        else{
            LinkNode current = head;
            while(current.next != head){
                current.prev = null;
                current = current.next;
            }
            tail.next = null;
            head = tail =  null;

        }
    }

    public void searchInList(int data){
        boolean valueFound= false;
        if(isEmpty()){System.out.println("List is Empty");}
        else{
            LinkNode current = head;
            int i =0;
            while(current.next != head){
                if(current.nodeValue == data){
                    System.out.println("Data : "+data + " is found at node : "+i);
                    valueFound = true;
                }
                i++;
                current= current.next;
            }
        }
        if(!valueFound){
            System.out.println(data + " is not available in LIST");
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
