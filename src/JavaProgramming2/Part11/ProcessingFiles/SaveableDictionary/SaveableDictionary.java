package JavaProgramming2.Part11.ProcessingFiles.SaveableDictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {
    private String file;
    private HashMap<String, String> dictionary;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (dictionary.containsKey(word) || dictionary.containsKey(translation)) {
            return;
        }
        dictionary.put(word, translation);
        dictionary.put(translation, word);
    }

    public String translate(String word) {
        return dictionary.get(word);
    }

    public void delete(String word) {
        if (!dictionary.containsKey(word)) {
            return;
        }
        String translation = dictionary.get(word);
        dictionary.remove(word);
        dictionary.remove(translation);
    }
    public SaveableDictionary(String file) {
        dictionary = new HashMap<>();
        this.file = file;
    }
    public boolean load() {
        try {
            File file = new File(this.file);
            Scanner fileReader = new Scanner(file);

            // Read each line from the file
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");

                // Add the word and translation to the dictionary
                if (parts.length == 2) {
                    add(parts[0].trim(), parts[1].trim());
                }
            }
            fileReader.close();
            return true;
        } catch (FileNotFoundException e) {
            // Return false if the file can't be found or opened
            System.out.println("Error: File not found.");
            return false;
        }

    }
    public boolean save() {
        try {
            FileWriter writer = new FileWriter(this.file);

            // Write each word and its translation to the file
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue() + "\n");
            }

            writer.close();
            return true;
        } catch (IOException e) {
            // Return false if the file can't be written
            System.out.println("Error: Unable to save the file.");
            return false;
        }
    }


}


