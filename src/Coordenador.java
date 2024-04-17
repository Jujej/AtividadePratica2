public class Coordenador extends Funcionario {

    // atributos
    private String departamento;

    //getters e setters
    public String getdepartamento() {
        return departamento;
    }
    
    public void setdepartamento(String departamento) {
        this.departamento = departamento;
    }

    // construtores
    public Coordenador() {
    }

    public Coordenador(String nome, int matricula, String departamento) {
        super(nome, matricula);
        this.departamento = departamento;
    }
    
    // to string
    @Override
    public String toString() {
        String txt = "Coordenador [departamento=" + departamento + ", toString()=" + super.toString() + "]";
        return txt;
    }
    
}
