package BASIC.Additional_Problems_MIX.ForLoop;

import java.util.Scanner;

public class BackToThePast_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyInherited = Double.parseDouble(scanner.nextLine());
        int yearToLiveTo = Integer.parseInt(scanner.nextLine());

        //int oddYearCounter = 0;
        int beginAge = 18;

        for (int i = 1800; i <= yearToLiveTo; i++) {
            if (i % 2 == 0) {                         //i%2== ; not yearToLive %2 -> otherwise year will be always even or odd, depending on the initial input of year
                moneyInherited -= 12000;
                beginAge++;                       //counter is increased after calculations !!!
            } else {
                moneyInherited -= (12000 + 50 * (beginAge));
                beginAge++;                      //counter is increased after calculations !!!
            }
        }

        if (moneyInherited >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", Math.abs(moneyInherited));
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(moneyInherited));
        }

    }
}
