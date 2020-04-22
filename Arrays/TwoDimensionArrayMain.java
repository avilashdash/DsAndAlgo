package arrays;

public class TwoDimensionArrayMain {

    public static  void main (String[] args){

        TwoDimensionArray tda = new TwoDimensionArray(3,4);

        tda.traverseArray();

        System.out.println(" Traversing an Array before adding Values");
        tda.traverseArray();
        tda.insertToArray(0,2,10);
        tda.insertToArray(0,3,20);
        tda.insertToArray(1,2,30);
        tda.insertToArray(1,3,40);
        tda.insertToArray(2,3,50);
        tda.insertToArray(2,1,60);
        tda.insertToArray(3,3,70);
        tda.insertToArray(1,2,70);
        tda.insertToArray(4,3,70);

        System.out.println(" Traversing an Array after adding Values");
        tda.traverseArray();
        System.out.println(" Accessing an array");
        tda.accessArrayCell(2,3);
        tda.accessArrayCell(10,3);
        System.out.println(" Searching an array");
        tda.searchInArray(30);
        tda.searchInArray(100);
        System.out.println(" Deleting an array");
        tda.deleteInArray(2,1);
        tda.traverseArray();
        tda.deleteInArray(2,3);



    }

}
