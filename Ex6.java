/* Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela todos os números pares, e também a quantidade de números pares. */

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers are you entering? ");
        int even = 0, n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0 ; i < vect.length; i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("\nEVEN NUMBERS: ");
        for (int i = 0; i < vect.length; i++){
            if (vect[i] % 2 == 0){
                System.out.printf("%d ", vect[i]);
            }
        }

        for (int i = 0; i < vect.length; i++){
            if (vect[i] % 2 == 0){
                even++;
            }
        }
        System.out.println();
        System.out.printf("EVEN NUMBERS QUANTITY: %d", even);
        sc.close();
    }
}
