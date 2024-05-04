package sistemadecinema;

import java.util.Scanner;
import java.util.List;

public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        // Instância dos gerenciadores
        GerenciarFuncionario gerenciarFuncionario = new GerenciarFuncionario();

        do {
            // Exibe o menu de opções
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Buscar Funcionário");
            System.out.println("3 - Cadastrar Funcionário");
            System.out.println("4 - Cadastrar Produto");
            System.out.println("5 - Editar Funcionário");
            System.out.println("6 - Editar Produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Método para cadastrar cliente (implementação necessária)
                    //cadastrarCliente();
                    break;
                case 2:
                    System.out.print("Informe o ID do funcionário: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    
                    Funcionario searchResult = gerenciarFuncionario.buscar(id);
                    System.out.println("ID: " + searchResult.getIdFuncionario());
                    System.out.println("Nome: " + searchResult.getNome());
                    break;
                case 3:
                    // Método para cadastrar funcionário
                    System.out.println("Cadastrando funcionário...");

                    // Obtém a lista de balcões de atendimento da classe BalcaoAtendimento
                    List<BalcaoAtendimento> balcoesAtendimento = BalcaoAtendimento.getBalcoesCinema();

                    // Solicita os dados do funcionário ao usuário
                    System.out.print("Informe o ID do funcionário: ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Informe o nome do funcionário: ");
                    String nome = scanner.nextLine();

                    System.out.print("Informe o cargo do funcionário: ");
                    String cargo = scanner.nextLine();

                    System.out.print("O funcionário tem acesso às despesas? (true/false): ");
                    boolean acessoDespesas = scanner.nextBoolean();
                    scanner.nextLine();

                    System.out.print("O funcionário tem acesso ao balanço mensal? (true/false): ");
                    boolean acessoBalancoMensal = scanner.nextBoolean();
                    scanner.nextLine();

                    System.out.print("O funcionário tem acesso aos relatórios? (true/false): ");
                    boolean acessoRelatorios = scanner.nextBoolean();
                    scanner.nextLine();

                    System.out.print("O funcionário tem acesso ao estoque? (true/false): ");
                    boolean acessoEstoque = scanner.nextBoolean();
                    scanner.nextLine();

                    // Implemente a lógica para cadastrar o funcionário aqui
                    Funcionario funcionario = new Funcionario(id, nome, cargo, acessoDespesas, acessoBalancoMensal, acessoRelatorios, acessoEstoque, balcoesAtendimento);
                    gerenciarFuncionario.cadastrar(funcionario);
                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;
                case 4:
                    // Método para cadastrar produto
                    //gerenciarProdutos.cadastrar();
                    break;
                case 5:
                    // Método para editar funcionário
                    //gerenciarFuncionario.editar();
                    break;
                case 6:
                    // Método para editar produto
                    //gerenciarProdutos.editar();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }


}
