package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {


    public CD(String name, String type, double storageCapacity, String content, double spinSpeed) {
        super(name, type, storageCapacity, content, spinSpeed);
    }

    @Override
    void spin() {
        System.out.println( "A CD spins at " + this.getSpinSpeed() + " rpm.");

    }

    @Override
    public void storeData() {
        System.out.println( "A CD can store " + this.getStorageCapacity() + " GB.");

    }

    @Override
    public String readData() {
        return "Reading CD data...";
    }

    @Override
    public void writeData() {
        System.out.println("Writing CD data...");

    }


}
