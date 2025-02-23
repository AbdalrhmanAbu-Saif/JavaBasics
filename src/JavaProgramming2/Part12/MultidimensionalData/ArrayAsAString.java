package JavaProgramming2.Part12.MultidimensionalData;

import java.util.ArrayList;
import java.util.List;

public class ArrayAsAString {
    public static String arrayAsString(int[][] array){
      String str="";
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
              str+=array[row][column];
            }
            str+="\n";
        }

        return str;
    }

    public static void main(String[] args) {
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));
    }
}
