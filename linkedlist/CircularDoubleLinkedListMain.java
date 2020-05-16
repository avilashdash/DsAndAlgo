package linkedlist;

public class CircularDoubleLinkedListMain {

    public static void main(String[] args) {
        CircularDoubleLinkedListFunc cdll = new CircularDoubleLinkedListFunc();
        cdll.insertFirst(7);
        cdll.insertFirst(6);
        cdll.insertFirst(5);
        cdll.insertLast(8);
        cdll.insertLast(9);
        cdll.insertWhere(10,3);
        cdll.printList();
        System.out.print("\n");
        cdll.deleteFirst();
        cdll.deleteLast();
        cdll.deleteAnywhere(2);
        cdll.reverseList();
        System.out.print("\n");
        cdll.printList();
        cdll.printTailValue();
        System.out.print("Size of the List : "+ cdll.sizeOfList());
        cdll.deleteEntireList();
        cdll.printList();

    }
}
