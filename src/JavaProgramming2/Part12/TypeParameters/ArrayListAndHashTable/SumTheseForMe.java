package JavaProgramming2.Part12.TypeParameters.ArrayListAndHashTable;

public class SumTheseForMe {
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest){
        fromWhere =Math.max(fromWhere,0);
        toWhere = Math.min(toWhere,array.length-1);

        int sum=0 ;
        for (int i = fromWhere; i<toWhere;i++){
            if(array[i]>=smallest && array[i]<=largest){
                sum+=array[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));
    }
}
