package by.epam.learn.datatypes;

public class Main {


    public static void main(String[] args) {


        Double d = Double.POSITIVE_INFINITY;
        System.out.println(d);
        double d1 ;
        d1 = d.intValue() ;
        System.out.println(d1);
        d1 = d1 + Double.NEGATIVE_INFINITY;
        System.out.println(d1);

        int a = 129;
        byte b = 3;
        Object aa = (byte)a;
        System.out.println(aa);
        Object ab = (byte) a + b;
        System.out.println(ab.getClass().getName() + " value: " + ab);
    }
}
