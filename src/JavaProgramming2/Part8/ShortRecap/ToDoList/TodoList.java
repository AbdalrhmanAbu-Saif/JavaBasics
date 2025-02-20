package JavaProgramming2.Part8.ShortRecap.ToDoList;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;
    public TodoList(){
        this.list=new ArrayList<>();
    }

    public void add(String task){
        this.list.add(task);
    }

    public void print(){
        for (int i=0;i<=list.size()-1;i++){
            System.out.println((i+1)+": "+list.get(i));
        }
    }

    public void remove(int number){
        this.list.remove(number-1);
    }


}
