package Entity;

public class Object_3 {
    private String resul;
    public int altura;



    public Object_3(int altura) {
        this.altura = altura;
        if(altura >=150 && altura <= 160){
            this.resul = "Você é considerada uma pessoa baixa!";

        }else if(altura >=160 && altura <=175){
            this.resul = "Você é considerada uma pessoa média!";

        }else if(altura >=175 && altura <= 200){
            this.resul = "Você é considerada uma pessoa alta!";

        }

    }
    @Override
    public String toString() {
        return
                "resul= ' " + resul +  '\'';
    }
}

