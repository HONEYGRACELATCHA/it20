
package LO2_MultidimensionalArray;


public class MultidimensionalArray {
    
    public static void main(String[] args) {

        int[][] twoDArray = {
	     {1, 3, 5},
             {7, 9, 11},
             {13, 15, 17}
        };

        // Printing the 2D array
        System.out.println("twoDArray");
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }

    }

}
