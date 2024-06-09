package sistemadecinema;

import java.util.Date;
import java.util.List;

/**
 * Classe principal para testar as funcionalidades do sistema de cinema.
 */
public class Programa {

    /**
     * Método principal para testar as funcionalidades do sistema.
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {

        // Questão 1: Cadastro de filme e produto para teste
        GestaoFilme gestaoFilme = new GestaoFilme();
        
        Filme filme1 = new Filme(1, "Matrix", "Ação", 
                "Um hacker descobre a verdade sobre a realidade e sua luta contra as máquinas.",
                "Lana Wachowski, Lilly Wachowski", 136, new Date(), new Date(), new Date(), 0, 0.0, true, true);
        gestaoFilme.cadastrar(filme1);
        
        GestaoProduto gestaoProduto = new GestaoProduto();
        Produto produto1 = new Produto(1, "Produto A", 10.50, new Date(), 50);
        gestaoProduto.cadastrar(produto1);
        Produto produto2 = new Produto(2, "Produto B", 15.50, new Date(), 50);

        // Questão 2: Sistema sendo utilizado por colaboradores e ADM
        // (Esta parte não requer implementação específica no código)

        // Questão 3: Método toString sobrescrito em cada classe
        // (Assumimos que os métodos toString foram sobrescritos nas respectivas classes)

        // Questão 4: Não foi utilizada herança nas classes, foi utilizada interface
        // (Esta parte não requer implementação específica no código)

        // Questão 5: Balcões criados de maneira estática
        // (Esta parte não requer implementação específica no código)

        // Questão 6: Cadastro e atualização de funcionários
        GestaoFuncionario gestaoFuncionario = new GestaoFuncionario();
        Funcionario func = new Funcionario(1, "João Pedro", "Gerente");
        gestaoFuncionario.cadastrar(func);
        
        Funcionario funcAtualizado = new Funcionario(1, "João Pedro Almeida", "Gerente");
        gestaoFuncionario.atualizar(funcAtualizado);

        // Questão 7: Cadastro, atualização, listagem e busca de clientes
        GestaoCliente gestaoCliente = new GestaoCliente();
        Cliente cliente = new Cliente(2, "Maria", "Santos", "987.654.321-00", "Rua B, 456", "(00) 9876-5432");
        Cliente cliente3 = new Cliente(3, "Pedro", "Souza", "456.789.123-00", "Rua C, 789", "(00) 4567-8901");
        Cliente cliente4 = new Cliente(4, "Ana", "Oliveira", "321.654.987-00", "Rua D, 012", "(00) 6543-2109");
        
        gestaoCliente.cadastrar(cliente);
        gestaoCliente.cadastrar(cliente3);
        gestaoCliente.cadastrar(cliente4);
        
        Cliente clienteAtualizado = new Cliente(2, "Maria", "Santos dos Santos", "987.654.321-00", "Rua B, 456", "(00) 9876-5432");
        gestaoCliente.atualizar(clienteAtualizado);
        
        gestaoCliente.listar();
        
        gestaoCliente.buscar(3);
        gestaoCliente.deletar(4);

        // Questão 8: Processamento de vendas
        Cliente clienteVenda = gestaoCliente.buscar(3);
        Filme filmeVenda = gestaoFilme.buscar(1);
        Cliente clienteVenda2 = gestaoCliente.buscar(2);
        Filme filmeVenda2 = gestaoFilme.buscar(1);

        Venda venda1 = new Venda(1, clienteVenda, filmeVenda, List.of(produto1, produto2), 1, 15.0, new Date());
        Venda venda2 = new Venda(2, clienteVenda2, filmeVenda2, List.of(produto2), 2, 6.0, new Date());

        Sistema sistema = new Sistema();
        sistema.iniciarVenda(venda1);
        
        // Geração de resumo da venda
        sistema.gerarResumoAtual();
        
        // Questão 9: Salvamento dos dados do sistema
        
        sistema.salvar();
        gestaoCliente.salvar();
        gestaoFuncionario.salvar();
        gestaoFilme.salvar();
        gestaoProduto.salvar();
        
        
        // Questão 10: Registro da venda
        sistema.registrarVenda(venda1);
        sistema.gerarExtrato(0);

        // Questão 11: Uso de métodos GET e SET privados
        System.out.println("Foram instanciadas a classe cliente: " + cliente.getInstancias() + " vezes");
        
        // Uso do acesso protected
        int instanciasProtected = Cliente.instanciaProtected;
        System.out.println("Foram instanciadas usando protected a classe cliente: " + instanciasProtected + " vezes");
        
        // Questão 12: Contagem de instâncias
        Produto prod = new Produto();
        System.out.println("Foram instanciadas a classe cliente: " + cliente.getInstancias() + " vezes");
        System.out.println("Foram instanciadas a classe Produtos: " + prod.getInstancias() + " vezes");

        // Questão 13: Observações gerais
        // (Esta parte não requer implementação específica no código)

        // Questão 14: Método salvar
        // O método salvar é implementado para salvar os dados em arquivos JSON.
        
        //Questão 15: Gerar o JavaDocs
        // Todo ó programa erstá comentado de modo a gerar o Javadocs
    }
}
