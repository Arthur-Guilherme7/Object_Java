package Progams;

import Entity.Object_2;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a média do aluno: ");
        int media = sc.nextInt();

        Object_2 object_2 = new Object_2 (media);

        sc.close();


        System.out.println("O Aluno está: " + object_2);


    }
}
