import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Arte {
    private int id;
    private String titulo;
    private String descricao;
    private String imagem; 
    private Usuario autor;
    private Local local;
    private Date dataCriacao;
    private List<Curtida> curtidas;
    private List<Comentario> comentarios;

    public Arte(String titulo, String descricao, Usuario autor, Local local) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.autor = autor;
        this.local = local;
        this.dataCriacao = new Date();
        this.curtidas = new ArrayList<>();
        this.comentarios = new ArrayList<>();
    }

    public void adicionarComentario(Comentario comentario) {
        this.comentarios.add(comentario);
    }

    public void adicionarCurtida(Curtida curtida) {
        this.curtidas.add(curtida);
    }
    
    public void excluir(Usuario usuario) {
        if (!this.autor.equals(usuario)) {
            throw new SecurityException("Usuário não autorizado a excluir esta arte.");
        }
        System.out.println("Arte excluída com sucesso.");
    }

    public Usuario getAutor() { return autor; }
    public List<Comentario> getComentarios() { return comentarios; }
    public int getTotalCurtidas() { return curtidas.size(); }
}