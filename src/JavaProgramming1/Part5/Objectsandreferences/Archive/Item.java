package JavaProgramming1.Part5.Objectsandreferences.Archive;

public class Item {

        String identifier;
        String name;

        Item(String identifier, String name) {
            this.identifier = identifier;
            this.name = name;
        }

        @Override
        public String toString() {
            return identifier + ": " + name;
        }
}
