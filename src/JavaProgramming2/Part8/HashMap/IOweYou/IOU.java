package JavaProgramming2.Part8.HashMap.IOweYou;

import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> iouMap;

    public IOU() {
        this.iouMap = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        iouMap.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return iouMap.getOrDefault(toWhom, 0.0);
    }
}
