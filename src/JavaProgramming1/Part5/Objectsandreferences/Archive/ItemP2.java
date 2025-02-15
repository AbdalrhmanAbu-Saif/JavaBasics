package JavaProgramming1.Part5.Objectsandreferences.Archive;

public class ItemP2 {
    String identifier;
    String name;

    ItemP2(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    // Items are considered the same if their identifiers are the same
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return identifier.equals(item.identifier);
    }

    @Override
    public String toString() {
        return identifier + ": " + name;
    }
}
