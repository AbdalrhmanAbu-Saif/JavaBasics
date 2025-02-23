package JavaProgramming2.Part12.TypeParameters.TypeParameters.Pipe;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Pipe <T>{
    private List<T> pipe;

    public Pipe(){
        this.pipe=new ArrayList<>() ;
    }

    public void putIntoPipe(T value){
        pipe.add(value);
    }

    public T takeFromPipe(){
        if(pipe.size()>0){
            return pipe.remove(0);
        }
        return null;
    }
    public boolean isInPipe(){
        if(pipe.size()>0){
            return true;
        }
        return false;
    }

}
