public class Part3 {


    //*****************************************************
    //In a hole in the ground  part
    //*****************************************************
   /* public static void main(String[] args) {
      printText();

    }

    public static  void printText(){
        System.out.println("In a hole in the ground");
    }
*/


    //*****************************************************
    //Reprint
    //*****************************************************

    /*
       public static void main(String[] args) {
      printText();

    }
       public static  void printText(){

           for(int i=0;i<6;i++)
            System.out.println("In a hole in the ground");
    }
    */


    //*****************************************************
    //From one to parameter

    //*****************************************************
  /*   public static void main(String[] args) {
      printUntilNumber(5);

    }
     public static void printUntilNumber(int number){
         for(int i=1;i<=number;i++)
             System.out.println(i);
     }
*/

    //*****************************************************
    //From one to parameter

    //*****************************************************

    /*
      public static void main(String[] args) {
      printFromNumberToOne(5);

    }
    public static void printFromNumberToOne(int number){
         for(int i=number;i>=1;i--)
             System.out.println(i);
     }

    */
    //*****************************************************
    //Divisible
    //*****************************************************

/*    public static void main(String[] args) {
      division(3,5);

    }
     public static void division(int numerator, int denominator){
         System.out.println(numerator/(denominator*1.0));
     }

    */


    //*****************************************************
    //Divisible by three
    //*****************************************************


    /*
        public static void main(String[] args) {
      divisibleByThreeInRange(2,10);

    }
    public static void divisibleByThreeInRange(int beginning, int end){

        for(int  i=beginning; i<=end;i++){
            if(i%3==0)
                System.out.println(i);
        }

     }   */
    //*****************************************************
    //Number uno
    //*****************************************************
  /* public static void main(String[] args) {
       System.out.println(numberUno());

    }
    public static int numberUno(){

        return 1;
     }
*/

    //*****************************************************
    //word
    //*****************************************************
   /*      public static void main(String[] args) {
       System.out.println(word());

    }
    public static String word(){

        return "Atypon";
     }

    */


    //*****************************************************
    //summation
    //*****************************************************
 /*  public static int sum(int number1, int number2, int number3, int number4) {

       int  total=number1+number2+number3+number4;
       return total;
}

public static void main(String[] args) {
    int answer = sum(4, 3, 6, 1);
    System.out.println("Sum: " + answer);
}
*/


    //*****************************************************
    //smallest
    //*****************************************************

 /*   public static int smallest(int number1, int number2) {

    if(number1<number2)
        return number1;

return number2;
}

public static void main(String[] args) {
    int answer =  smallest(2, 7);
    System.out.println("Smallest: " + answer);
}

*/

    //*****************************************************
    //Greatest
    //*****************************************************

 /*   public static int Greatest(int number1, int number2,int number3) {

    if(number1>number2 &&number1>number3)
        return number1;

    else if(number3>number1 && number3>number2)
        return number3;

return number2;
}

public static void main(String[] args) {
    int answer =  Greatest(2, 7,3);
    System.out.println("Greatest: " + answer);
}
*/
    //*****************************************************
    //Averaging
    //*****************************************************

   /* public static int sum(int number1, int number2, int number3, int number4) {
        int  total =number1+number2+number3+number4;
        return total;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        int Summation= sum(number1,number2,number3,number4);
        double avg= Summation/(4.0);
        return avg;

    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }

    */

    //*****************************************************
    //Star sign (4 parts)  Part1 Printing stars
    //*****************************************************

  /*  public static void printStars(int number) {

        for (int  i =1;i<=number;i++){
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }*/


    //*****************************************************
    //Star sign (4 parts)  Part2 Printing a square
    //*****************************************************


  /*  public static void printSquare(int size) {

        for (int  i =1;i<=size;i++){
            for(int j=1;j<=size;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
            printSquare(4);
    }*/


    //*****************************************************
    //Star sign (4 parts)  Part3 Printing a rectangle
    //*****************************************************

/*
    public static void printRectangle(int width, int height) {

        for (int  i =1;i<=height;i++){
            for(int j=1;j<=width;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printRectangle(17,3);
    }*/


    //*****************************************************
    //Star sign (4 parts)  Part4 Printing a triangle
    //*****************************************************

   /*      public static void printTriangle(int size) {

         for (int  i =1;i<=size;i++){
         for(int j=1;j<=size;j++){
             if(j<=i)
                 System.out.print("*");
         }
         System.out.println();
         }

         }

         public static void main(String[] args) {
            printTriangle(4);
         }

*/


    //*****************************************************
    //Advanced astrology (3 parts)   part 1 Printing stars and spaces
    //*****************************************************



        public static void printSpaces(int number) {
            for (int i = 0; i < number; i++) {
                System.out.print(" ");
            }
        }

        public static void printStars(int number) {
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            System.out.print("Testing printSpaces(5): ");
            printSpaces(5);
            System.out.println("<- End of spaces");

            System.out.print("Testing printStars(3): ");
            printStars(3);
        }



    //************************************************************************************
    //Advanced astrology (3 parts)   part 2 Printing a right-leaning triangle
    //***********************************************************************************
/*
             public static void printTriangle(int size){

             for (int  i =1;i<=size;i++){
                    for(int j=1;j<=size;j++){
                        if(i+j>size)
                             System.out.print("*");
                        else
                            System.out.print(" ");
                    }

                                System.out.println();
             }

             }

             public static void main(String[] args) {
             printTriangle(5);
             }
*/


    //************************************************************************************
    //Advanced astrology (3 parts)   part 3 Printing a Christmas tree
    //***********************************************************************************

/*

        ppublic class ChristmasTree {

    public static void christmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < height - 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        christmasTree(10);
    }
}

*/
}





















