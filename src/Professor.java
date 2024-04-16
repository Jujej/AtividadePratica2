public class Professor extends Funcionario {

    private String materia;

    public Professor() {
    }

    public Professor(String nome, int matricula, String materia) {
        super(nome, matricula);
        this.materia = materia;
    }
    
    public String getMateria() {
        return materia;
    }
    
    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    @Override
    public String toString() {
        return "Professor [materia=" + materia + ", toString()=" + super.toString() + "]";
    }
}
