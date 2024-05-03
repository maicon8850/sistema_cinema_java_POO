package sistemadecinema;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class WR {
        
    private String informacao;
    private String nomeArquivo;
    
    public WR(String informacao, String nomeArquivo) {
        this.informacao = informacao;
        this.nomeArquivo = nomeArquivo;
    }
    
    public void escreverNoArquivo() {
        try {
            // Obtém o diretório de trabalho atual
            String diretorioTrabalho = System.getProperty("user.dir");
            
            // Cria o caminho completo para o arquivo dentro do pacote "database"
            String caminhoCompleto = diretorioTrabalho + "/src/database/" + nomeArquivo;
            
            // Cria um objeto FileWriter
            FileWriter escritor = new FileWriter(caminhoCompleto);
            
            // Cria um objeto BufferedWriter para escrever de forma eficiente
            BufferedWriter bufferEscrita = new BufferedWriter(escritor);
            
            // Escreve no arquivo
            bufferEscrita.write(informacao);
            
            // Fecha o BufferedWriter (isso também fecha o FileWriter)
            bufferEscrita.close();
            
            System.out.println("Conteúdo escrito com sucesso no arquivo.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
