package JavaProgramming2.Part12.Randomness.Lottery;

import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {
    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        return  numbers.contains(number);
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        Random rand = new Random();
        int numberOfNumbers = 6;
        int maxValue = 49;

        while (numbers.size() < numberOfNumbers) {
            int randomNumber = rand.nextInt(maxValue) + 1;
            if (!containsNumber(randomNumber)) {
                numbers.add(randomNumber);
            }
        }

    }

    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        LotteryRow that = (LotteryRow) other;
        return this.numbers.equals(that.numbers);
    }

}

