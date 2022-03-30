package application;

import java.util.*;

public class TemperatureSensor implements Sensor {
    private boolean isOn;

    public TemperatureSensor() {
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        if (!isOn) {
            isOn = true;
        }
    }

    @Override
    public void setOff() {
        if (isOn) {
            isOn = false;
        }
    }

    @Override
    public int read() {
        if (isOn) {
            Random ran = new Random();
            return ran.nextInt(-30,31);
        } else {
            throw new IllegalStateException("Temperature is set off.");
        }

    }
}
