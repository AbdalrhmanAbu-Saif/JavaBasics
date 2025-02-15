package JavaProgramming1.Part6.Objectsonaistandalistaspartofanobject.PrintingaCollection;

import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> elements;

    // Constructor
    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    // Adds an element to the collection
    public void add(String element) {
        this.elements.add(element);
    }

    // toString method to print the collection
    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("The collection ").append(this.name).append(" has ").append(this.elements.size()).append(" element");
            if (this.elements.size() > 1) {
                sb.append("s");
            }
            sb.append(":\n");

            for (String element : this.elements) {
                sb.append(element).append("\n");
            }
            return sb.toString().trim();  // Remove trailing newline
        }
    }
}
