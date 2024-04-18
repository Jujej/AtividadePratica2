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

    public static void menu() {

        int op;

        do {

        // imprimir opções
        System.out.println("\n--MENU--\n");
        System.out.print("Escolha uma opção: ");
        System.out.println("\n1 - Cadastrar");
        System.out.println("2 - Buscar");
        System.out.println("3 - Editar");
        System.out.println("4 - Excluir");
        System.out.println("5 - Listar todos");
        System.out.println("6 - Excluir Todos");
        System.out.println("0 - Sair");

        op = Console.lerInt();

        // switch case para receber o input
        

            String nome;
            int matricula;
            String areaDeAtuacao;
            String materia;
            String departamento;
            Funcionario f;
            int temp = 69;
            f = new Funcionario();

            switch (op) {
                case 1:
                    System.out.println("--CADASTRAR FUNCIONÁRIO--");
                    System.out.print("\nNome: ");
                    nome = Console.lerString();
                    System.out.println("Matrícula: ");
                    matricula = Console.lerInt();
                    System.out.println("Escolha o tipo de Funcionario: ");
                    System.out.println("1 - Diretor");
                    System.out.println("2 - Professor");
                    System.out.println("3 - Coordenador");
                    System.out.println("0 - Voltar");
                    temp = Console.lerInt();

                    if (temp == 1) {
                        System.out.print("Área de atuação: ");
                        areaDeAtuacao = Console.lerString();

                        f = new Diretor(nome, matricula, areaDeAtuacao);
                    }

                    else if (temp == 2) {
                        System.out.print("Matéria: ");
                        materia = Console.lerString();

                        f = new Professor(nome, matricula, materia);
                    }

                    else if (temp == 3) {
                        System.out.println("Departamento: ");
                        departamento = Console.lerString();

                        f = new Coordenador(nome, matricula, departamento);
                    }

                    else {
                        System.out.println("--VOLTANDO AO MENU--");
                    }

                    cadastrarFuncionario(f);

                break;
                case 2:
                    System.out.println("--BUSCAR FUNCIONÁRIO--");
                    System.out.print("\nNome: ");
                    nome = Console.lerString();
                    System.out.println(buscarFuncionario(nome));
                break;
                case 3:    
                    System.out.println("--EDITAR FUNCIONÁRIO--");
                    System.out.print("\nDigite o nome do funcionário que deseja editar: ");
                    nome = Console.lerString();

                    excluirFuncionario(nome);

                    System.out.print("\nNome: ");
                    nome = Console.lerString();
                    System.out.println("Matrícula: ");
                    matricula = Console.lerInt();
                    System.out.println("Escolha o tipo de Funcionario: ");
                    System.out.println("1 - Diretor");
                    System.out.println("2 - Professor");
                    System.out.println("3 - Coordenador");
                    System.out.println("0 - Voltar");
                    temp = Console.lerInt();

                    if (temp == 1) {
                        System.out.print("Área de atuação: ");
                        areaDeAtuacao = Console.lerString();

                        f = new Diretor(nome, matricula, areaDeAtuacao);
                    }

                    else if (temp == 2) {
                        System.out.print("Matéria: ");
                        materia = Console.lerString();

                        f = new Professor(nome, matricula, materia);
                    }

                    else if (temp == 3) {
                        System.out.println("Departamento: ");
                        departamento = Console.lerString();

                        f = new Coordenador(nome, matricula, departamento);
                    }

                    else {
                        System.out.println("--VOLTANDO AO MENU--");
                    }

                    cadastrarFuncionario(f);

    
                break;
                case 4:
                    System.out.println("--EXCLUIR FUNCIONÁRIO--");
                    System.out.print("\nNome: ");
                    nome = Console.lerString();                
                    excluirFuncionario(nome);
                    System.out.println("Usuário excluído com sucesso!");
                break;
                case 5:
                    System.out.println("--LISTAR FUNCIONÁRIOS--");
                    listarFuncionarios();
                    System.out.println("\n");
                break;
                case 6:
                    System.out.println("--EXCLUIR TODOS OS FUNCIONÁRIOS--");
                    excluirTodosFuncionarios();
                    System.out.println("Funcionários excluidos com sucesso!");
                    System.out.println("\n");
                break;
                case 0:
                    System.out.println("--FIM DO PROGRAMA--");
                break;
                default:
                    System.out.println("--OPÇÃO INVÁLIDA! TENTE NOVAMENTE--");
                break;
            }
        } while (op != 0);
    }
}