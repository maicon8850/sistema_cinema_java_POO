package sistemadecinema;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa um balcão de atendimento em um cinema.
 */
public class BalcaoAtendimento {
    // Lista estática para armazenar os balcões de atendimento
    private static List<BalcaoAtendimento> balcoesCinema = new ArrayList<>();

    // Inicializador estático para adicionar os balcões de atendimento
    static {
        // Adicione os 5 balcões de atendimento
        balcoesCinema.add(new BalcaoAtendimento("Balcão 1"));
        balcoesCinema.add(new BalcaoAtendimento("Balcão 2"));
        balcoesCinema.add(new BalcaoAtendimento("Balcão 3"));
        balcoesCinema.add(new BalcaoAtendimento("Balcão 4"));
        balcoesCinema.add(new BalcaoAtendimento("Balcão 5"));
    }

    // Nome do balcão de atendimento
    private String nome;

    /**
     * Construtor para inicializar o balcão com um nome.
     * @param nome O nome do balcão de atendimento.
     */
    public BalcaoAtendimento(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a lista de balcões de atendimento do cinema.
     * @return A lista de balcões de atendimento.
     */
    public static List<BalcaoAtendimento> getBalcoesCinema() {
        return balcoesCinema;
    }

    /**
     * Obtém o nome do balcão de atendimento.
     * @return O nome do balcão de atendimento.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do balcão de atendimento.
     * @param nome O nome do balcão de atendimento.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
