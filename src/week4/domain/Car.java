package week4.domain;

public class Car {
    private int identNumber;

    public Car(int i) {
        this.identNumber = i;
    }

    @Override
    public int hashCode() {
        return identNumber;
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        if (obj instanceof Car){
            Car c = (Car)obj;

        }
        return this.identNumber == ((Car)obj).identNumber;
    }

    @Override
    public String toString() {
        return "Ident number is " + identNumber;
    }
}
