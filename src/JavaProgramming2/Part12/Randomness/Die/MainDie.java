package JavaProgramming2.Part12.Randomness.Die;

public class MainDie {
    public static void main(String[] args) {
        Die die = new Die(6);

        for (int i = 0; i < 10; i++) {
            System.out.println(die.throwDie());
        }
    }
}
