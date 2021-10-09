package BASIC.Additional_Problems_MIX.ForLoop;

import java.util.Scanner;

public class Grades_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        double count5More =0;
        double count4More =0;
        double count3More =0;
        double count2More =0;
        double sum=0;    // should be "double", otherwise we are losing punctuality in sum+=grade;


        for (int i = 1; i <= count; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 5) {
                count5More++;
            } else if(grade>=4){
                count4More++;
            }else if(grade>=3){
                count3More++;
            } else {
                count2More++;
            }
            sum+=grade;
        }
        double totalAver = (double) sum/count;

        double percent5 = (double)count5More/count*100;
        double percent4 = (double) count4More/count*100;
        double percent3 = (double)count3More/count*100;
        double percent2 = (double)count2More/count*100;

        //System.out.println(sum);
        System.out.printf("Top students: %.2f%%%n",percent5);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",percent4);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",percent3);
        System.out.printf("Fail: %.2f%%%n",percent2);
        System.out.printf("Average: %.2f%n",totalAver);
    }
}
