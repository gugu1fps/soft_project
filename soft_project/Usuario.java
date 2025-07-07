import java.util.List;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String senha;
    private List<String> papeis;
    private List<Contribuicao> historico;

    // Construtor
    public Usuario() {
    }

    // Métodos
    public boolean login() {
        // TODO: Implementar lógica de login
        System.out.println("Lógica de login para o usuário: " + this.nome);
        return true;
    }

    public boolean registrar() {
        // TODO: Implementar lógica de registro
        System.out.println("Registrando o usuário: " + this.nome);
        return true;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<String> getPapeis() {
        return papeis;
    }

    public void setPapeis(List<String> papeis) {
        this.papeis = papeis;
    }

    public List<Contribuicao> getHistorico() {
        return historico;
    }

    public void setHistorico(List<Contribuicao> historico) {
        this.historico = historico;
    }
}