package sistemadecinema;

import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        // Instância dos gerenciadores
        GestaoFuncionario gestaoFuncionario = new GestaoFuncionario();
        GestaoCliente gestaoCliente = new GestaoCliente();

        // Criando os objetos Cliente com os dados falsos
        Cliente cliente1 = new Cliente(1, "João", "Silva", "123.456.789-00", "Rua A, 123", "(00) 1234-5678");
        Cliente cliente2 = new Cliente(2, "Maria", "Santos", "987.654.321-00", "Rua B, 456", "(00) 9876-5432");
        Cliente cliente3 = new Cliente(3, "Pedro", "Souza", "456.789.123-00", "Rua C, 789", "(00) 4567-8901");
        Cliente cliente4 = new Cliente(4, "Ana", "Oliveira", "321.654.987-00", "Rua D, 012", "(00) 6543-2109");
        Cliente cliente5 = new Cliente(5, "Lucas", "Ferreira", "789.123.456-00", "Rua E, 345", "(00) 8901-2345");

        // Adicionando os clientes ao GestaoCliente
        gestaoCliente.cadastrar(cliente1);
        gestaoCliente.cadastrar(cliente2);
        gestaoCliente.cadastrar(cliente3);
        gestaoCliente.cadastrar(cliente4);
        gestaoCliente.cadastrar(cliente5);

        // Exibindo os clientes cadastrados
        gestaoCliente.listar();
       
        
        //Buscando um cliente especifico
        gestaoCliente.buscar(5);
        
        //Editando cliente
        Cliente clienteAtualizado = new Cliente(5, "Lucas", "Almeida", "789.123.456-00", "Rua E, 345", "(00) 8901-2345");
        gestaoCliente.atualizar(clienteAtualizado);
        
        //listando cliente editado
        gestaoCliente.buscar(5);
        
        //excluindo Cliente
        gestaoCliente.deletar(4);
        
        // Exibindo os clientes cadastrados
        gestaoCliente.listar();
        
        
        //Salvando cliente
        List arrayCliente = gestaoCliente.getListaCliente();
        gestaoCliente.salvar(arrayCliente);
 
                    
       
    }
}
