package technology;

public class Computer extends AbstractEntity {
    private boolean wifiEnabled;
    private boolean portable;
    private double memory;

    public Computer(boolean wifiEnabled, boolean portable, double memory) {
        this.wifiEnabled = wifiEnabled;
        this.portable = portable;
        this.memory = memory;
    }

    public void connectToWifi() {
        this.wifiEnabled = true;
    }
    public double getMemory() {
        return this.memory;
    }

    public boolean getWifiEnabled() {
        return this.wifiEnabled;
    }
    public boolean getPortable() {
        return this.portable;
    }

}
