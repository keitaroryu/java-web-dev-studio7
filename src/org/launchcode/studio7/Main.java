package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD soundtracks = new CD("Movie Soundtracks","200-400", 512);
        DVD movies = new DVD("Movies","500-800", 3000);
        VinylRecord beatles = new VinylRecord("Beatles Classics", "20-40", 23);
        FloppyDisk windows = new FloppyDisk("Windows OS", "300", 2);

        soundtracks.writeDisc("Aladdin Soundtrack");
        soundtracks.writeDisc("Lion King Soundtrack");
        soundtracks.writeDisc("Mulan Soundtrack");

        movies.writeDisc("Aladdin");
        movies.writeDisc("Lion King");
        movies.writeDisc("Mulan");

        beatles.writeDisc("Hey Jude");
        beatles.writeDisc("Come Together");
        beatles.writeDisc("Eleanor Rigby");

        windows.writeDisc("Windows 95 Operating System");

        soundtracks.spinDisc();
        soundtracks.readDisc();
        System.out.println("-----------------------------");
        movies.spinDisc();
        movies.readDisc();
        System.out.println("-----------------------------");
        beatles.spinDisc();
        beatles.readDisc();
        System.out.println("-----------------------------");
        windows.spinDisc();
        windows.readDisc();


        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
