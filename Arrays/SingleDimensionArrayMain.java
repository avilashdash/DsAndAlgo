package arrays;

public class SingleDimensionArrayMain {

    public static void main(String[] args){

      System.out.println(" Creating an Array with size 10 and Default Values");

      SingleDimensionArray sda = new SingleDimensionArray(10);
      System.out.println(" Traversing an Array before adding Values");
      sda.traverseArray();
      sda.insertToArray(0,10);
      sda.insertToArray(1,20);
      sda.insertToArray(2,30);
      sda.insertToArray(3,40);
      sda.insertToArray(4,50);
      sda.insertToArray(5,60);
      sda.insertToArray(10,70);
      sda.insertToArray(5,70);

      System.out.println(" Traversing an Array after adding Values");
      sda.traverseArray();
      System.out.println(" Accessing an array");
      sda.accessArrayCell(5);
      sda.accessArrayCell(10);
        System.out.println(" Searching an array");
      sda.searchInArray(30);
      sda.searchInArray(100);
        System.out.println(" Deleting an array");
        sda.deleteInArray(4);
        sda.traverseArray();
        sda.deleteInArray(8);
        sda.deleteInArray(11);








    }

}
