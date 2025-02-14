package Programs;

import Entity.Object_5;

import java.util.Scanner;

public class Program5 {
    private Object_5 obj;

    public Program5(String usuarioCorreto) {
        obj = new Object_5( usuarioCorreto);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.print("Digite o nome de usuário: ");
        String usuarioCorreto = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senhaCorreto = sc.nextLine();


        sc.close();

        Program5 program5 = new Program5(usuarioCorreto);

        System.out.println(program5.obj);
    }




    }

