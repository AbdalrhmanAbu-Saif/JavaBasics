package JavaProgramming1.Part3.List;

import java.util.ArrayList;

public class RemoveLast {
    public  static  void  main( String[] args) {

        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);

    }

    public static void removeLast(ArrayList<String> strings){

        int lst= strings.size()-1;

        if(strings.size()==0){
            return;
        }
        strings.remove(lst);

    }

}
