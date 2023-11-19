/* Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado. */

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values will each vector have? ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.println("Enter the values for vector A:");
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("\nEnter the values for vector B:");
        for(int i = 0; i < b.length; i++){
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < c.length; i++){
            c[i] = a[i] + b[i];
        }

        System.out.println("RESULTING VECTOR:");
        for (int i = 0; i < c.length; i++){
            System.out.printf("%d\n", c[i]);
        }

        sc.close();
    }
}
