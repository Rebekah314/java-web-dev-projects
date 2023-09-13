package technology;

public class Laptop extends Computer {
    private double weightInPounds;
    private boolean keyboardGlows;
    public Laptop(boolean wifiEnabled, boolean portable, double memory, double weightInPounds, boolean keyboardGlows) {
        super(wifiEnabled, portable, memory);
        this.weightInPounds = weightInPounds;
        this.keyboardGlows = keyboardGlows;
    }
    public void setKeyboardGlows() {
        this.keyboardGlows = true;
    }

    public double getWeight() {
        return this.weightInPounds;
    }
    public boolean getKeyboardGlows() {
        return this.keyboardGlows;
    }
}
