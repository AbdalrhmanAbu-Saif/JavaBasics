package JavaProgramming1.Part6.Objectsonaistandalistaspartofanobject.Menu;

public class PrintingtheMeals   {
    public static void main(String[] args){

        Menu menu = new Menu();
        menu.addMeal("Tofu ratatouille");
        menu.addMeal("Chilli Coconut Chicken");
        menu.addMeal("Chilli Coconut Chicken");
        menu.addMeal("Meatballs with mustard sauce");

        menu.printMeals();
    }
}
