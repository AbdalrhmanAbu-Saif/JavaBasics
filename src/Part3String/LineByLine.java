package Part3String;

import java.util.Scanner;

public class LineByLine {
    public static  void main( String[] args) {

        Scanner scanner= new Scanner(System.in);
        String input = scanner.nextLine();



            String[] parts = input.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }

    }
}
