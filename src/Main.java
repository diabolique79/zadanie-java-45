import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        Integer liczba = 0;
        int liczba1 = Integer.valueOf(liczba);
//        System.out.println("Wpisz liczbę parzystą: ");
//        liczba = scanner.nextInt();

        while ((liczba%2==0)){

            System.out.println("Wpisz liczbę parzystą: ");
            liczba = scanner.nextInt();
            list.add(liczba);
        }
        if (liczba%2==1){

            list.remove(list.size()-1);
            System.out.println(list);
        }

        int sum=0;
        int i = 0;
        for (i = 0; i < list.size(); i++) {

            sum = sum + list.get(i);

        }

        System.out.println(" = " + sum);


        //wyświetlanie odwrotne tablicy
        for (int j = list.size() -1; j >= 0; j--) {

            System.out.println(list.get(j));
        }
        Integer max = Collections.max(list);
        System.out.println("Wartość maksymalna to: " + max);
        Integer min = Collections.min(list);
        System.out.println("Wartość minimalna to: " + min);


    }
}
