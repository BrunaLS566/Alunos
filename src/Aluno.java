public class Aluno {
    //atributos
String nome;
String sobrenome;
String nota;



    //contrutor padrão

    public Aluno(String nome, String sobrenome, String nota) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nota = nota;
    }

    //metodos


    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
