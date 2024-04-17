package sistemadecinema;

import java.util.Date;

/**
 * Classe que representa um filme.
 */
class Filme {
    // Atributos da classe Filme
    private int idFilme; // Identificador do filme
    private String titulo; // Título do filme
    private String estilo; // Estilo do filme (por exemplo, ação, comédia, drama)
    private String sinopse; // Sinopse do filme
    private String diretor; // Diretor do filme
    private int duracao; // Duração do filme em minutos
    private Date dataLancamento; // Data de lançamento do filme
    private Date dataInicioExibicao; // Data de início da exibição do filme
    private Date dataFimExibicao; // Data de fim da exibição do filme
    private int numeroAssistencias; // Número de assistências do filme

    // Construtor da classe Filme
    public Filme(int idFilme, String titulo, String estilo, String sinopse, String diretor, int duracao, Date dataLancamento, Date dataInicioExibicao, Date dataFimExibicao, int numeroAssistencias) {
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
    }

    // Métodos getters e setters para acessar e modificar os atributos
    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Date getDataInicioExibicao() {
        return dataInicioExibicao;
    }

    public void setDataInicioExibicao(Date dataInicioExibicao) {
        this.dataInicioExibicao = dataInicioExibicao;
    }

    public Date getDataFimExibicao() {
        return dataFimExibicao;
    }

    public void setDataFimExibicao(Date dataFimExibicao) {
        this.dataFimExibicao = dataFimExibicao;
    }

    public int getNumeroAssistencias() {
        return numeroAssistencias;
    }

    public void setNumeroAssistencias(int numeroAssistencias) {
        this.numeroAssistencias = numeroAssistencias;
    }
}
