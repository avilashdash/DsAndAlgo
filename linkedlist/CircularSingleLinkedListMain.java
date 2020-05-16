package linkedlist;

public class CircularSingleLinkedListMain {

    public static void main(String[] args){

        CircularSingleLinkedListFunc cslf = new CircularSingleLinkedListFunc();

        cslf.insertFirst(7);
        cslf.insertFirst(6);
        cslf.insertFirst(5);
        cslf.insertLast(8);
        cslf.insertWhere(9,3);
        cslf.insertWhere(10,1);
        cslf.insertWhere(11,0);
        cslf.insertWhere(15,7);

        System.out.print("Size of the List : "+ cslf.sizeOfList());
        //cslf.setTail();
        cslf.printTailValue();
        cslf.printCircularSingleList();
        cslf.deleteFirst();
        cslf.deleteLast();
        cslf.deleteAnywhere(2);
        cslf.printCircularSingleList();
        cslf.printTailValue();

        cslf.searchInList(50);
        cslf.searchInList(9);
        cslf.deleteEntireCSLL();

        cslf.printCircularSingleList();
    }
}
