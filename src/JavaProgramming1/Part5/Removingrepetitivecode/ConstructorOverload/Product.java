package JavaProgramming1.Part5.Removingrepetitivecode.ConstructorOverload;

import java.nio.file.LinkOption;

public class Product {
    private String name;
    private String location;
    private int weight;

    public Product(String name){
        this.name=name;
        this.location="shelf";
        this.weight=1;
    }

    public Product(String name, String location){
        this.name=name;
        this.location= location;
        this.weight=1;
    }
    public Product(String name, int weight){
        this.name=name;
        this.location="shelf";
        this.weight=weight;
    }
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }
}
