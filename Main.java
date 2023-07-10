package hw;

public class Main {
    public static void main(String[] args) {
        char charHw = 'G';
        int intHw = 89;
        byte byteHw = 4;
        short shortHw = 56;
        float floatHw = 4.7333436F;
        double doubleHw = 4.355453532;
        long longHw = 12121L;

        System.out.println(charHw);
        System.out.println(intHw);
        System.out.println(byteHw);
        System.out.println(shortHw);
        System.out.println(floatHw);
        System.out.println(doubleHw);
        System.out.println(longHw);

        System.out.println("second way:");

        Character charHw1 = 'G';
        Integer intHw1 = 89;
        Byte byteHw1 = 4;
        Short shortHw1 = 56;
        Float floatHw1 = 4.7333436F;
        Double doubleHw1 = 4.355453532;
        Long longHw1 = 12121L;

        System.out.println(charHw1);
        System.out.println(intHw1);
        System.out.println(byteHw1);
        System.out.println(shortHw1);
        System.out.println(floatHw1);
        System.out.println(doubleHw1);
        System.out.println(longHw1);

        System.out.println("__________________________");

        int x = 345;
        int five = x % 10;
        int four = x / 10 % 10;
        int three = x / 100;
        System.out.println("The first digit is: " + five + ", " + "The second digit is: " + four + ", " + "The third digit is: " + three + ". ");

    }
}



