package JavaProgramming2.Part11.Exceptions.SensorsAndTemperature;

public class StandardSensor implements  Sensor{
    private final int value;

    public StandardSensor(int value) {
        this.value = value;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
    }

    @Override
    public void setOff() {
    }

    @Override
    public int read() {
        return this.value;
    }



}
