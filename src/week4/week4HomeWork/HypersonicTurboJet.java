package week4.week4HomeWork;

public class HypersonicTurboJet extends TurboJet {
    public HypersonicTurboJet() {
        super(7300);
    }

    public void fly(boolean hypersonic) {
        if (hypersonic)
            System.out.println("Flying hypersonic...");
        else
            fly();
    }

    @Override
    public String toString() {
        return super.toString() + " Can fly at hypersonic speed.";
    }
}
