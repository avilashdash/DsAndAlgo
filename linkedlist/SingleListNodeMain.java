package linkedlist;

public class SingleListNodeMain {

    public static void main(String[] args){
        SingleLinkedListFunc sll = new SingleLinkedListFunc();

        sll.insertAtFirst(5);
        sll.insertAtFirst(6);
        sll.insertAtFirst(7);
        sll.insertAtFirst(8);
        sll.insertAtLast(9);
        sll.insertAtLast(10);
        sll.insertInMiddle(11,0);
        sll.insertInMiddle(12,3);
        sll.printListElements();
        sll.deleteAtFirst();
        sll.printListElements();
        System.out.println("\n"+"length : "+ sll.lengthOfLinkedList());

    }
}
