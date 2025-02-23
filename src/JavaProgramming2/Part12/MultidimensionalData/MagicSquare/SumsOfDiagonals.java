package JavaProgramming2.Part12.MultidimensionalData.MagicSquare;

import java.util.ArrayList;

public class SumsOfDiagonals {
    public static void main(String[] args) {
        int[][] magicSquare = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };

        MagicSquare ms = new MagicSquare(magicSquare);
        ArrayList<Integer> sumsOfDiagonal = ms.sumsOfDiagonals();


        System.out.println(sumsOfDiagonal);
    }
}
