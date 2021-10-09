package BASIC.Additional_Problems_MIX.ForLoop;

import java.util.Scanner;

public class FootballLeague_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());   //	Броят на всички фенове – цяло число

        int fansA=0;
        int fansB=0;
        int fansV=0;
        int fansG=0;
        int sumAll=0;

        for (int i = 1; i <=fans ; i++) {        //За всеки един фен, на отделен ред се прочита
            String sector = scanner.nextLine();   //текст – "A", "B", "V" и "G".
            if (sector.equals("A")){
                fansA++;
            } else if (sector.equals("B")){
                fansB++;
            }else if (sector.equals("V")){
                fansV++;
            }else if (sector.equals("G")){
                fansG++;
            }
            sumAll++;
        }
        double percentAll = (double)fans/capacity*100;
        double percentA= (double)fansA/sumAll*100;
        double percentB= (double)fansB/sumAll*100;
        double percentV= (double)fansV/sumAll*100;
        double percentG= (double)fansG/sumAll*100;

        System.out.printf("%.2f%%%n",percentA);
        System.out.printf("%.2f%%%n",percentB);
        System.out.printf("%.2f%%%n",percentV);
        System.out.printf("%.2f%%%n",percentG);
        System.out.printf("%.2f%%%n",percentAll);
    }
}
