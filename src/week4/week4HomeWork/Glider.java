package week4.week4HomeWork;

public class Glider extends Aircraft implements GlidingObject {

    public Glider (){
        super(150);
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
