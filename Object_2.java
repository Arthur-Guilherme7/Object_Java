package Entity;

public class Object_2 {
    private String resultado;
    public int media;


    public Object_2(int media) {
        this.media = media;
        if (media >= 7.0) {
            this.resultado = "Aluno Aprovado!";
        } else if (media >= 5.0 && media < 7.0) {
            this.resultado = "Aluno em Recuperação.";
        } else {
            this.resultado = "Aluno Reprovado.";
        }
    }


        @Override
        public String toString() {
            return
                    "resultado = ' " + resultado + '\'' ;
        }
    }


