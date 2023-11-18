/* Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver. */

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many people are you entering? ");
        int minors = 0, n = sc.nextInt();

        People[] vect = new People[n];
        double sum = 0, avg;

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.printf("Person %d data:\n", i + 1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            vect[i] = new People(name, age, height);
        }

        for (int i = 0; i < vect.length; i++){
            sum += vect[i].getHeight();
        }
        avg = sum / vect.length;
        System.out.printf("\nAverage height: %.2f\n", avg);

        for (int i = 0; i < vect.length; i++){ 
            if (vect[i].getAge() < 16){
                minors++;
            }
        }
        double percentage = (minors / vect.length) * 100;
        System.out.println("People younger than 16 years old: " + percentage + "%");
        for (int i = 0; i < vect.length; i++){ 
            if (vect[i].getAge() < 16){
                System.out.println(vect[i].getName());
            }
        }
        sc.close();
    }
}
