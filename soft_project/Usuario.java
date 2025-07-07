import java.util.List;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private List<String> perfil; 
    private List<Contribuicao> historico;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha; 
    }

    public boolean login(String email, String senha) {
        return this.email.equals(email) && this.senha.equals(senha);
    }
    
    public String getNome() { return nome; }
    public String getEmail() { return email; }
}