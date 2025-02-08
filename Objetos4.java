package ObjetosJava;

import java.util.Random;
import java.util.Scanner;

public class Objetos4 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        Random random = new Random();

        int numeroSorteado = random.nextInt(10) + 1;

        System.out.print("Adivinhe o número entre 1 e 10: ");
        int numeroUsuario = sc.nextInt();

        int aleatorio = max(numeroUsuario, numeroSorteado);


        Resultado(aleatorio);

        sc.close();
    }

    public static int max( int numeroSorteado, int numeroUsuario){

        if (numeroUsuario == numeroSorteado ) {
            System.out.println("Parabéns! Você acertou o número.");
        } else {
            System.out.println("Que pena! O número sorteado foi: " + numeroSorteado);
        }


        return numeroUsuario;
    }
    public static void Resultado(int resul){
        System.out.println();
    }
}
