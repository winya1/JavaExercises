package application;

public class StandardSensor implements Sensor {
    private int integer;

    public StandardSensor (int integer) {
        this.integer = integer;
    }


    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

        return;
    }

    @Override
    public void setOff() {

        return;
    }

    @Override
    public int read() {
        return this.integer;
    }
}
