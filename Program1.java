package OOP;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);



        System.out.print("Qual a sua idade: ");
        int idade = sc.nextInt();

        Project project = new Project(idade);

        sc.close();


        System.out.println("Resultado da consulta : " + idade + " anos ");
        System.out.println(project);


    }



}
