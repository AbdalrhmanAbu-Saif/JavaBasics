package JavaProgramming2.Part11.Exceptions.SensorsAndTemperature;

public class MainPart1 {

    public static void main(String[] args) {

    StandardSensor ten = new StandardSensor(10);
    StandardSensor minusFive = new StandardSensor(-5);

    System.out.println(ten.read());
    System.out.println(minusFive.read());

    System.out.println(ten.isOn());
    ten.setOff();
    System.out.println(ten.isOn());

    }

}
