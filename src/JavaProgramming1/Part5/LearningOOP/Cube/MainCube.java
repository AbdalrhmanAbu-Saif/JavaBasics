package JavaProgramming1.Part5.LearningOOP.Cube;

public class MainCube {
    public static void main(String[]args){
        Cube oSheaJackson = new Cube(4);
        System.out.println(oSheaJackson.volume());
        System.out.println(oSheaJackson);

        System.out.println();

        Cube salt = new Cube(2);
        System.out.println(salt.volume());
        System.out.println(salt);

    }
}
