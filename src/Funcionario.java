public class Funcionario {

    // atributos
    private String nome;
    private int matricula;

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // construtores
    public Funcionario() {
    }

    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // to string
    @Override
    public String toString() {
        String txt = "Funcionario [nome=" + nome + ", matricula=" + matricula + "]";
        return txt;
    }
}
