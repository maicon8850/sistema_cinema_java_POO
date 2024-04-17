
package sistemadecinema;
import java.util.Date;


public class Sistema {

public class Main {
    public static void main(String[] args) {
        // Criando uma instância de Date para utilizar como data de lançamento
        Date dataLancamento = new Date();

        // Criando uma instância de Date para utilizar como data de início de exibição
        Date dataInicioExibicao = new Date();

        // Criando uma instância de Date para utilizar como data de fim de exibição
        Date dataFimExibicao = new Date();

        // Criando uma instância de Filme e incluindo os dados
        Filme filme = new Filme(
            1,                          // ID do filme
            "O Poderoso Chefão",       // Título do filme
            "Drama",                    // Estilo do filme
            "Sinopse do filme",         // Sinopse do filme
            "Francis Ford Coppola",     // Diretor do filme
            175,                        // Duração do filme em minutos
            dataLancamento,             // Data de lançamento do filme
            dataInicioExibicao,         // Data de início da exibição do filme
            dataFimExibicao,            // Data de fim da exibição do filme
            10000                       // Número de assistências do filme
        );

        // Exibindo os detalhes do filme
        System.out.println("Detalhes do Filme:");
        System.out.println("ID: " + filme.getIdFilme());
        System.out.println("Título: " + filme.getTitulo());
        System.out.println("Estilo: " + filme.getEstilo());
        System.out.println("Sinopse: " + filme.getSinopse());
        System.out.println("Diretor: " + filme.getDiretor());
        System.out.println("Duração: " + filme.getDuracao() + " minutos");
        System.out.println("Data de Lançamento: " + filme.getDataLancamento());
        System.out.println("Data de Início de Exibição: " + filme.getDataInicioExibicao());
        System.out.println("Data de Fim de Exibição: " + filme.getDataFimExibicao());
        System.out.println("Número de Assistências: " + filme.getNumeroAssistencias());
    }
}

    }
