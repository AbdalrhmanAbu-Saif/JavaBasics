package JavaProgramming2.Part11.ProcessingFiles.SaveableDictionary;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class MainPart3 {
    public static void main(String[] args) {
        SaveableDictionary dictionary = new SaveableDictionary("/home/trainee1/JavaBasics_copy/src/JavaProgramming2/Part11/ProcessingFiles/SaveableDictionary/words.txt");
        boolean wasSuccessful = dictionary.load();

        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));

    }

}
