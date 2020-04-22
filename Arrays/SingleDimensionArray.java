package arrays;

public class SingleDimensionArray {

    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];

        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }

    public void traverseArray(){

        try {
            System.out.println("Array Length : "+ arr.length);
            for (int i =0;i<arr.length;i++){
                System.out.println(arr[i]+" ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists !");
        }

    }

    public void insertToArray(int location,int value){

        try {
            if(arr[location] == Integer.MIN_VALUE) {
                arr[location] = value;
                System.out.println("Successfully inserted to array Location : " + location);
            }
            else
                System.out.println("Array location is already occupied with value : "+ arr[location]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void accessArrayCell(int location){

        try {
            System.out.println("Array location : " + location + " Value : "+arr[location]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void searchInArray(int value){

        try {
            for(int i = 0; i < arr.length ; i++){
                if(arr[i] == value) {
                    System.out.println("Value : " + value + " is found at location: " + i);
                    return;
                }
            }
            System.out.println("Value : " + value + " is NOT Found at location: ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteInArray(int location){
        try {
            if(arr[location]==Integer.MIN_VALUE){
                System.out.println("Array location : " + location + " is Unoccupied, Nothing to Delete");
            }
            else{
                arr[location] = Integer.MIN_VALUE;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
