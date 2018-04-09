package week4.week4HomeWork;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Aircraft> aircrafts = new ArrayList();
        aircrafts.add(new Glider());
        aircrafts.add(new PropellerDrivenAirplan());
        aircrafts.add(new TurboJet());
        aircrafts.add(new HypersonicTurboJet());

        for (Aircraft aircraft : aircrafts) {
            System.out.println(aircraft.toString());
        }
    }
}
