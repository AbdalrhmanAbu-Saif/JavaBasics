import java.util.Scanner;
import  java.util.ArrayList;

import java.util.Collections;
public class part3Lists {


    public  static  void  main( String[] args) {
        // *************************************************************************
        //Third element
        // *************************************************************************
/*
        ArrayList<String> Names=new ArrayList<>();

        while (true) {
            Scanner s1 = new Scanner(System.in);
            String Str1 = s1.nextLine();
            if(Str1.isEmpty())
                break;

            Names.add(Str1);


        }

        System.out.println(Names.get(2));

    }
*/
        // *************************************************************************
        //Second plus third ArrayList<String> wordList = new ArrayList<>();

        // *************************************************************************

 /*   ArrayList<Integer> Number= new ArrayList<>();

        while (true) {
            Scanner s1 = new Scanner(System.in);
            int num1 = s1.nextInt();

            if (num1 == 0)
                break;
            Number.add(num1);
        }

        System.out.println(Number.get(1)+Number.get(2));


    */

        // *************************************************************************
        //IndexOutOfBoundsException
        // *************************************************************************
/*e
N
        ArrayList<String> wordList = new ArrayList<>();

        wordList.add("First");
        wordList.add("Second");

        System.out.println(wordList.get(4));
*/


        // *************************************************************************
        //List size
        // *************************************************************************

     /*   ArrayList<String> Names=new ArrayList<>();
            int c=0;
        while (true) {
            Scanner s1 = new Scanner(System.in);
            String Str1 = s1.nextLine();
            if(Str1.isEmpty())
                break;

            Names.add(Str1);
            c++;
        }
        System.out.println("In total: "+c);
*/


        // *************************************************************************
        //Last in list
        // *************************************************************************

/*
        ArrayList<String> Names=new ArrayList<>();

        while (true) {
            Scanner s1 = new Scanner(System.in);
            String Str1 = s1.nextLine();
            if(Str1.isEmpty())
                break;

            Names.add(Str1);

        }
        int lst=Names.size()-1;
        System.out.println("In total: "+Names.get(lst));
*/


        // *************************************************************************
        // First and Last
        // *************************************************************************

/*
        ArrayList<String> Names=new ArrayList<>();

        while (true) {
            Scanner s1 = new Scanner(System.in);
            String Str1 = s1.nextLine();
            if(Str1.isEmpty())
                break;

            Names.add(Str1);

        }
        int lst=Names.size()-1;
        System.out.println(Names.get(0));
        System.out.println(Names.get(lst));

        */



        // *************************************************************************
        // Remember these numbers
        // *************************************************************************


   /*     ArrayList<Integer> Number= new ArrayList<>();

        while (true) {
            Scanner s1 = new Scanner(System.in);
            int num1 = s1.nextInt();

            if (num1 <0)
                break;
            Number.add(num1);
        }

        for (int i=0; i<Number.size();i++){

                System.out.println(Number.get(i));

            }*/


        // *************************************************************************
        // Only these numbers
        // *************************************************************************

     /*
        ArrayList<Integer> Number= new ArrayList<>();

        while (true) {
            Scanner s1 = new Scanner(System.in);
            int num1 = s1.nextInt();

            if (num1 <0)
                break;
            Number.add(num1);
        }
        System.out.print("From where ?");
        Scanner s2 = new Scanner(System.in);
        int st = s2.nextInt();
        System.out.print("To where ?");
        Scanner s3 = new Scanner(System.in);
        int end = s3.nextInt();
        for (int i=st; i<=end;i++){

            System.out.println(Number.get(i));
        }*/

        // ************






//*******************************




//******************************
        // Greatest in list
        // *************************************************************************
/*
        ArrayList<Integer> Number= new ArrayList<>();

        while (true) {
            Scanner s1 = new Scanner(System.in);
            int num1 = s1.nextInt();

            if (num1 <0)
                break;
            Number.add(num1);
        }
        int  mx=0;
        for (int i=0; i<Number.size();i++){

           if(mx<Number.get(i))
               mx=Number.get(i);
        }
        System.out.println("The greatest number:"+mx);

*/


        // *************************************************************************
        // Index of
        // *************************************************************************

  /*
        ArrayList<Integer> Number= new ArrayList<>();

        while (true) {
            Scanner s1 = new Scanner(System.in);
            int num1 = s1.nextInt();

            if (num1 <0)
                break;
            Number.add(num1);Number
        } int smallest = Number.get(0);

        for(int i = 0; i < Number.size(); i++) {
            int number = Number.get(i);
            if (smallest >= number) {
                smallest = number;
                System.out.println("Smallest number: " + smallest);
                index.add(i);
            }
        }
        for(int i = 0; i < index.size(); i++) {
            System.out.println("Found at index" + index.get(i));
        }
        System.out.print("Search for?");
        Scanner s2 = new Scanner(System.in);
        int num= s2.nextInt();
        int i;
        for (i=0; i<Number.size();i++){
                if (num==Number.get(i))
                    System.out.println(num+" is at  index "+i);
        }

        */


        //*************************************************************************
        // Index of smallest of
        // *************************************************************************

   /*     ArrayList<Integer> Number= new ArrayList<>();
        ArrayList<Integer> index= new ArrayList<>();

        while (true) {
            Scanner s1 = new Scanner(System.in);
            int num1 = s1.nextInt();

            if (num1==9999)
                break;
            Number.add(num1);
        }

        int  small=Number.get(0);

        for (int i =0 ; i<Number.size();i++){
            if(Number.get(i)<small)
                small=Number.get(i);
        }

        System.out.println("Smallest number: "+small);
        for (int i =0 ; i<Number.size();i++) {

        if(Number.get(i)==small)
            System.out.println("Found at index: "+i);

        }*/


        //*************************************************************************
        // sum of   a list
        // *************************************************************************

   /*     ArrayList<Integer> Number= new ArrayList<>();
        int  sum=0;
        while (true) {
            Scanner s1 = new Scanner(System.in);
            int num1 = s1.nextInt();

            if (num1<0)
                break;
            Number.add(num1);
            sum+=num1;
        }
        System.out.println("Sum: "+sum);*/


        //*************************************************************************
        // Avg of   a list
        // *************************************************************************
/*
        ArrayList<Integer> Number= new ArrayList<>();
        int  sum=0;
        double avg;
        while (true) {
            Scanner s1 = new Scanner(System.in);
            int num1 = s1.nextInt();

            if (num1<0)
                break;
            Number.add(num1);
            sum+=num1;
        }
        avg=(sum*1.0)/(Number.size());
        System.out.println("Average: "+avg);
*/


        //*************************************************************************
        // On the list?
        // *************************************************************************


   /*     ArrayList<String> Name = new ArrayList<>();
        while (true) {
            Scanner s1 = new Scanner(System.in);
            String Str1 = s1.nextLine();
            if(Str1.isEmpty())
                break;

            Name.add(Str1);

        }
        boolean Found =false;
        System.out.print("Search for? ");
        Scanner s2 = new Scanner(System.in);
        String Str2 = s2.nextLine();
        for (int i=0 ; i<Name.size();i++){
            if(Str2.equals(Name.get(i)))
                Found=true;

        }

        if(Found)
            System.out.println(Str2+" was found!");
        else
            System.out.println(Str2+" was not found!");
*/


        //*************************************************************************
        // Print in range
        // *************************************************************************

/*
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);*/



        //*************************************************************************
        // Sum
        // *************************************************************************

     /*   ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));

        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers));*/




        //*************************************************************************
        // Remove last
        // *************************************************************************

      /*  ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
*/
    }


    //*************************************************************************
    // Print in range Method
    // *************************************************************************
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){

        for (int i=0; i<numbers.size();i++){
            if(numbers.get(i)>=lowerLimit && numbers.get(i)<=upperLimit)
                System.out.println(numbers.get(i));
        }
    }





    //*************************************************************************
    // Sum Method
    // *************************************************************************
    public static int sum(ArrayList<Integer> numbers){

        int sum=0;
        for (int  i=0; i<numbers.size();i++){
            sum+=numbers.get(i);
        }

        return sum;

    }


    //*************************************************************************
    // Remove last  Method
    // *************************************************************************
    public static void removeLast(ArrayList<String> strings){

        int lst= strings.size()-1;

        if(strings.size()==0){
            return;
        }
        strings.remove(lst);

    }


}


