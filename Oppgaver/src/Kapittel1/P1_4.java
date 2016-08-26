package Kapittel1;

/**
 * Created by RakNoel on 26.08.2016.
 */
public class P1_4 {
    public static void main(String[] args) {
        final double RENTE = 5;
        double renteCalk = RENTE/100;
        final double BALANCE = 1000;
        double tempBalance = BALANCE;
        int yearOutput = 3;

        System.out.println("Year 0: " + tempBalance);

        for (int i = 1; i <= yearOutput; i++){
            tempBalance = tempBalance + (tempBalance * renteCalk);

            System.out.print("Year " + i + ": ");
            System.out.println(tempBalance);
        }
    }
}
