/* Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. */

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values will each vector have? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0, avg;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }
        avg = sum / vect.length;
        System.out.printf("\nVECTOR AVERAGE = %.3f\n", avg);
        System.out.println("ELEMENTS UNDER THE AVERAGE:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < avg) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
