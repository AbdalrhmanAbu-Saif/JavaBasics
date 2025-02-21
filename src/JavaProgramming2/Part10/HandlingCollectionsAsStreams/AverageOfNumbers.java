package JavaProgramming2.Part10.HandlingCollectionsAsStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }

        long numbersDivisibleByThree = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .count();

        double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        System.out.println("Average number: " + average);


    }
}
