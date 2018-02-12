package week1;

public class CurrencyConverter {

    private static final Double EUR_TO_USD = 1.22;

    public static void main(String[] args) {
        int parameterCount = args.length;
        if (parameterCount > 1) {
            System.out.println("Expected 1 parameter, but found " + parameterCount);
            return;
        }

        Double eur = Double.parseDouble(args[0]);
        Double usd = eur * EUR_TO_USD;

        System.out.println(eur + " EUR = " + usd + " USD");
    }
}
