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
        GestaoProduto gestaoProduto = new GestaoProduto();
        Sistema sistema = new Sistema();
    

//Criando os objetos Cliente com os dados falsos
        Cliente cliente1 = new Cliente(1, "João", "Silva", "123.456.789-00", "Rua A, 123", "(00) 1234-5678");
        Cliente cliente2 = new Cliente(2, "Maria", "Santos", "987.654.321-00", "Rua B, 456", "(00) 9876-5432");
        Cliente cliente3 = new Cliente(3, "Pedro", "Souza", "456.789.123-00", "Rua C, 789", "(00) 4567-8901");
        Cliente cliente4 = new Cliente(4, "Ana", "Oliveira", "321.654.987-00", "Rua D, 012", "(00) 6543-2109");
        Cliente cliente5 = new Cliente(5, "Lucas", "Ferreira", "789.123.456-00", "Rua E, 345", "(00) 8901-2345");

       
        //        // Adicionando os clientes ao GestaoCliente
        gestaoCliente.cadastrar(cliente1);
        gestaoCliente.cadastrar(cliente2);
        gestaoCliente.cadastrar(cliente3);
        gestaoCliente.cadastrar(cliente4);
        gestaoCliente.cadastrar(cliente5);
        
        
        
        List arrayCliente = gestaoCliente.getListaClientes();
        gestaoCliente.salvar(arrayCliente);
        
        gestaoCliente.buscar(2);
//
//
//    
//        //Filmes
//        Filme filme1 = new Filme(1, "Matrix", "Ação", "Um hacker descobre a verdade sobre a realidade e sua luta contra as máquinas.",
//                "Lana Wachowski, Lilly Wachowski", 136, new Date(), new Date(), new Date(), 0, 0.0, true, true);
//
//        Filme filme2 = new Filme(2, "Pulp Fiction", "Crime", "Histórias interligadas sobre crime e redenção no submundo de Los Angeles.",
//                "Quentin Tarantino", 154, new Date(), new Date(), new Date(), 0, 0.0, true, true);
//
//        Filme filme3 = new Filme(3, "O Senhor dos Anéis: A Sociedade do Anel", "Fantasia",
//                "Um hobbit é encarregado de destruir um poderoso anel antes que ele caia nas mãos do mal.",
//                "Peter Jackson", 178, new Date(), new Date(), new Date(), 0, 0.0, true, true);
//
//        Filme filme4 = new Filme(4, "Interestelar", "Ficção Científica",
//                "Um grupo de exploradores viaja pelo espaço em busca de um novo lar para a humanidade.",
//                "Christopher Nolan", 169, new Date(), new Date(), new Date(), 0, 0.0, true, true);
//
//        Filme filme5 = new Filme(5, "Forrest Gump: O Contador de Histórias", "Drama",
//                "Um homem simples vive uma vida extraordinária ao longo de várias décadas.",
//                "Robert Zemeckis", 142, new Date(), new Date(), new Date(), 0, 0.0, true, true);
//        
//        gestaoFilme.cadastrar(filme1);
//        gestaoFilme.cadastrar(filme2);
//        gestaoFilme.cadastrar(filme3);
//        gestaoFilme.cadastrar(filme4);
//        gestaoFilme.cadastrar(filme5);
//        
//
//
//        //Produtos
//         
//        Produto produto1 = new Produto(1, "Produto A", 10.50, new Date(), 50);
//        Produto produto2 = new Produto(2, "Produto B", 20.75, new Date(), 30);
//        Produto produto3 = new Produto(3, "Produto C", 15.20, new Date(), 40);
//        Produto produto4 = new Produto(4, "Produto D", 30.00, new Date(), 20);
//        Produto produto5 = new Produto(5, "Produto E", 25.80, new Date(), 60);
//
//        gestaoProduto.cadastrar(produto1);
//        gestaoProduto.cadastrar(produto2);
//        gestaoProduto.cadastrar(produto3);
//        gestaoProduto.cadastrar(produto4);
//        gestaoProduto.cadastrar(produto5);
//        
//        Venda venda1 = new Venda(1, cliente1, filme1, List.of(produto1, produto2), 1, 15.0, new Date());
//        Venda venda2 = new Venda(2, cliente2, filme2, List.of(produto3), 2, 6.0, new Date());
//        Venda venda3 = new Venda(3, cliente3, filme1, List.of(produto1, produto3), 3, 11.0, new Date());
//        Venda venda4 = new Venda(4, cliente1, filme2, List.of(produto2, produto3), 1, 6.0, new Date());
//        Venda venda5 = new Venda(5, cliente2, filme1, List.of(produto1, produto2, produto3), 2, 16.0, new Date());
//        
//        sistema.iniciarVenda(venda5);
//        sistema.gerarResumoAtual();
//        sistema.registrarVenda();
//        sistema.salvar();
//       
    }
}
