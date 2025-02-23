package JavaProgramming2.Part12.MultidimensionalData.MagicSquare;

public class ConjuringAMagicSquar {
    public static int[][] createMagicSquare(int size) {
        int[][] magicSquare = new int[size][size];
        int row = 0;
        int col = size / 2;

        for (int num = 1; num <= size * size; num++) {
            magicSquare[row][col] = num;
            int nextRow = (row - 1 + size) % size;
            int nextCol = (col + 1) % size;

            if (magicSquare[nextRow][nextCol] != 0) {
                nextRow = (row + 1) % size;
                nextCol = col;
            }

            row = nextRow;
            col = nextCol;
        }

        return magicSquare;
    }

    public static void main(String[] args) {
        int size = 5;
        int[][] magicSquare = createMagicSquare(size);
        for (int[] row : magicSquare) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
