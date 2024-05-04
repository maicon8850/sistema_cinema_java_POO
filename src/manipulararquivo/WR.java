package manipulararquivo;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 * Esta classe representa um utilitário para escrever informações em arquivos.
 */
public class WR {
        
    private String informacao;
    private String nomeArquivo;
    
    /**
    * Construtor Padrão
    */
    public WR(){
        
    }
    
    /**
     * Este método é o construtor da classe.
     * Por padrão, todos os arquivos são salvos no diretório atual/src/database/.
     * @param informacao Dados que serão escritos no arquivo.
     * @param nomeArquivo Nome do arquivo onde os dados serão salvos.
     */
   
    
    /**
     * Este método escreve as informações no arquivo.
     * @param informacao Objeto que será escrito no arquivo
     * @param nomeArquivo Nome do arquivo que  será armazenado
     * @param sobrescrever Define se os dados devem ser sobrescritos ou adicionados ao final do arquivo.
     */
    public void escreverNoArquivo(String informacao, String nomeArquivo, boolean sobrescrever) {
        try {
            // Obtém o diretório de trabalho atual
            String diretorioTrabalho = System.getProperty("user.dir");
            
            // Cria o caminho completo para o arquivo dentro do pacote "database"
            String caminhoCompleto = diretorioTrabalho + "/src/database/" + nomeArquivo;

            // Verifica se o arquivo já existe
            File arquivo = new File(caminhoCompleto);
            if (!arquivo.exists() || !arquivo.isFile()) {
                arquivo.createNewFile();
            }
            
            // Cria um objeto FileWriter para escrever no arquivo
            FileWriter escritor = new FileWriter(arquivo, !sobrescrever);
            
            // Cria um objeto BufferedWriter para escrever de forma eficiente
            BufferedWriter bufferEscrita = new BufferedWriter(escritor);
            
            // Escreve as informações no arquivo
            bufferEscrita.write(informacao);
            bufferEscrita.newLine(); // Adiciona uma quebra de linha
            
            // Fecha o BufferedWriter (isso também fecha o FileWriter)
            bufferEscrita.close();
            
            System.out.println("Conteúdo escrito com sucesso no arquivo.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
