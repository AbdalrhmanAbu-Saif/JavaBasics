package Part2.MoreLoops;

import java.util.Scanner;

public class FromWhereToWherePart1 {
    public static void main(String[] args) {


        System.out.println("Where to?");
        Scanner num1 = new Scanner(System.in);
        int number1 = num1.nextInt();

        for (int i = 1; i <= number1; i++) {
            System.out.println(i);
        }

    }

}
