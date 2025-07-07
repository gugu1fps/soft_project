import java.util.Date;

public class Comentario {
    private int id;
    private Usuario usuario;
    private String mensagem;
    private Date data;

    public Comentario(Usuario usuario, String mensagem) {
        this.usuario = usuario;
        this.mensagem = mensagem;
        this.data = new Date();
    }
    public String getMensagem() { return mensagem; }
    public Usuario getUsuario() { return usuario; }
}