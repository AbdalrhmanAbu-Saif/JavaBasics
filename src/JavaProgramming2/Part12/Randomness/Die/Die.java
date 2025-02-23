package JavaProgramming2.Part12.Randomness.Die;

import java.util.Random;

public class Die {
    private Random random;
    private int numberOfFaces;

    public Die(int numberOfFaces) {
        this.random = new Random();
       this.numberOfFaces=numberOfFaces;
    }

    public int throwDie() {
        Random num =new Random();
        int n =num.nextInt(numberOfFaces)+1;
        return n;
    }
}
