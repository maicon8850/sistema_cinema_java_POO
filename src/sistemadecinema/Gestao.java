package sistemadecinema;
import java.util.List;

/**
 * Esta interface define um conjunto de métodos básicos para gerir objetos de qualquer tipo T.
 * Os métodos definidos nesta interface são comuns a todas as classes de gerenciamento.
 * 
 * @param <T> o tipo de objeto que será gerenciado
 */
public interface Gestao<T> {
    
    /**
     * Cadastra um objeto do tipo T.
     * 
     * @param objeto o objeto a ser cadastrado
     */
    void cadastrar(T objeto);
    
    
    /**
     * Salva um objeto do tipo T.
     * 
     * 
     */
    void salvar();
    
    /**
     * Busca um objeto do tipo T pelo seu identificador (id).
     * 
     * @param id o identificador do objeto a ser buscado
     * @return o objeto encontrado, ou null se não for encontrado
     */
    T buscar(int id);
    
    /**
     * Lista todos os objetos do tipo T.
     * 
     * @return uma lista contendo todos os objetos do tipo T
     */
    List<T> listar();
    
    /**
     * Atualiza um objeto do tipo T.
     * 
     * @param objeto o objeto a ser atualizado
     */
    void atualizar(T objeto);
    
    /**
     * Deleta um objeto do tipo T pelo seu identificador (id).
     * 
     * @param id o identificador do objeto a ser deletado
     */
    void deletar(int id);
}
