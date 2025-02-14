package Entity;

public class Object_5 {
    private String Resultado;
    public String usuarioCorreto = "Arthur";
    public String senhaCorreta = "1234";

    public Object_5(String usuarioCorreto) {
        this.usuarioCorreto = usuarioCorreto;
        this.senhaCorreta = senhaCorreta;
    }

    {
        if (usuarioCorreto == usuarioCorreto && senhaCorreta == senhaCorreta) {
            this.Resultado = "Autenticação bem-sucedida! Bem-vindo.";
        } else {
            this.Resultado = "Nome de usuário ou senha incorretos. Tente novamente.";
        }
    }


    @Override
    public String toString() {
        return
                "Resultado='" + Resultado + '\'';
    }
}
