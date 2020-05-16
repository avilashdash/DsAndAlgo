package linkedlist;

public class SingleLinkedListFunc {

    private LinkNode head;

    private static class LinkNode {
       private int data;
       private LinkNode next;

       public LinkNode(int data) {
           this.data = data;
           this.next = null;
       }

       public void displayNode(){
           System.out.println("[data : "+ data + " ]");
       }

    }

    public boolean isEmpty(){
        return (head == null);
    }

   public void insertAtFirst(int data){
        LinkNode node = new LinkNode(data);
        if(head == null){
            head=node;
        }else{
            node.next = head;
            head = node;
        }

   }

    public void insertInMiddle(int data,int location){
        LinkNode node = new LinkNode(data);
        LinkNode current = head;
        int i = 0;
        if(head == null){
            head=node;
        }else{
            while(current.next != null) {
                if(i==location){
                  break;
                }
                current = current.next;
                i++;
            }
            node.next = current.next;
            current.next = node;

        }

    }

   public void insertAtLast(int data){

       LinkNode node = new LinkNode(data);
       LinkNode current = head;
       if(head == null){
           head=node;
       }
       else{
           // You can find the last node by traversing with node.next. There is difference between print function and traversing till last
           while(current.next != null) {
               current = current.next;
           }
           current.next = node;
       }

   }

   public void deleteAtFirst(){
       if(!isEmpty()){
        head = head.next;
       }
       else{
           System.out.print("List Is empty. Nothing to Delete.");
       }

   }

   public int lengthOfLinkedList(){

        LinkNode current = head;
        int length = 0;
        if(!isEmpty()){
            while(current != null) {
                current = current.next;
                length++;
            }
        }
        else{
            System.out.print("List Is empty");
        }
        return length;
   }

   public void printListElements(){

        LinkNode current = head;
        while(current != null){
            System.out.print("[data : "+ current.data + " ]"+"-->");
            current = current.next;
        }
       System.out.println("\n");

   }

}
