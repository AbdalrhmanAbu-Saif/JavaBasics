import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {


        // *************************************************************************
        //Recurring problems and patterns to solve them
        // *************************************************************************

        // part 1
/*
        Scanner num1= new Scanner(System.in);

        int  number1= num1.nextInt();

        System.out.println(number1*number1);

*/
        // part 2
/*
        Scanner num1= new Scanner(System.in);

        int  number1= num1.nextInt();
        Scanner num2= new Scanner(System.in);

        int  number2= num2.nextInt();

        int  number3=number1+number2;
        System.out.println(Math.sqrt(number3));


        Scanner num1= new Scanner(System.in);

        int  number1= num1.nextInt();
*/

        // part3

     /*   Scanner num1= new Scanner(System.in);

        int  number1= num1.nextInt();

        if(number1<0)
            number1=-1*number1;

        System.out.println(number1);*/


        //part4
      /*  Scanner num1= new Scanner(System.in);

        int  number1= num1.nextInt();
        Scanner num2= new Scanner(System.in);

        int  number2= num2.nextInt();

        if(number1>number2)





            System.out.println(number1+" is greater than "+number2);
        else if (number2>number1)
            System.out.println(number1+" is smaller than "+number2);

        else
            System.out.println(number1+" is equal than "+number2);
*/

        // *************************************************************************
        //Repeating functionality
        // *************************************************************************

        // part 1
        /*
        while (true){
            System.out.println("Shall we carry on?");
            Scanner str1= new Scanner(System.in);

            String  string1= str1.nextLine();

            if(string1.equals("no"))
                break;
        }
        */


        // part2

 /*       while (true){
            System.out.println("Give a number:");
            Scanner num3= new Scanner(System.in);
             int  number3= num3.nextInt();

            if(number3==4)
                break;
        }*/


        // part3i

   /*     while (true){
            System.out.println("Give a number:");
            Scanner num3= new Scanner(System.in);
            int  number3= num3.nextInt();

            if(number3>0)
                System.out.println((int)(Math.pow(number3,2)));

            if(number3<0)
                System.out.println("Unsuitable number");

            if(number3==0)
                break;


        }*/


        //part 4

    /*    int i ;
        for (i=1;i>0;i++){
            System.out.println("Give a number:");
            Scanner num1= new Scanner(System.in);
            int  number1= num1.nextInt();

            if (number1==0){
                i--;
                break;
            }
        }
        System.out.println("Number of numbers: "+i);
*/

        //part 5
    /*    int counter=0;
        while (true){
            System.out.println("Give a number:");
            Scanner num1= new Scanner(System.in);
            int  number1= num1.nextInt();

            if (number1==0){
                break;
            }
            if (number1<0)
                counter++;
        }
        System.out.println("Number of negative numbers: "+counter);  */


        //part6
    /*
        int sum=0;
        while (true){
            System.out.println("Give a number:");
            Scanner num1= new Scanner(System.in);
            int  number1= num1.nextInt();

            if (number1==0){
                break;
            }
            sum+=number1;

        }
        System.out.println("Sum of the numbers: "+sum);   */


        // part7
/*
        int sum=0,cunt=0;
        while (true){
            System.out.println("Give a number:");
            Scanner num1= new Scanner(System.in);
            int  number1= num1.nextInt();

            if (number1==0){
                break;
            }
            cunt++;
            sum+=number1;

        }
        System.out.println("Number of numbers: "+cunt);
        System.out.println("Sum of the numbers: "+sum);
*/


        //part 8
  /*      int sum=0,cunt=0;
        while (true){
            System.out.println("Give a number:");
            Scanner num1= new Scanner(System.in);
            int  number1= num1.nextInt();

            if (number1==0){
                break;
            }
            cunt++;
            sum+=number1;

        }
        double avg = sum/(cunt*1.0);
        System.out.println("Average of the numbers: "+avg); */


        //part9
     /*   int sum=0,cunt=0;
        while (true){

            Scanner num1= new Scanner(System.in);
            int  number1= num1.nextInt();

            if (number1==0){
                break;
            }
            if(number1>0) {
                cunt++;
                sum += number1;
            }
        }
        if(cunt==0)
            System.out.println("Cannot calculate the average");
        double avg = sum/(cunt*1.0);
        System.out.println(avg); */


        // *************************************************************************
        //More loops
        // *************************************************************************

        // part 1
      /*  Scanner num1= new Scanner(System.in);
        int  number1= num1.nextInt();

        for (int i=0; i<=number1;i++){
            System.out.println(i);
        }

        */

        /// part 2
      /*  Scanner num1= new Scanner(System.in);
        int  number1= num1.nextInt();
        while (number1<=100){
            System.out.println(number1);
            number1++;
        }
*/


        //part3  part1

  /*      System.out.println("Where to?");
        Scanner num1= new Scanner(System.in);
        int  number1= num1.nextInt();

        for (int i=1;i<=number1;i++){
            System.out.println(i);
        }
*/


        //part3  part2

    /*    System.out.println("Where to?");
        Scanner num1 = new Scanner(System.in);
        int number1 = num1.nextInt();


        System.out.println("Where from ?");
        Scanner num2 = new Scanner(System.in);
        int number2 = num2.nextInt();

        while (number2 <= number1) {
            System.out.println(number2);
            number2++;
        }*/


        // part4

  /*      System.out.println("Last number?");
        int sum = 0;
        Scanner num1 = new Scanner(System.in);
        int number1 = num1.nextInt();

        for (int i = 1; i <= number1; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);*/


        //part5
     /*   int  sum=0;
        System.out.println("First number?");
        Scanner num1 = new Scanner(System.in);
        int number1 = num1.nextInt();


        System.out.println("Last number?");
        Scanner num2 = new Scanner(System.in);
        int number2 = num2.nextInt();

        while (number1 <= number2) {
            sum += number1;
            number1++;
        }
        System.out.println("the  sum is  "+sum);
*/

       // part6
      /*  int fac=1;
        System.out.println("Give a number: ");
        Scanner num1 = new Scanner(System.in);
        int number1 = num1.nextInt();
        while (number1>0){
            fac*=number1;
            number1--;
        }
        System.out.println("Factorial: "+fac);  */


        //part7   part1

  /*      System.out.println("Give a number: ");
        while (true){
        Scanner num1 = new Scanner(System.in);
        int number1 = num1.nextInt();

        if(number1==-1)
        break;

        }
            System.out.println("Thx! Bye!");
*/

        //part7   part2

   /*     System.out.println("Give a number: ");
        int sum=0;
        while (true){
            Scanner num1 = new Scanner(System.in);
            int number1 = num1.nextInt();

            if(number1==-1)
                break;

            sum+=number1;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+sum);  */


        //part7   part3

      /*  System.out.println("Give a number: ");
        int sum=0,count=0;
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

*/

        //part7   part4
/*
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
*/

        //part7   part5

        System.out.println("Give a number: ");
        int sum=0,count=0,evcunt=0,oddcunt=0;
        double avg;
        while (true){
            Scanner num1 = new Scanner(System.in);
            int number1 = num1.nextInt();

            if(number1==-1)
                break;
            if(number1%2==0)
                evcunt++;
            else
                oddcunt++;
            sum+=number1;
            count++;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+sum);
        System.out.println("numbers: "+count);
        avg=sum/(count*1.0);
        System.out.println("Average :"+avg);
        System.out.println("Even: "+evcunt);
        System.out.println("Odd: "+oddcunt);
    }
}

