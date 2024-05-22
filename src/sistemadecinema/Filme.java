package sistemadecinema;

import java.util.Date;
import org.json.JSONObject;

/**
 * Esta classe representa um filme no sistema de cinema.
 */
public class Filme {
    // Atributos
    private int idFilme;                // Identificador único do filme
    private String titulo;              // Título do filme
    private String estilo;              // Estilo do filme (ex: Ação, Comédia, Drama)
    private String sinopse;             // Sinopse do filme
    private String diretor;             // Diretor do filme
    private int duracao;                // Duração do filme em minutos
    private Date dataLancamento;        // Data de lançamento do filme
    private Date dataInicioExibicao;    // Data de início de exibição do filme no cinema
    private Date dataFimExibicao;       // Data de fim de exibição do filme no cinema
    private int numeroAssistencias;     // Número de vezes que o filme foi assistido
    private double avaliacao;           // Avaliação média do filme
    private boolean legendado;          // Indica se o filme está disponível legendado
    private boolean dublado;            // Indica se o filme está disponível dublado

    // Construtor padrão
    public Filme(){

    }

    public Filme(int idFilme, String titulo, String estilo, String sinopse, String diretor, int duracao, Date dataLancamento, Date dataInicioExibicao, Date dataFimExibicao, int numeroAssistencias, double avaliacao, boolean legendado, boolean dublado) {
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.estilo = estilo;
        this.sinopse = sinopse;
        this.diretor = diretor;
        this.duracao = duracao;
        this.dataLancamento = dataLancamento;
        this.dataInicioExibicao = dataInicioExibicao;
        this.dataFimExibicao = dataFimExibicao;
        this.numeroAssistencias = numeroAssistencias;
        this.avaliacao = avaliacao;
        this.legendado = legendado;
        this.dublado = dublado;
    }
    
    

    // Métodos Getters e Setters

    /**
     * Obtém o ID do filme.
     *
     * @return O ID do filme.
     */
    public int getIdFilme() {
        return idFilme;
    }

    /**
     * Define o ID do filme.
     *
     * @param idFilme O ID do filme.
     */
    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    /**
     * Obtém o título do filme.
     *
     * @return O título do filme.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o título do filme.
     *
     * @param titulo O título do filme.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtém o estilo do filme.
     *
     * @return O estilo do filme.
     */
    public String getEstilo() {
        return estilo;
    }

    /**
     * Define o estilo do filme.
     *
     * @param estilo O estilo do filme.
     */
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    /**
     * Obtém a sinopse do filme.
     *
     * @return A sinopse do filme.
     */
    public String getSinopse() {
        return sinopse;
    }

    /**
     * Define a sinopse do filme.
     *
     * @param sinopse A sinopse do filme.
     */
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    /**
     * Obtém o diretor do filme.
     *
     * @return O diretor do filme.
     */
    public String getDiretor() {
        return diretor;
    }

    /**
     * Define o diretor do filme.
     *
     * @param diretor O diretor do filme.
     */
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    /**
     * Obtém a duração do filme.
     *
     * @return A duração do filme.
     */
    public int getDuracao() {
        return duracao;
    }

    /**
     * Define a duração do filme.
     *
     * @param duracao A duração do filme.
     */
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    /**
     * Obtém a data de lançamento do filme.
     *
     * @return A data de lançamento do filme.
     */
    public Date getDataLancamento() {
        return dataLancamento;
    }

    /**
     * Define a data de lançamento do filme.
     *
     * @param dataLancamento A data de lançamento do filme.
     */
    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    /**
     * Obtém a data de início de exibição do filme.
     *
     * @return A data de início de exibição do filme.
     */
    public Date getDataInicioExibicao() {
        return dataInicioExibicao;
    }

    /**
     * Define a data de início de exibição do filme.
     *
     * @param dataInicioExibicao A data de início de exibição do filme.
     */
    public void setDataInicioExibicao(Date dataInicioExibicao) {
        this.dataInicioExibicao = dataInicioExibicao;
    }

    /**
     * Obtém a data de fim de exibição do filme.
     *
     * @return A data de fim de exibição do filme.
     */
    public Date getDataFimExibicao() {
        return dataFimExibicao;
    }

    /**
     * Define a data de fim de exibição do filme.
     *
     * @param dataFimExibicao A data de fim de exibição do filme.
     */
    public void setDataFimExibicao(Date dataFimExibicao) {
        this.dataFimExibicao = dataFimExibicao;
    }

    /**
     * Obtém o número de assistências do filme.
     *
     * @return O número de assistências do filme.
     */
    public int getNumeroAssistencias() {
        return numeroAssistencias;
    }

    /**
     * Define o número de assistências do filme.
     *
     * @param numeroAssistencias O número de assistências do filme.
     */
    public void setNumeroAssistencias(int numeroAssistencias) {
        this.numeroAssistencias = numeroAssistencias;
    }

    /**
     * Obtém a avaliação do filme.
     *
     * @return A avaliação do filme.
     */
    public double getAvaliacao() {
        return avaliacao;
    }

    /**
     * Define a avaliação do filme.
     *
     * @param avaliacao A avaliação do filme.
     */
    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    /**
     * Verifica se o filme está disponível legendado.
     *
     * @return true se o filme está disponível legendado, caso contrário false.
     */
    public boolean isLegendado() {
        return legendado;
    }

    /**
     * Define se o filme está disponível legendado.
     *
     * @param legendado true se o filme está disponível legendado, caso contrário false.
     */
    public void setLegendado(boolean legendado) {
        this.legendado = legendado;
    }

    /**
     * Verifica se o filme está disponível dublado.
     *
     * @return true se o filme está disponível dublado, caso contrário false.
     */
    public boolean isDublado() {
        return dublado;
    }

    /**
     * Define se o filme está disponível dublado.
     *
     * @param dublado true se o filme está disponível dublado, caso contrário false.
     */
    public void setDublado(boolean dublado) {
        this.dublado = dublado;
    }

        // Método para converter o Filme em um JSONObject
    /**
     * Converte o objeto Filme em um objeto JSONObject.
     *
     * @return Um JSONObject contendo as informações do filme.
     */
    public JSONObject toJson() {
        JSONObject jsonFilme = new JSONObject(); // Cria um novo objeto JSONObject

        // Adiciona as informações do filme ao JSONObject
        jsonFilme.put("idFilme", this.idFilme);
        jsonFilme.put("titulo", this.titulo);
        jsonFilme.put("estilo", this.estilo);
        jsonFilme.put("sinopse", this.sinopse);
        jsonFilme.put("diretor", this.diretor);
        jsonFilme.put("duracao", this.duracao);
        jsonFilme.put("dataLancamento", this.dataLancamento.toString()); // Salva a data de lançamento como string
        jsonFilme.put("dataInicioExibicao", this.dataInicioExibicao.toString()); // Salva a data de início de exibição como string
        jsonFilme.put("dataFimExibicao", this.dataFimExibicao.toString()); // Salva a data de fim de exibição como string
        jsonFilme.put("numeroAssistencias", this.numeroAssistencias);
        jsonFilme.put("avaliacao", this.avaliacao);
        jsonFilme.put("legendado", this.legendado);
        jsonFilme.put("dublado", this.dublado);

        return jsonFilme; // Retorna o JSONObject representando o filme
    }
    /**
     * Retorna uma representação em string do objeto Filme.
     *
     * @return Uma string representando o objeto Filme.
     */
    @Override
    public String toString() {
        return "Filme{" +
                "idFilme=" + idFilme +
                ", titulo='" + titulo + '\'' +
                ", estilo='" + estilo + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", diretor='" + diretor + '\'' +
                ", duracao=" + duracao +
                ", dataLancamento=" + dataLancamento +
                ", dataInicioExibicao=" + dataInicioExibicao +
                ", dataFimExibicao=" + dataFimExibicao +
                ", numeroAssistencias=" + numeroAssistencias +
                ", avaliacao=" + avaliacao +
                ", legendado=" + legendado +
                ", dublado=" + dublado +
                '}';
    }
}
