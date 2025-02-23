package JavaProgramming2.Part11.ClassDiagrams.ThePlayerAndTheBot;

public class Bot extends Player {
    public Bot(String name) {
        super(name);
    }


    @Override
    public void play() {
        System.out.println("Bot is making a move.");
    }

    public void addMove(String move) {
        System.out.println("Bot added move: " + move);
    }
}
