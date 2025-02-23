package JavaProgramming2.Part12.MultidimensionalData.MagicSquare;

import java.util.ArrayList;

public class MagicSquare {
        private  int[][]  square;
        public MagicSquare(int [][] square){
            this.square= square;
        }
    public ArrayList<Integer> sumsOfRows(){
            ArrayList<Integer> rowsSum= new ArrayList<>();

        for(int row=0; row<square.length;row++){
            int sum=0;
            for (int column = 0; column < square[row].length; column++) {
                sum+=square[row][column];
            }
            rowsSum.add(sum);
        }
        return rowsSum;
    }

    public ArrayList<Integer> sumsOfColumns(){
        ArrayList<Integer> sumColumns= new ArrayList<>();

        for(int row=0; row<square.length;row++){
            int sum=0;
            for (int column = 0; column < square[row].length; column++) {
                sum+=square[column][row];
            }
            sumColumns.add(sum);
        }
        return sumColumns;
    }

    public ArrayList<Integer> sumsOfDiagonals(){
        ArrayList<Integer> sumsOfDiagonal= new ArrayList<>();

        int firstDiagonalSum = 0;
        int secondaDiagonalSum = 0;

        int n = square.length;

        for (int i = 0; i < n; i++) {
            firstDiagonalSum += square[i][i];
            secondaDiagonalSum += square[i][n - 1 - i];
        }

        sumsOfDiagonal.add(firstDiagonalSum);
        sumsOfDiagonal.add(secondaDiagonalSum);

        return sumsOfDiagonal;

    }
    public static void main(String[] args) {
        int[][] magicSquare = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };

        MagicSquare ms = new MagicSquare(magicSquare);
        ArrayList<Integer> rowSums = ms.sumsOfRows();


        System.out.println(rowSums);
    }

}
