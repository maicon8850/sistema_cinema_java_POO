package sistemadecinema;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        // Instância dos gerenciadores
        GerenciarFuncionario gerenciarFuncionario = new GerenciarFuncionario();
        GerenciarCliente gerenciarCliente = new GerenciarCliente();
        
        System.out.println("Buscando Cliente...");
        gerenciarCliente.buscar(3);
        System.out.println("Buscando Funcionario...");
        gerenciarFuncionario.buscar(2);
        
        // Solicita os dados do funcionário ao usuário
//        System.out.print("Informe o ID do cliente: ");
//        int idCliente = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("Informe o nome do cliente: ");
//        String nomeCliente = scanner.nextLine();
//
//        System.out.print("Informe o sobrenome do cliente: ");
//        String sobrenome = scanner.nextLine();
//        System.out.print("Informe o sobrenome do cpf: ");
//        String cpf = scanner.nextLine();
//        System.out.print("Informe o sobrenome do endereco: ");
//        String endereco = scanner.nextLine();
//        System.out.print("Informe o sobrenome do telefone: ");
//        String telefone = scanner.nextLine();
//
//
//        Cliente cliente = new Cliente(idCliente, nomeCliente, sobrenome, cpf, endereco,telefone);
//        gerenciarCliente.cadastrar(cliente);
  

       
//        System.out.print("Informe o ID do funcionário: ");
//        int id = scanner.nextInt();
//        scanner.nextLine();
//        gerenciarFuncionario.buscar(id);
//
//              
//        System.out.println("Cadastrando funcionário...");
//
//
//        // Solicita os dados do funcionário ao usuário
//        System.out.print("Informe o ID do funcionário: ");
//        id = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("Informe o nome do funcionário: ");
//        String nome = scanner.nextLine();
//
//        System.out.print("Informe o cargo do funcionário: ");
//        String cargo = scanner.nextLine();
//
//
//        Funcionario funcionario = new Funcionario(id, nome, cargo);
//        gerenciarFuncionario.cadastrar(funcionario);
//
//
//        System.out.println("Saindo do programa...");
                    
       
    }
}
