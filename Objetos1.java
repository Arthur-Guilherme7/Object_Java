package Objetos_Exercícios;

import java.util.Scanner;

public class Objetos1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int idade;

        System.out.print("Qual a sua idade: ");
        idade = sc.nextInt();

        int Carteira = veri(idade);

        Verificacao(Carteira);

        sc.close();

    }

    public static int veri(int idade){
        int aux = idade;
        if(idade >= 16){
            System.out.println("Você tem a idade necessaria para votar!");
        }else{
            System.out.println("Você não tem a idade necessaria para votar!");
        }


        return (aux);
    }
    public static void Verificacao(int Id) {
        System.out.println("Resultado da consulta : " + Id + " anos ");
    }
}
