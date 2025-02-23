package JavaProgramming2.Part12.Randomness;

import JavaProgramming2.Part11.Exceptions.SensorsAndTemperature.Sensor;

import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        System.out.println("How many random numbers should be printed?");
        Scanner number= new Scanner(System.in);
        int num =number.nextInt();
        for (int i =1; i<=num;i++){
            Random n= new Random();
            int numRandom = n.nextInt(10);
            System.out.println(numRandom);
        }
    }
}
