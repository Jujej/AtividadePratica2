public class Coordenador extends Funcionario {

    private String departamento;

    public Coordenador() {
    }

    public Coordenador(String nome, int matricula, String departamento) {
        super(nome, matricula);
        this.departamento = departamento;
    }
    
    public String getdepartamento() {
        return departamento;
    }
    
    public void setdepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public String toString() {
        return "Coordenador [departamento=" + departamento + ", toString()=" + super.toString() + "]";
    }
    
}
