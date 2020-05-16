package linkedlist;

public class DoubleLinkedListFunc {


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

    public void insertFirst(int data){

        if(isEmpty()){
            System.out.println("List is Empty");
            LinkNode node = new LinkNode(data);
            head = node;
            tail = node;
        }else{
            LinkNode nodeFirst = new LinkNode(data);
            head.prev = nodeFirst;
            nodeFirst.next = head;
            nodeFirst.prev = null;
            head = nodeFirst;
            setTail();
        }


    }

    public void insertAnywhere(int data, int location) {
        int size = sizeOfList();
        if (isEmpty()) {
            System.out.println("List is Empty");
            LinkNode node = new LinkNode(data);
            head = node;
            tail = node;
        } else {
                if(location > size){
                    System.out.println("Location entered : " + location + " is bigger than DLL size : "+ size);

                }
                else if(location == 0 ){
                    insertFirst(data);
                }
                else if(location == size){
                    insertLast(data);
                }
                else{
                    LinkNode nodeMiddle = new LinkNode(data);
                    LinkNode current = head;
                    int i = 0;
                    while(current.next != null){
                        if(i == location - 1 ){
                           break;
                        }
                        i++;
                        current = current.next;
                    }
                    nodeMiddle.next = current.next;
                    current.next.prev = nodeMiddle;
                    current.next = nodeMiddle;
                    nodeMiddle.prev = current;

                }

        }
    }

    public void insertLast(int data){
        if(isEmpty()){
            System.out.println("List is Empty");
        }else{
            setTail();
            LinkNode nodeLast = new LinkNode(data);
            tail.next = nodeLast;
            nodeLast.prev = tail;
            tail = nodeLast;
        }
    }

    public void deleteFirst(){
        if(isEmpty()){
            System.out.println("List is Empty. Nothing to Delete");
        }
        else{
            head.next.prev = null;
            head = head.next;
        }
    }

    public void deleteLast(){
        if(isEmpty()){
            System.out.println("List is Empty. Nothing to Delete");
        }
        else{
            setTail();
            LinkNode last = tail;
            last.prev.next = null;
            tail = last.prev;
            last.prev = null;

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
            while(current != null){
                if(i == location - 1){
                    break;
                }
                i++;
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            current.next = null;
            current.prev = null;
        }
    }

    public void setTail(){
        LinkNode tempNode = head;
        while (tempNode != null) {
            if (tempNode.next == null) {
                tail = tempNode;
                break;
            }
            tempNode = tempNode.next;
        }

    }

    public  void printTailValue(){

        System.out.println("\n Data in Tail Node : " + tail.nodeValue);
    }

    public void searchInNode(int data){
        LinkNode current  = head;
        boolean valueFound= false;
        int i = 0;
        if(isEmpty()){
            System.out.println("List is Empty");
        }
        while(current != null){
            if(data == current.nodeValue){
                System.out.println(data + " is found at Node : "+ i);
                valueFound = true;
                break;
            }
            i++;
            current=current.next;
        }
        if(!valueFound){
            System.out.println(data + " is NOT FOUND in DLL");
        }
    }

    public void printListElemments(){

        LinkNode printNode = head;
        if(isEmpty()){
            System.out.println("List is Empty");
        }else{
            System.out.println("\n");
            while(printNode != null){
                System.out.print("[data : "+ printNode.nodeValue + " ]"+"-->");
                printNode = printNode.next;
            }
            System.out.println("\n");
        }

    }

    public void reverseDoubleLinkedList(){
        LinkNode lastNode = tail;
        if(isEmpty()){
            System.out.println("List is Empty");

        }
        else {
            System.out.println("\n Printing List in Reverse Way \n");
            while (lastNode != null) {
                System.out.print("[data : " + lastNode.nodeValue + " ]" + "-->");
                lastNode = lastNode.prev;
            }
        }
    }

    public int sizeOfList(){
        int size = 0;
        LinkNode currentNode  = head;
        while(currentNode != null) {
            size++;
            currentNode = currentNode.next;
        }
        return size;
    }

    public void deleteEntireDLL(){
        if(isEmpty()){System.out.println("List is Empty");}
        else{
            LinkNode current = head ;
        while(current != null){
           current.prev = null;
           current=current.next;
          }
        head = tail = null;
        }
    }


}
