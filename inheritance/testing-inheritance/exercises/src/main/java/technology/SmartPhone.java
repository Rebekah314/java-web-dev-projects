package technology;

public class SmartPhone extends Computer {
    private boolean takePicture;
    private boolean receivePhoneCall;
    public SmartPhone(boolean wifiEnabled, boolean portable, double memory, boolean takePicture, boolean receivePhoneCall) {
        super(wifiEnabled, portable, memory);
        this.takePicture = takePicture;
        this.receivePhoneCall = receivePhoneCall;
    }
    public void setTakePicture() {
        this.takePicture = true;
    }

    public boolean getTakePicture() {
        return this.takePicture;
    }
    public void setReceivePhoneCall() {
        this.receivePhoneCall = true;
    }
    public boolean getReceivePhoneCall() {
        return this.receivePhoneCall;
    }
}
