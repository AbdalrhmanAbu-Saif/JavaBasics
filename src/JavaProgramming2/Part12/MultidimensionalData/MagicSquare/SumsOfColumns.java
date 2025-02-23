package JavaProgramming2.Part12.MultidimensionalData.MagicSquare;

import java.util.ArrayList;

public class SumsOfColumns {
    public static void main(String[] args) {
        int[][] magicSquare = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };

        MagicSquare ms = new MagicSquare(magicSquare);
        ArrayList<Integer> columnsSum = ms.sumsOfColumns();


        System.out.println(columnsSum);
    }

}
