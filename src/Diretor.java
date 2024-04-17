public class Diretor extends Funcionario {

    // atributos
    private String areaDeAtuacao;

    //getters e setters
    public String getAreaDeAtuacao() {
        return areaDeAtuacao;
    }
    
    public void setAreaDeAtuacao(String areaDeAtuacao) {
        this.areaDeAtuacao = areaDeAtuacao;
    }

    // construtores
    public Diretor() {
    }

    public Diretor(String nome, int matricula, String areaDeAtuacao) {
        super(nome, matricula);
        this.areaDeAtuacao = areaDeAtuacao;
    }
    
    // to string
    @Override
    public String toString() {
        String txt = "Diretor [areaDeAtuacao=" + areaDeAtuacao + ", toString()=" + super.toString() + "]";
        return txt;
    }
    
}
