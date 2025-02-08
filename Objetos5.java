package ObjetosJava;

import java.util.Scanner;
public class Objetos5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Credenciais corretas
        String usuarioCorreto = "Arthur";
        String senhaCorreta = "1234";


        System.out.print("Digite o nome de usuário: ");
        String usuarioInput = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senhaInput = sc.nextLine();


        boolean autenticado = autenticar(usuarioInput, senhaInput, usuarioCorreto, senhaCorreta);


        mostrarResultado(autenticado);

        sc.close();
    }

    public static boolean autenticar(String usuarioInput, String senhaInput, String usuarioCorreto, String senhaCorreta) {
        if (usuarioInput.equals(usuarioCorreto) && senhaInput.equals(senhaCorreta)) {
            return true;
        } else {
            return false;
        }
    }

    public static void mostrarResultado(boolean autenticado) {
        if (autenticado) {
            System.out.println("Autenticação bem-sucedida! Bem-vindo.");
        } else {
            System.out.println("Nome de usuário ou senha incorretos. Tente novamente.");
        }
    }
}
