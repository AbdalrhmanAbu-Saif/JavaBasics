package JavaProgramming1.Part4.IntrotoOOP.Statistics;

public class Count {
    public static void main(String[] args){
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
    }
}
