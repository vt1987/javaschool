package week4.week4HomeWork;

public abstract class Aircraft implements FlyingObject {
    private double maxSpeed;

    protected Aircraft(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void fly(){
        System.out.println("Flying...");
    }

    protected double getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return String.format("Aircraft Type: %s. Max Speed: %d MpH.",
                this.getClass().getName(), maxSpeed);
    }
}
