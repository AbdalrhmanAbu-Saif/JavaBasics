package Part2.MoreLoops;

import java.util.Scanner;

public class RepeatingBreakingandRememberingP4 {
    public static void main(String[] args) {
        System.out.println("Give a number: ");
        int sum=0,count=0;
        double avg;
        while (true){
            Scanner num1 = new Scanner(System.in);
            int number1 = num1.nextInt();

            if(number1==-1)
                break;

            sum+=number1;
            count++;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+sum);
        System.out.println("numbers: "+count);
        avg=sum/(count*1.0);
        System.out.println("Average :"+avg);
    }
}
