package Entity;

import java.util.Random;

public class Object_4 {
    private String resultado;
    private Random random;
    public int numeroSorteado;
    public int numeroUsuario;


    public Object_4(int numeroUsuario) {
        this.random = new Random();
        this.numeroUsuario = numeroUsuario;


        this.numeroSorteado = random.nextInt(10) + 1;


        if (numeroUsuario == numeroSorteado) {
            this.resultado = "Parabéns! Você acertou o número.";
        } else {
            this.resultado = "Que pena! O número sorteado foi: " + numeroSorteado;
        }
    }


    @Override
    public String toString() {
        return resultado;
    }
}