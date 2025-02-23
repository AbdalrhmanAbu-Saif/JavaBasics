package JavaProgramming2.Part11.ClassDiagrams.ThePlayerAndTheBot;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + " is playing.");
    }

    public void printName() {
        System.out.println("Player name: " + name);
    }
}
