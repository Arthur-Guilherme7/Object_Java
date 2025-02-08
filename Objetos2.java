package Objetos_Exercícios;

import java.util.Scanner;

public class Objetos2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a média do aluno: ");
        int media = sc.nextInt();

        int nota = calc(media);

        Resultado(media);

        sc.close();

    }

    public static int calc(int media){

        if (media >= 7.0) {
            int Media;
            System.out.println("Aluno Aprovado!");
        } else if (media >= 5.0 && media < 7.0) {
            System.out.println("Aluno em Recuperação.");
        } else {
            System.out.println("Aluno Reprovado.");
        }
        return media;
    }
    public static void Resultado(int resul){
        System.out.println( resul);

    }

}
