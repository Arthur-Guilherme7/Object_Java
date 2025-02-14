package OOP;

public class Object_1 {
    private String resultado;
    public int idade;

    public Object_1(int idade) {
        this.idade = idade;
        if (idade >= 16) {
            this.resultado = "Você tem a idade necessaria para votar!";
        } else {
            this.resultado = "Você não tem idade necessaria para votar!";
        }
    }

    @Override
    public String toString() {
        return
                "resultado='" + resultado + '\''

                ;
    }
}


