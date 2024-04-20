import java.util.List;

public class Funcionario {
    // Atributos
    private int idFuncionario;
    private String nome;
    private String cargo;
    private boolean acessoDespesas;
    private boolean acessoBalancoMensal;
    private boolean acessoRelatorios;
    private boolean acessoEstoque;
    private List<BalcaoAtendimento> balcoesAtendimento;

    // Construtor
    public Funcionario(int idFuncionario, String nome, String cargo, boolean acessoDespesas, boolean acessoBalancoMensal,
                       boolean acessoRelatorios, boolean acessoEstoque, List<BalcaoAtendimento> balcoesAtendimento) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.cargo = cargo;
        this.acessoDespesas = acessoDespesas;
        this.acessoBalancoMensal = acessoBalancoMensal;
        this.acessoRelatorios = acessoRelatorios;
        this.acessoEstoque = acessoEstoque;
        this.balcoesAtendimento = balcoesAtendimento;
    }

    // Métodos Getters e Setters
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isAcessoDespesas() {
        return acessoDespesas;
    }

    public void setAcessoDespesas(boolean acessoDespesas) {
        this.acessoDespesas = acessoDespesas;
    }

    public boolean isAcessoBalancoMensal() {
        return acessoBalancoMensal;
    }

    public void setAcessoBalancoMensal(boolean acessoBalancoMensal) {
        this.acessoBalancoMensal = acessoBalancoMensal;
    }

    public boolean isAcessoRelatorios() {
        return acessoRelatorios;
    }

    public void setAcessoRelatorios(boolean acessoRelatorios) {
        this.acessoRelatorios = acessoRelatorios;
    }

    public boolean isAcessoEstoque() {
        return acessoEstoque;
    }

    public void setAcessoEstoque(boolean acessoEstoque) {
        this.acessoEstoque = acessoEstoque;
    }

    public List<BalcaoAtendimento> getBalcoesAtendimento() {
        return balcoesAtendimento;
    }

    public void setBalcoesAtendimento(List<BalcaoAtendimento> balcoesAtendimento) {
        this.balcoesAtendimento = balcoesAtendimento;
    }

    // Métodos adicionais

    // Método para autenticar o funcionário
    public void autenticar() {
        // Lógica de autenticação
        System.out.println("Funcionário autenticado com sucesso.");
    }

    // Método para verificar o acesso do funcionário
    public void verificarAcesso() {
        System.out.println("Acesso do funcionário:");
        System.out.println("Despesas: " + (acessoDespesas ? "Permitido" : "Negado"));
        System.out.println("Balanço Mensal: " + (acessoBalancoMensal ? "Permitido" : "Negado"));
        System.out.println("Relatórios: " + (acessoRelatorios ? "Permitido" : "Negado"));
        System.out.println("Estoque: " + (acessoEstoque ? "Permitido" : "Negado"));
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "idFuncionario=" + idFuncionario +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", acessoDespesas=" + acessoDespesas +
                ", acessoBalancoMensal=" + acessoBalancoMensal +
                ", acessoRelatorios=" + acessoRelatorios +
                ", acessoEstoque=" + acessoEstoque +
                ", balcoesAtendimento=" + balcoesAtendimento +
                '}';
    }
}
