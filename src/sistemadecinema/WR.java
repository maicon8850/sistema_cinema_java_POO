package sistemadecinema;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * Esta classe representa um utilitário para escrever informações em arquivos.
 */
public class WR {
        
    private String informacao;
    private String nomeArquivo;
    
    /**
     * Este método é o construtor da classe.
     * Por padrão, todos os arquivos são salvos no diretório atual/src/database/.
     * @param informacao Dados que serão escritos no arquivo.
     * @param nomeArquivo Nome do arquivo onde os dados serão salvos.
     */
    public WR(String informacao, String nomeArquivo) {
        this.informacao = informacao;
        this.nomeArquivo = nomeArquivo;
    }
    
    /**
     * Este método escreve as informações no arquivo.
     */
    public void escreverNoArquivo() {
        try {
            // Obtém o diretório de trabalho atual
            String diretorioTrabalho = System.getProperty("user.dir");
            
            // Cria o caminho completo para o arquivo dentro do pacote "database"
            String caminhoCompleto = diretorioTrabalho + "/src/database/" + nomeArquivo;
            
            // Cria um objeto FileWriter para escrever no arquivo
            FileWriter escritor = new FileWriter(caminhoCompleto);
            
            // Cria um objeto BufferedWriter para escrever de forma eficiente
            BufferedWriter bufferEscrita = new BufferedWriter(escritor);
            
            // Escreve as informações no arquivo
            bufferEscrita.write(informacao);
            
            // Fecha o BufferedWriter (isso também fecha o FileWriter)
            bufferEscrita.close();
            
            System.out.println("Conteúdo escrito com sucesso no arquivo.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
