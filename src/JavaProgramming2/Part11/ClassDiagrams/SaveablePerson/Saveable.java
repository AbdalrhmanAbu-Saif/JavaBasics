package JavaProgramming2.Part11.ClassDiagrams.SaveablePerson;

public interface Saveable {
    void save();
    void delete();
    void load(String address);
}
