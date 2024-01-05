/* Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome da pessoa mais velha. */

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many people are you entering? ");
        int n = sc.nextInt(), index = 0;

        String[] name = new String[n];
        int[] age = new int[n];

        int oldest = age[0];
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d data:\n", i + 1);
            sc.nextLine();
            System.out.print("Name: ");
            String names = sc.nextLine();
            System.out.print("Age: ");
            int ages = sc.nextInt();
            name[i] = names;
            age[i] = ages;
        }

        for (int i = 0; i < n; i++) {
            if (age[i] > oldest) {
                oldest = age[i];
                index = i;
            }
        } 

        System.out.printf("OLDEST PERSON: %s", name[index]);
        sc.close();
    }
}
