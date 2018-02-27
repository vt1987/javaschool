package week2;

public class Exs1 {
    public static void main(String[] args) {

//        String a = "Hello,";
//        String b = "World!";
//        String c1 = a + "Java" + b;
//
//        String c2 = String.format("%s Java %s", a, b);
//        System.out.println(c2);
//
//        String c3 = String.join ("", a, " Java ", b);
//        System.out.println(c3);
//
//        int n=7;
//
//        String d1 = "There are " + n + "days in a week";
//        String d2 = String.format("There are %s days in a week", n);
//        System.out.println(d2);
//        ToDo:

//        int a = 200;
//        int b = 50;
//        int c = a + b;
//        int d = c/4*2;
//        int e = 1000 - c*2;
//        int f = (1000 - c)*2;
//        System.out.println("c variable = " + c);
//        System.out.println("d variable = " + d);
//        System.out.println("e variable = " + e);
//        System.out.println("f variable = " + f);

//        double a = 200.0;
//        double b = 50.0;
//        double c = a + b;
//        double d = c/4.0*2.0;
//        double e = 1000.0 - c*2.0;
//        double f = (1000.0 - c)*2.0;
//        String text1 = String.format((" a = %f; b = %f; c = %f; d = %f; e = %f; f = %f"),a,b,c,d,e,f );
//        System.out.println("String format with %f : " + text1);

        double a1 = 200.0;
        double b1 = 50;
        double c1 = a1 + b1;
        double d1 = c1/4.0*2;
        double e1 = 1000 - c1*2;
        double f1 = (1000 - c1)*2;
        System.out.println("String format with %f : " + String.format((" a1 = %f; b1 = %f; c1 = %f; d1 = %f; e1 = %f; f1 = %f"),a1,b1,c1,d1,e1,f1 ));
        System.out.println("String format with %s : " + String.format((" a1 = %s; b1 = %s; c1 = %s; d1 = %s; e1 = %s; f1 = %s"),a1,b1,c1,d1,e1,f1 ));
//        System.out.println("String format with %d : " + String.format((" a1 = %d; b1 = %d; c1 = %d; d1 = %d; e1 = %d; f1 = %d"),a1,b1,c1,d1,e1,f1 ));

        int a2 = 250;
        double b2 = a2;
        double c2 = a2/4*2;
        double d2 = b2/4*2;
        double e21 = a2/4.0*2;
        double e22 = a2/4*2.0;
        System.out.println("String format with %d and %f : " + String.format((" a2 = %d; b2 = %f; c2 = %f; d2 = %f; e21 = %f; e22 = %f"),a2,b2,c2,d2,e21,e22 ));
        System.out.println("String format with %s : " + String.format((" a2 = %s; b2 = %s; c2 = %s; d2 = %s; e21 = %s; e22 = %s"),a2,b2,c2,d2,e21,e22 ));


    }
}
