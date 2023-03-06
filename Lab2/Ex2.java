package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wielkość tablicy:");
        int size = scanner.nextInt();

        System.out.println("Podaj pierwszą pozycje: ");
        int first = scanner.nextInt();

        int[] tab = new int[size];

        tab[0] = first;

        if (size >= 2){
            int next;
            if(first % 2 == 1){
                next = first + 1;
            }
            else {
                next = first + 2;
            }
            tab[1] = next;
        }

        if(size >= 3){
            for(int i = 2; i < size; i++){
                tab[i] = tab[i-1] + 2;
            }
        }

        System.out.println(Arrays.toString(tab));

    }




}
