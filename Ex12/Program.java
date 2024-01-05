/* Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0 (seis). */

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students are you entering? ");
        int n = sc.nextInt();

        Student[] vect = new Student[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.printf("Enter the name, the 1st and the 2nd grade of student %d:\n", i + 1);
            String name = sc.nextLine();
            double grade1 = sc.nextDouble();
            double grade2 = sc.nextDouble();
            vect[i] = new Student(name, grade1, grade2);
        }
        
        System.out.println("\nStudents that passed:");
        for (Student i : vect){
            double finalGrade = (i.getGrade1() + i.getGrade2()) / 2;
            if (finalGrade >= 6){
                System.out.printf("%s\n", i.getName());
            } 
        }
        sc.close();
    }
}
