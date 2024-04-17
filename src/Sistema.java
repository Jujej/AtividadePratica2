import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private static List<Funcionario> list = new ArrayList<>();

    private static void cadastrarFuncionario(Funcionario f) {
        list.add(f);
    }

    private static String buscarFuncionario(String nome) {

        String funcionario = "";
        boolean encontrou = false;

        for (Funcionario temp : list) {

            if (temp.getNome().equals(nome)) {
                funcionario += temp.toString();
                encontrou = true;
            }

        }

        if (encontrou) {
            return funcionario;
        }

        return "Funcionário " + nome + " não localizado...";
    }

    private static void editarFuncionario(String nome, Funcionario f) {
        for (Funcionario temp : list) {
            if (temp.getNome().equals(nome)) {
                // Verifica o tipo do funcionário
                if (temp instanceof Professor) {
                    // Se for um Professor, faz o downcast e modifica o atributo 'materia'
                    temp.setNome(f.getNome());
                    temp.setMatricula(f.getMatricula());
                    ((Professor) temp).setMateria(((Professor) f).getMateria());
                } else if (temp instanceof Coordenador) {
                    // Se for um Coordenador, faz o downcast e modifica o atributo 'departamento'
                    temp.setNome(f.getNome());
                    temp.setMatricula(f.getMatricula());
                    ((Coordenador) temp).setDepartamento(((Coordenador) f).getDepartamento());
                } else if (temp instanceof Diretor) {
                    // Se for um Diretor, faz o downcast e modifica o atributo apropriado
                    // Suponha que o Diretor tenha um atributo 'areaDeAtuacao', por exemplo
                    temp.setNome(f.getNome());
                    temp.setMatricula(f.getMatricula());
                    ((Diretor) temp).setAreaDeAtuacao(((Diretor) f).getAreaDeAtuacao());
                }
                return;
            }
        }
        // Se chegou aqui, significa que o funcionário com o nome especificado não foi
        // encontrado na lista
        System.out.println("Funcionário com nome " + nome + " não encontrado.");
    }

    private static boolean excluirFuncionario(String nome) {

        for (Funcionario temp : list) {
            if (temp.getNome().equalsIgnoreCase(nome)) {
                list.remove(temp);
                return true;
            }
        }

        return false;

    }

    private static void listarFuncionarios() {
        for (Funcionario temp : list) {
            System.out.println(temp.toString());
        }
    }

    private static void excluirTodosFuncionarios() {
        list.clear();
    }
}