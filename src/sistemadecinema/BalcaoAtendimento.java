package sistemadecinema;

import java.util.ArrayList;
import java.util.List;

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

    // Construtor para inicializar o balcão com um nome
    public BalcaoAtendimento(String nome) {
        this.nome = nome;
    }

    // Método estático para obter a lista de balcões de atendimento
    public static List<BalcaoAtendimento> getBalcoesCinema() {
        return balcoesCinema;
    }

    // Método para obter o nome do balcão
    public String getNome() {
        return nome;
    }

    // Método para definir o nome do balcão
    public void setNome(String nome) {
        this.nome = nome;
    }
}
