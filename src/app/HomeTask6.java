package app;

public class HomeTask6 {
    static String numIs = "Num is";
    static String sumIs = "sum is";
    static String sumNumbers = "Sum of numbers is ";
    public static void main (String[] args) {

        int totalSum = 0;
        for (int i = 1; i <= 6; i++) {
            totalSum += i;
            System.out.printf("%d) %s %d, %s %d%n",
                    i, numIs, i, sumIs, totalSum);
        }

        int dash = 24;
        for (int a = 0; a < dash; a++) {
            System.out.printf("-");
        }

        System.out.printf("%n%s %d",
                sumNumbers, totalSum);



    }
}
