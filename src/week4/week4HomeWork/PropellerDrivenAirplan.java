package week4.week4HomeWork;

public class PropellerDrivenAirplan extends Aircraft implements GlidingObject {
    public PropellerDrivenAirplan() {
        super(620);
    }

    @Override
    public void glide() {
        System.out.println("Gliding...");
    }

    @Override
    public String toString() {
        return super.toString() + " Can glide.";
    }
}
