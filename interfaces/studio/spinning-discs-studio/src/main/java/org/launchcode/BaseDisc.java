package org.launchcode;

public abstract  class BaseDisc {
    private String name;
    private String type;
    private double storageCapacity;
    private String content;
    private double spinSpeed;

    public BaseDisc(String name, String type, double storageCapacity, String content, double spinSpeed) {
        this.name = name;
        this.type = type;
        this.storageCapacity = storageCapacity;
        this.content = content;
        this.spinSpeed = spinSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(double spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    abstract void spin();
    public void reportLogistics() {
        System.out.println("The " + this.getType() + ", " + this.getName() + ", has a storage capacity of "
                + this.getStorageCapacity() + " GB to store " + this.getContent() + " data.");
    }
}
