package JavaProgramming2.Part12.TypeParameters.TypeParameters.Hideout;

public class Hideout<T> {
    private T hideOut;
    public Hideout(){
        hideOut=null;
    }
    public void putIntoHideout(T toHide){
        hideOut=toHide;
    }
    public T takeFromHideout(){
        T tmp =hideOut;
        hideOut=null;
        return tmp;
    }
    public boolean isInHideout(){
        return hideOut!=null;
    }
}
