package org.launchcode.studio7;

import java.util.ArrayList;

public class VinylRecord extends BaseDisc implements Disc{
    private ArrayList<String> dataStored = new ArrayList<>();

    public VinylRecord(String discName, String spinRate, int storageCapacity) {
        super(discName, spinRate, storageCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A Vinyl Record spins at a rate of " + this.getSpinRate() + " rpm.");
    }

    @Override
    public void readDisc() {
        System.out.println("Vinyl Record Name: " + getDiscName());
        System.out.println("Vinyl Record Capacity: " + getStorageCapacity() + " minutes.");
        for(int i = 0; i<dataStored.size(); i++){
            System.out.println(dataStored.get(i));
        }
    }

    @Override
    public void writeDisc(String data) {
        dataStored.add(data);
    }
}
