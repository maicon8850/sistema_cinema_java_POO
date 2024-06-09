package sistemadecinema;

import java.util.Comparator;

/**
 * Classe que define comparadores para a classe Cliente.
 */
public class ClienteComparator {

    /**
     * Comparador para ordenar os clientes pelo nome.
     */
    public static Comparator<Cliente> nomeComparator = new Comparator<Cliente>() {
        @Override
        public int compare(Cliente c1, Cliente c2) {
            return c1.getNome().compareTo(c2.getNome());
        }
    };

    /**
     * Comparador para ordenar os clientes pelo sobrenome.
     */
    public static Comparator<Cliente> sobrenomeComparator = new Comparator<Cliente>() {
        @Override
        public int compare(Cliente c1, Cliente c2) {
            return c1.getSobrenome().compareTo(c2.getSobrenome());
        }
    };
}
