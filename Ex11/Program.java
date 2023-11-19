/* Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome da pessoa mais velha. */

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many people are you entering? ");
        int maxAgeIndex = 0, n = sc.nextInt();

        People[] vect = new People[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.printf("Person %d data:\n", i + 1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            vect[i] = new People(name, age);
        }

        int maxAge = vect[0].getAge();
        for (int i = 0; i < vect.length; i++){
            if (vect[i].getAge() > maxAge){
                maxAge = vect[i].getAge();
                maxAgeIndex = i;
            }
        }

        System.out.printf("OLDEST PERSON: " + vect[maxAgeIndex].getName());
        sc.close();
    }
}
