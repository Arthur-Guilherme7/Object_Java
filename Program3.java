package Progams;

import Entity.Object_3;

import java.util.Scanner;

public class Program3 {
    private Object_3 obj;

    public Program3(int altura){
        obj = new Object_3(altura);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua Altura: ");
        int altura = sc.nextInt();

        sc.close();

        Program3 progam3 = new Program3(altura);

        System.out.println("Sua altura é: " + progam3.obj);





    }


    }

