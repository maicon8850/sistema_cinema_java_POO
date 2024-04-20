import java.util.Date;

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

    // Construtor
    public Filme(int idFilme, String titulo, String estilo, String sinopse, String diretor, int duracao,
                 Date dataLancamento, Date dataInicioExibicao, Date dataFimExibicao, boolean legendado, boolean dublado) {
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.estilo = estilo;
        this.sinopse = sinopse;
        this.diretor = diretor;
        this.duracao = duracao;
        this.dataLancamento = dataLancamento;
        this.dataInicioExibicao = dataInicioExibicao;
        this.dataFimExibicao = dataFimExibicao;
        this.numeroAssistencias = 0; // Inicialmente zero assistências
        this.avaliacao = 0.0;        // Inicialmente sem avaliação
        this.legendado = legendado;
        this.dublado = dublado;
    }

    // Métodos Getters e Setters
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

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public boolean isLegendado() {
        return legendado;
    }

    public void setLegendado(boolean legendado) {
        this.legendado = legendado;
    }

    public boolean isDublado() {
        return dublado;
    }

    public void setDublado(boolean dublado) {
        this.dublado = dublado;
    }

    // Métodos adicionais

    // Método para registrar uma nova assistência ao filme
    public void registrarAssistencia() {
        this.numeroAssistencias++;
    }

    // Método para calcular o período assistido do filme
    public int calcularPeriodoAssistido() {
        // Lógica para calcular o período assistido (em minutos)
        return 0; // Implemente conforme necessário
    }

    // Método para registrar uma nova avaliação do filme
    public void registrarAvaliacao(double avaliacao) {
        // Verificar se a avaliação está dentro do intervalo permitido (0 a 10, por exemplo)
        if (avaliacao >= 0 && avaliacao <= 10) {
            this.avaliacao = avaliacao;
        } else {
            System.out.println("Avaliação inválida. A avaliação deve estar entre 0 e 10.");
        }
    }

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
