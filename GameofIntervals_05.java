package BASIC.Additional_Problems_MIX.ForLoop;

import java.util.Scanner;

public class GameofIntervals_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        double count0to9 = 0;
        double count10to19 = 0;
        double count20to29 = 0;
        double count30to39 = 0;
        double count40to49 = 0;
        double countLess0Greater50 = 0;
        double sum = 0;

        for (int i = 1; i <= count; i++) {
            int current = Integer.parseInt(scanner.nextLine());
            if (current >= 0 && current <= 9) {
                count0to9++;
                sum += current*0.20;
            } else if (current >= 10 && current <= 19) {
                count10to19++;
                sum += current*0.30;
            } else if (current >= 20 && current <= 29) {
                count20to29++;
                sum += current*0.40;
            } else if (current >= 30 && current <= 39) {
                count30to39++;
                sum += 50;
            } else if (current >= 40 && current <= 50) {    // 50 included here
                count40to49++;
                sum += 100;
            } else if (current < 0 || current > 50) {
                countLess0Greater50++;
                sum=sum/2;
            }
        }
        System.out.printf("%.2f%n",sum);

        double aver0to9 = (double) count0to9/count*100;
        double aver10to19 = (double) count10to19/count*100;
        double aver20to29 = (double) count20to29/count*100;
        double aver30to39 = (double) count30to39/count*100;
        double aver40to49 = (double) count40to49/count*100;
        double aver50More = (double) countLess0Greater50/count*100;

        System.out.printf("From 0 to 9: %.2f%%%n",aver0to9);
        System.out.printf("From 10 to 19: %.2f%%%n",aver10to19);
        System.out.printf("From 20 to 29: %.2f%%%n",aver20to29);
        System.out.printf("From 30 to 39: %.2f%%%n",aver30to39);
        System.out.printf("From 40 to 50: %.2f%%%n",aver40to49);      // 40 to 50 !!! otherwise gives 0/100
        System.out.printf("Invalid numbers: %.2f%%%n",aver50More);

    }
}
