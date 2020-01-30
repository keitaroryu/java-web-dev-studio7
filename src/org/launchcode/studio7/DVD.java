package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements Disc{
    private ArrayList<String> dataStored = new ArrayList<>();

    public DVD(String discName, String spinRate, int storageCapacity) {
        super(discName, spinRate, storageCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of " + this.getSpinRate() + " rpm.");
    }

    @Override
    public void readDisc() {
        System.out.println("DVD Name: " + getDiscName());
        System.out.println("DVD Capacity: " + getStorageCapacity() + " mb.");
        for(int i = 0; i<dataStored.size(); i++){
            System.out.println(dataStored.get(i));
        }
    }

    @Override
    public void writeDisc(String data) {
        dataStored.add(data);
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
