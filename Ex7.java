/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, considerando a primeira posição como 0 (zero). */

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number are you digiting? ");
        int index = 0, n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digit a number: ");
            vect[i] = sc.nextDouble();
        }

        double maxValue = vect[0];
        for (int i = 0; i < vect.length; i++) {
            if(vect[i] > maxValue){
                maxValue = vect[i];
                index = i;
            }
        }

        System.out.printf("\nHIGHEST VALUE = %.2f\n", maxValue);
        System.out.printf("HIGHEST VALUE POSITION = %d", index);
        sc.close();
    }
}
