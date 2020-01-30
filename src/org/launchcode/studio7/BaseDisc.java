package org.launchcode.studio7;

public abstract class BaseDisc {
    private String discName;
    private String spinRate;
    private int storageCapacity;

    public BaseDisc(String discName, String spinRate, int storageCapacity){
        this.discName = discName;
        this.spinRate = spinRate;
        this.storageCapacity = storageCapacity;

    }

    public String getSpinRate() {
        return spinRate;
    }

    public void setSpinRate(String spinRate) {
        this.spinRate = spinRate;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getDiscName() {
        return discName;
    }

    public void setDiscName(String discName) {
        this.discName = discName;
    }
}
