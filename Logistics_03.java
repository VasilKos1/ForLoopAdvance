package BASIC.Additional_Problems_MIX.ForLoop;

import java.util.Scanner;

public class Logistics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        double total = 0;
        double microbus = 0;
        double truck = 0;
        double train = 0;

        for (int i = 1; i <= count; i++) {
            int tonnagePer1 = Integer.parseInt(scanner.nextLine());
            if (tonnagePer1 <= 3) {
                microbus += tonnagePer1;
            } else if (tonnagePer1 <= 11) {
                truck += tonnagePer1;
            } else {
                train += tonnagePer1;
            }
            total += tonnagePer1;
        }
        double averMicribus = microbus / total * 100;
        double averTruck = truck / total * 100;
        double averTrain = train / total * 100;

        double averTotol = (microbus * 200 + truck * 175 + train * 120) / total;

        System.out.printf("%.2f%n", averTotol);
        System.out.printf("%.2f%%%n", (double) averMicribus);
        System.out.printf("%.2f%%%n", (double) averTruck);
        System.out.printf("%.2f%%%n", (double) averTrain);


    }

}

