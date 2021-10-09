package BASIC.Additional_Problems_MIX.ForLoop;

import java.util.Scanner;

public class Bills_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        double sumElecticity=0;
        double sumOthers =0;

        for (int i = 1; i <=count ; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());
            sumElecticity+=electricity;
        }
        double sumWater = count*20;
        double sumInternet = count*15;
        sumOthers=(sumElecticity+sumWater+sumInternet)*1.20;
        double sumTotal = sumElecticity+sumWater+sumInternet+sumOthers;
        double average = sumTotal/count;

        System.out.printf("Electricity: %.2f lv%n",sumElecticity);
        System.out.printf("Water: %.2f lv%n",sumWater);
        System.out.printf("Internet: %.2f lv%n",sumInternet);
        System.out.printf("Other: %.2f lv%n",sumOthers);
        System.out.printf("Average: %.2f lv%n",average);

    }
}
