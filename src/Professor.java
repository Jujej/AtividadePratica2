public class Professor extends Funcionario {

    // atributos
    private String materia;

    //getters e setters
    public String getMateria() {
        return materia;
    }
    
    public void setMateria(String materia) {
        this.materia = materia;
    }

    // construtores
    public Professor() {
    }

    public Professor(String nome, int matricula, String materia) {
        super(nome, matricula);
        this.materia = materia;
    }
    
    // to string
    @Override
    public String toString() {
        String txt = "Professor [materia=" + materia + ", toString()=" + super.toString() + "]";
        return txt;
    }
}
