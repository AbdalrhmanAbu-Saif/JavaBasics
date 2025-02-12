package Part3String;

import java.util.Scanner;

public class AgeOfOldest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String Name = scanner.nextLine();

        int maxAge = 0;

        while (true) {

            String input = scanner.nextLine();


            if (input.isEmpty()) {
                break;
            }


            String[] parts = input.split(",");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);


            if (age > maxAge) {
                maxAge = age;
            }
        }


        System.out.println("Age of the oldest: " + maxAge);


    }

}

