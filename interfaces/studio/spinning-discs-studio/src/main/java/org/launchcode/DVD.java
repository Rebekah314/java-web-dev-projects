package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {


    public DVD(String name, String type, double storageCapacity, String content, double spinSpeed) {
        super(name, type, storageCapacity, content, spinSpeed);
    }

    @Override
    void spin() {
        System.out.println( "A DVD spins at " + this.getSpinSpeed() + " rpm.");
    }

    @Override
    public void storeData() {
        System.out.println( "A DVD can store " + this.getStorageCapacity() + " GB.");
    }

    @Override
    public String readData() {
        return "Reading DVD data...";
    }

    @Override
    public void writeData() {
        System.out.println("Writing DVD data...");
    }

}
