package BASIC.Additional_Problems_MIX.ForLoop;

import java.util.Scanner;

public class EqualPairs_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pairsCount = Integer.parseInt(scanner.nextLine());      // 87/100
        int lastSum=0;
        //int max = Integer.MIN_VALUE;
        int diff =0;

        for (int i = 1; i <=pairsCount ; i++) {
            int n1 = Integer.parseInt(scanner.nextLine());
            int n2 = Integer.parseInt(scanner.nextLine());
            int sum= n1+n2;
            diff = Math.abs(lastSum-sum);
            lastSum=sum;      // this is to offset the initial diff of lastSum =0 and next sum
        }
        if (diff==0){
            System.out.printf("Yes, value=%d",lastSum);
        } else {
            System.out.printf("No, maxdiff=%d",diff);
        }
    }
}
