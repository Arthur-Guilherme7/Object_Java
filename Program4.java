package Progams;

import Entity.Object_4;

import java.util.Random;
import java.util.Scanner;

public class Program4 {
    private Object_4 obj;

    public Program4(int numeroUsuario) {
        obj = new Object_4(numeroUsuario);

    }

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        Random random = new Random();

        int numeroSorteado = random.nextInt(10) + 1;

        System.out.print("Adivinhe o número entre 1 e 10: ");
        int numeroUsuario = sc.nextInt();

        sc.close();

        Program4 program4 = new Program4(numeroUsuario);

        System.out.println("O número sorteado foi: " + program4.obj);
    }



    }

