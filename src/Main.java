
import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Program do obliczania sumy, maksymalnej i minamalnej wartości wprowadzonych przez użytkownika liczb dodatnich. Program zakończy się po wpisaniu pierwszej ujemnej wartości.");
        readNumbers(list);
        sumNumbers(list);
        printReverse(list);
        max(list);
        min(list);


    }

    public static void readNumbers(ArrayList list) {

        Scanner scanner = new Scanner(System.in);
        Integer liczba = 0;

        while ((liczba >= 0)) {

            System.out.println("Wpisz liczbę dodatnią: ");
            liczba = scanner.nextInt();
            list.add(liczba);
        }
        if (liczba < 0) {

            list.remove(list.size() - 1);
            System.out.println(list);
        }
    }

    public static void sumNumbers(ArrayList list) {

        System.out.println("Suma wartości w tablicy: ");
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            list.get(i);
            sum = sum + ((Integer) list.get(i));
            Integer z = list.size() - 1;
            if(i == z) {
                System.out.print(list.get(i) + " = ");
            }else System.out.print(list.get(i) + " + ");

        }

        System.out.println(sum);

    }

    public static void printReverse(ArrayList list) {

        System.out.println("Tablica w odwrotnej kolejności: ");
        for (int j = list.size() - 1; j >= 0; j--) {

            System.out.print(list.get(j) + " ");

        }
        System.out.println(" ");
    }

    public static void max(ArrayList list) {

        int max = (Integer) list.get(0);

        for (int i = 0; i < list.size(); i++) {

            if (max < (Integer) list.get(i)) {

                max = (Integer) list.get(i);
            }

        }
        System.out.println("Wartość maksymalna to: " + max);

    }

    public static void min(ArrayList list) {

        int min = (Integer) list.get(0);

        for (int i = 0; i < list.size(); i++) {

            if (min > (Integer) list.get(i)) {

                min = (Integer) list.get(i);
            }

        }
        System.out.println("Wartość minimalna to: " + min);

    }


}






