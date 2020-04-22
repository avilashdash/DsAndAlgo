package arrays;

public class TwoDimensionArray {

    int arr[][] = null;

    public TwoDimensionArray(int row,int col){
        arr = new int[row][col];
        for(int i = 0; i<arr.length;i++ )
            for (int j=0;j<arr[0].length;j++){
                arr[i][j] = Integer.MIN_VALUE;
            }
    }


    public void traverseArray(){

        try {
            for(int i = 0; i<arr.length;i++ ) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("row : "+arr.length);
            System.out.println("col : "+arr[0].length);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void insertToArray(int row,int col,int value){

        try {
            if(arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("Successfully inserted to array Location : row : " + row + " col : "+ col);
            }
            else
                System.out.println("Array location is already occupied with value : "+ arr[row][col]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void accessArrayCell(int row,int col){

        try {
            System.out.println("Array location : row : " + row + " col : "+ col + " Value : "+arr[row][col]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void searchInArray(int value){

        try {
            for(int i = 0; i<arr.length;i++ ) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (arr[i][j] == value) {
                        System.out.println("Value : " + value + " is found at row: " + i + " Col : " + j);
                        return;
                    }
                }
            }
            System.out.println("Value : " + value + " is NOT Found at location: ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void deleteInArray(int row, int col){
        try {
            if(arr[row][col]==Integer.MIN_VALUE){
                System.out.println("Array location : row : " + row + " col : "+ col + " is Unoccupied, Nothing to Delete");
            }
            else{
                arr[row][col] = Integer.MIN_VALUE;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
