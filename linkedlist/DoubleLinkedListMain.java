package linkedlist;

public class DoubleLinkedListMain {


    public static void main(String[] args){
    DoubleLinkedListFunc dlf = new DoubleLinkedListFunc();
    dlf.insertFirst(5);
    dlf.insertFirst(6);
    dlf.insertLast(7);
    dlf.insertLast(8);
    dlf.insertAnywhere(9,9);
    dlf.insertAnywhere(9,0);
    dlf.insertAnywhere(9,5);
    dlf.insertAnywhere(10,3);
    dlf.insertAnywhere(12,4);
    dlf.printListElemments();
    dlf.printTailValue();
    dlf.deleteFirst();
    dlf.deleteLast();
    dlf.deleteLast();
    dlf.printTailValue();
    dlf.searchInNode(45);
    dlf.printListElemments();
    dlf.deleteAnywhere(2);
    dlf.printListElemments();
    dlf.reverseDoubleLinkedList();
    dlf.deleteEntireDLL();
    dlf.printListElemments();

    System.out.println("DLL Size : " +  dlf.sizeOfList());

    }


}
