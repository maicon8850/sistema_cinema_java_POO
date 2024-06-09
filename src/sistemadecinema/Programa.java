package sistemadecinema;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        
        //Cadastro de filme e produto para teste
        GestaoFilme gestaoFilme = new GestaoFilme();
        //Filmes
        Filme filme1 = new Filme(1, "Matrix", "Ação", "Um hacker descobre a verdade sobre a realidade e sua luta contra as máquinas.",
                "Lana Wachowski, Lilly Wachowski", 136, new Date(), new Date(), new Date(), 0, 0.0, true, true);
        gestaoFilme.cadastrar(filme1);
        
        GestaoProduto gestaoProduto = new GestaoProduto();
        Produto produto1 = new Produto(1, "Produto A", 10.50, new Date(), 50);
        gestaoProduto.cadastrar(produto1);
        Produto produto2 = new Produto(2, "Produto B", 15.50, new Date(), 50);
        
        //--------Questao 1 ---------------
        //Classes implementadas
        //--------Questao 2 ---------------
        //Sistema sendo utilizados por colaboradores e ADM
        //--------Questao 3 ---------------
        //Método ToString sobrescritos em cada classe
        
        //--------Questao 4 ---------------
        //Não foi utilizado herança nas classes, foi utilizado classe de interface
        
        //--------Questao 5  ---------------
        //Balcões criados de maneira estática 
        
        //--------Questao 6 ---------------
        GestaoFuncionario gestaoFuncionario = new GestaoFuncionario();
        Funcionario func = new Funcionario(1, "João Pedro", "Gerente");
        gestaoFuncionario.cadastrar(func);
        
        Funcionario funcAtualizado = new Funcionario(1, "João Pedro Almeida", "Gerente");
        gestaoFuncionario.atualizar(funcAtualizado);
        
        //--------Questao 7 ---------------
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
        
        //--------Questao 8 ---------------
        //Vendas 
       
        Cliente clienteVenda = gestaoCliente.buscar(3);
        Filme filmeVenda = gestaoFilme.buscar(1);
        Cliente clienteVenda2 = gestaoCliente.buscar(2);
        Filme filmeVenda2 = gestaoFilme.buscar(1);
    
        
        Venda venda1 = new Venda(1, clienteVenda, filmeVenda, List.of(produto1, produto2), 1, 15.0, new Date());
        Venda venda2 = new Venda(2, clienteVenda2, filmeVenda2, List.of(produto2), 2, 6.0, new Date());
        
        
        Sistema sistema = new Sistema();
        sistema.iniciarVenda(venda1);
        //Extrato da venda
        sistema.gerarResumoAtual();
        
        
        //------- Questao 9
        //Chamar os método de  salvar
        //Cadastros realizados dinâmicamente na funcao cadastrar
        //sistema.registrarVenda();
        //gestaoCliente.salvar();
        //gestaoFilme.salvar();
        //gestaoFuncionario.salvar();
        //gestaoProduto.salvar();
        sistema.salvar();
        
        //-------- Questao 10
        //Gerar o extrato e salvar 
        sistema.registrarVenda(venda1);
        //--------Questao 11
        //uso do PRIVATE método GET E SET, houve necessidade de instanciar a classe e somente podemos acessar
        //As intsnacias através do método GET 
        System.out.println("Foram instanciadas a classe cliente: "+ cliente.getInstancias() + " vezes");
        
        //Uso do proteceted, permite o acesso direto dentro do mesmo pacote 
        int instanciasProtected = Cliente.instanciaProtected;
        System.out.println("Foram instanciadas Usnado Protected a classe cliente: "+ instanciasProtected + " vezes");
        
        
        
        //-----Questao 12
        
        Produto prod = new Produto();
        System.out.println("Foram instanciadas a classe cliente: " + cliente.getInstancias() + "vezes");
        System.out.println("Foram instanciadas a classe Produtos: " +prod.getInstancias()+ "vezes");
        
        //----- Questão 13
        //Metodo salvar pois é salvo no JSON
         
        //---Questao 14
        
       // Todos códigos comentadaso em java DOC
        
      
    }
}