package sistemadecinema;
import java.util.ArrayList;
import java.util.List;
import manipulararquivo.WR;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Esta classe é responsável por gerenciar operações relacionadas aos filmes.
 * Implementa a interface Gestao T onde T é do tipo Filme.
 */
public class GestaoFilme implements Gestao<Filme>{
    
    private List<Filme> arrayFilmes;
    
    /**
     * Construtor da classe GestaoFilme.
     * Inicializa a lista de filmes.
     */
    public GestaoFilme(){
        arrayFilmes = new ArrayList<>();
    }
    
    /**
     * Retorna a lista de filmes.
     * @return A lista de filmes.
     */
    public List<Filme> getListaFilme(){
        return arrayFilmes;
    }
    
    /**
     * Cadastra um novo filme.
     * @param objeto O filme a ser cadastrado.
     */
    @Override
    public void cadastrar(Filme objeto) {
        arrayFilmes.add(objeto);
    }

    /**
     * Salva a lista de filmes (não implementado).
     * @param filmes A lista de filmes a ser salva.
     */
    @Override
    public void salvar(List<Filme> filmes) {
        try {
            JSONArray jsonArrayFilmes = new JSONArray(); // Cria um novo array JSON

            // Itera sobre a lista de clientes
            for (Filme filme : filmes) {
                // Cria um objeto JSON para cada cliente e adiciona ao array JSON
                JSONObject jsonFilme = new JSONObject();
                jsonFilme.put("idFilme", filme.getIdFilme());
                jsonFilme.put("titulo", filme.getTitulo());
                jsonFilme.put("estilo", filme.getEstilo());
                jsonFilme.put("sinopse", filme.getSinopse());
                jsonFilme.put("diretor", filme.getDiretor());
                jsonFilme.put("duracao", filme.getDuracao());
                
            }

            // Converte o array JSON em uma string
            String jsonString = jsonArrayFilmes.toString();

            // Escreve a string JSON no arquivo
            WR utilitarioArquivo = new WR();
            utilitarioArquivo.escreverNoArquivo(jsonString, "filmes.json", true);

            System.out.println("Filmes salvos com sucesso.");
        } catch (Exception e) {
            // Trata exceções
            System.out.println("Ocorreu um erro ao salvar os Filmes: " + e.getMessage());
        }
    }

    /**
     * Busca um filme pelo ID.
     * @param id O ID do filme a ser buscado.
     * @return O filme encontrado ou null se não encontrado.
     */
    @Override
    public Filme buscar(int id) {
        Filme filmeEncontrado = null;

        // Itera sobre a lista de filmes
        for (Filme filme : arrayFilmes) {
            // Verifica se o ID do filme corresponde ao ID procurado
            if (filme.getIdFilme() == id) {
                // Se encontrar, atribui o filme encontrado à variável filmeEncontrado e interrompe o loop
                filmeEncontrado = filme;
                break;
            }
        }

        // Se o filme não for encontrado, imprime uma mensagem
        if (filmeEncontrado == null) {
            System.out.println("Filme não encontrado.");
        } else {
            // Se o filme for encontrado, imprime suas informações
            System.out.println("Filme encontrado:");
            System.out.println("ID: " + filmeEncontrado.getIdFilme());
            System.out.println("Título: " + filmeEncontrado.getTitulo());
            System.out.println("Sinopse: " + filmeEncontrado.getSinopse());
        }

        return filmeEncontrado;
    }

    /**
     * Lista todos os filmes cadastrados.
     * @return A lista completa de filmes.
     */
    @Override
    public List<Filme> listar() {
        for (Filme filme : arrayFilmes){
            System.out.println(filme.getIdFilme() + " " + filme.getTitulo());
        }
        return arrayFilmes;
    }

    /**
     * Atualiza as informações de um filme.
     * @param filmeAtualizado O filme com as informações atualizadas.
     */
    @Override
    public void atualizar(Filme filmeAtualizado) {
        int index = -1;
        
        // Itera sobre a lista de filmes
        for(int i = 0; i < arrayFilmes.size(); i++){
            // Verifica se o ID do filme atual corresponde ao ID do filme atualizado
            if(arrayFilmes.get(i).getIdFilme() == filmeAtualizado.getIdFilme()){
                // Se encontrar, armazena o índice e interrompe o loop
                index = i;
                break;
            }
        }
        
        // Verifica se o filme foi encontrado
        if (index != -1){
            // Atualiza as informações do filme na lista com base no índice
            arrayFilmes.set(index, filmeAtualizado);
        } else {
            System.out.println("Filme não encontrado");
        }
    }

    /**
     * Exclui um filme da lista.
     * @param id O ID do filme a ser excluído.
     */
    @Override
    public void deletar(int id) {
       int index = -1;
       
       // Itera sobre a lista de filmes
       for(int i = 0; i<arrayFilmes.size(); i++){
           // Verifica se o ID do filme atual corresponde ao ID fornecido
           if(arrayFilmes.get(i).getIdFilme() == id){
               // Se encontrar, armazena o índice e interrompe o loop
               index = i;
               break;
           }
       }
       
       // Verifica se o filme foi encontrado
       if(index != -1){
           // Remove o filme da lista com base no índice
           arrayFilmes.remove(index);
           System.out.println("Filme excluído com sucesso");
       } else {
           System.out.println("Filme não encontrado");
       }
    }
}
