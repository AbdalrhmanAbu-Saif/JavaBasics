package JavaProgramming2.Part12.TypeParameters.ArrayListAndHashTable.HashMap;

import java.util.List;

public class HashMap <K,V> {
    private List<Pair<K,V>>[] values;
    private int firstIndex;

    public HashMap() {
        this.values = new List[32];
        this.firstIndex = 0;
    }

}
