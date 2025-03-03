package JavaProgramming2.Part9.ClassInheritance.Warehousing;

public class MainProductWarehouseWithHistory {
    public static void main(String[] args) {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);           // Juice: balance = 989.7, space left 10.3

// etc

// however, history() still doesn't work properly:
        System.out.println(juice.history()); // [1000.0]
// so we only get the initial state of the history set by the constructor...
    }
}
