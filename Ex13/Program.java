/* Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número de homens. */

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many people are you entering? ");
        int menQuantity = 0, womenQuantity = 0, n = sc.nextInt();

        People[] vect = new People[n];

        for (int i = 0; i < vect.length; i++){
            System.out.printf("Person %d height: ", i + 1);
            double height = sc.nextDouble();
            System.out.printf("Person %d gender: ", i + 1);
            char gender = sc.next().charAt(0);
            vect[i] = new People(height, gender);
        }

        double minHeight = vect[0].getHeight(), maxHeight = vect[0].getHeight(), sum = 0, avg;
        for (int i = 0; i < vect.length; i++){
            if (vect[i].getHeight() < minHeight){
                minHeight = vect[i].getHeight();
            }
            if (vect[i].getHeight() > maxHeight){
                maxHeight = vect[i].getHeight();
            }
            
            if (vect[i].getGender() == 'M'){
                menQuantity++;
            } else {
                sum += vect[i].getHeight();
                womenQuantity++;
            }
        }
        avg = sum / womenQuantity;
        System.out.printf("\nShortest person: %.2f\n", minHeight);
        System.out.printf("Tallest person: %.2f\n", maxHeight);
        System.out.printf("Average women height: %.2f\n", avg);
        System.out.printf("Number of men: %d", menQuantity);

        sc.close();
    }
}
