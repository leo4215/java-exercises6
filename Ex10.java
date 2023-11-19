/* Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for digitado, mostrar a mensagem "NENHUM NUMERO PAR" */

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements will the vector have? ");
        int even = 0, n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }

        double sum = 0, avg;
        for (int i = 0; i < vect.length; i++){
            if (vect[i] % 2 == 0) {
                sum += vect[i];
                even++;
            }
        }
        
        if (even == 0){
            System.out.println("NO EVEN NUMBERS");
        } else {
            avg = sum / even;
            System.out.printf("EVEN NUMBERS AVERAGE = %.1f", avg);
        }
        sc.close();
    }
}
