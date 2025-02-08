package Objetos_Exercícios;

import java.util.Scanner;

public class Objetos3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número: ");

       int altura = sc.nextInt();

       int size = high(altura);

       Tamanho(size);

       sc.close();


    }

    public static int high(int altura){
        if(altura >=150 && altura <= 160){
            System.out.println("Você é considerada uma pessoa baixa!");

        }else if(altura >=160 && altura <=175){
            System.out.println("Você é considerada uma pessoa média!");

        }else if(altura >=175 && altura <= 200){
            System.out.println("Você é considerada uma pessoa alta!");

    }
        return (altura);
    }

    public static void Tamanho(int calc) {
        System.out.println("Altura: " + calc);

    }

}

