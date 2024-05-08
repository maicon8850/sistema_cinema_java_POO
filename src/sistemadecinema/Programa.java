package sistemadecinema;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        // Instância dos gerenciadores
        GestaoFuncionario gestaoFuncionario = new GestaoFuncionario();
        GestaoFilme gestaoFilme = new GestaoFilme();
        GestaoCliente gestaoCliente = new GestaoCliente();

        // Criando os objetos Cliente com os dados falsos
//        Cliente cliente1 = new Cliente(1, "João", "Silva", "123.456.789-00", "Rua A, 123", "(00) 1234-5678");
//        Cliente cliente2 = new Cliente(2, "Maria", "Santos", "987.654.321-00", "Rua B, 456", "(00) 9876-5432");
//        Cliente cliente3 = new Cliente(3, "Pedro", "Souza", "456.789.123-00", "Rua C, 789", "(00) 4567-8901");
//        Cliente cliente4 = new Cliente(4, "Ana", "Oliveira", "321.654.987-00", "Rua D, 012", "(00) 6543-2109");
//        Cliente cliente5 = new Cliente(5, "Lucas", "Ferreira", "789.123.456-00", "Rua E, 345", "(00) 8901-2345");
//
//        // Adicionando os clientes ao GestaoCliente
//        gestaoCliente.cadastrar(cliente1);
//        gestaoCliente.cadastrar(cliente2);
//        gestaoCliente.cadastrar(cliente3);
//        gestaoCliente.cadastrar(cliente4);
//        gestaoCliente.cadastrar(cliente5);

//        // Exibindo os clientes cadastrados
//        gestaoCliente.listar();
//       
//        
//        //Buscando um cliente especifico
//        gestaoCliente.buscar(5);
//        
//        //Editando cliente
//        Cliente clienteAtualizado = new Cliente(5, "Lucas", "Almeida", "789.123.456-00", "Rua E, 345", "(00) 8901-2345");
//        gestaoCliente.atualizar(clienteAtualizado);
//        
//        //listando cliente editado
//        gestaoCliente.buscar(5);
//        
//        //excluindo Cliente
//        gestaoCliente.deletar(4);
//        
//        // Exibindo os clientes cadastrados
//        gestaoCliente.listar();
//        
//        
//        //Salvando cliente
//        List arrayCliente = gestaoCliente.getListaCliente();
//        gestaoCliente.salvar(arrayCliente);

//        Funcionario funcionario1 = new Funcionario(1, "José", "Gerente");
//        Funcionario funcionario2 = new Funcionario(2, "Maria", "Assistente de Vendas");
//        Funcionario funcionario3 = new Funcionario(3, "Pedro", "Desenvolvedor");
//        Funcionario funcionario4 = new Funcionario(4, "Ana", "Analista de Recursos Humanos");
//        Funcionario funcionario5 = new Funcionario(5, "Lucas", "Estagiário");
// 
//        gestaoFuncionario.cadastrar(funcionario1);
//        gestaoFuncionario.cadastrar(funcionario2);
//        gestaoFuncionario.cadastrar(funcionario3);
//        gestaoFuncionario.cadastrar(funcionario4);
//        gestaoFuncionario.cadastrar(funcionario5);
//        
//        gestaoFuncionario.listar();
//        gestaoFuncionario.buscar(5);
//        Funcionario funcionarioEditado = new Funcionario(5, "Lucas", "Analista JR");
//        gestaoFuncionario.atualizar(funcionarioEditado);
//        gestaoFuncionario.deletar(2);
//        gestaoFuncionario.listar();
//        List arrayFuncionario = gestaoFuncionario.getListaFuncionario();
//        gestaoFuncionario.salvar(arrayFuncionario);

        Filme filme1 = new Filme(1, "Matrix", "Ação", "Um hacker descobre a verdade sobre a realidade e sua luta contra as máquinas.",
                "Lana Wachowski, Lilly Wachowski", 136, new Date(), new Date(), new Date(), 0, 0.0, true, true);

        Filme filme2 = new Filme(2, "Pulp Fiction", "Crime", "Histórias interligadas sobre crime e redenção no submundo de Los Angeles.",
                "Quentin Tarantino", 154, new Date(), new Date(), new Date(), 0, 0.0, true, true);

        Filme filme3 = new Filme(3, "O Senhor dos Anéis: A Sociedade do Anel", "Fantasia",
                "Um hobbit é encarregado de destruir um poderoso anel antes que ele caia nas mãos do mal.",
                "Peter Jackson", 178, new Date(), new Date(), new Date(), 0, 0.0, true, true);

        Filme filme4 = new Filme(4, "Interestelar", "Ficção Científica",
                "Um grupo de exploradores viaja pelo espaço em busca de um novo lar para a humanidade.",
                "Christopher Nolan", 169, new Date(), new Date(), new Date(), 0, 0.0, true, true);

        Filme filme5 = new Filme(5, "Forrest Gump: O Contador de Histórias", "Drama",
                "Um homem simples vive uma vida extraordinária ao longo de várias décadas.",
                "Robert Zemeckis", 142, new Date(), new Date(), new Date(), 0, 0.0, true, true);
        
        gestaoFilme.cadastrar(filme1);
        gestaoFilme.cadastrar(filme2);
        gestaoFilme.cadastrar(filme3);
        gestaoFilme.cadastrar(filme4);
        gestaoFilme.cadastrar(filme5);
        
        gestaoFilme.buscar(5);
       
    }
}
