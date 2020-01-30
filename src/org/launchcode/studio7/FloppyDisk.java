package org.launchcode.studio7;

import java.util.ArrayList;

public class FloppyDisk extends BaseDisc implements Disc {
    private ArrayList<String> dataStored = new ArrayList<>();

    public FloppyDisk(String discName, String spinRate, int storageCapacity) {
        super(discName, spinRate, storageCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A Floppy Disk spins at a rate of " + this.getSpinRate() + " rpm.");
    }

    @Override
    public void readDisc() {
        System.out.println("Floppy Disk Name: " + getDiscName());
        System.out.println("Floppy Disk Capacity: " + getStorageCapacity() + " mb.");
        for(int i = 0; i<dataStored.size(); i++){
            System.out.println(dataStored.get(i));
        }
    }

    @Override
    public void writeDisc(String data) {
        dataStored.add(data);
    }
}
