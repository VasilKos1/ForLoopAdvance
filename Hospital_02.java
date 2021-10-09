package BASIC.Additional_Problems_MIX.ForLoop;

import java.util.Scanner;

public class Hospital_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        int doctors = 7;            //Difficult !!! seen solution from other !!!
        int treatedPatients = 0;
        int unTreatedPatients = 0;

        //Всеки трети ден, болницата прави изчисления и ако броят на непрегледаните пациенти е по-голям от броя на прегледаните, се назначава още един лекар.
        for (int i = 1; i <= count; i++) {
            int totalPerDay = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0 && unTreatedPatients > treatedPatients) {
                doctors++;  //назначаването става преди да започне приемът на пациенти за деня.
            }
            if (totalPerDay <= doctors) {
                treatedPatients += totalPerDay;
            } else {
                treatedPatients += doctors;
                unTreatedPatients = unTreatedPatients + (totalPerDay - doctors);
            }


        }
        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", unTreatedPatients);
    }


}

