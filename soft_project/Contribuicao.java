import java.util.Date;

public class Contribuicao {
    private int id;
    private String tipo; 
    private Date data;
    private Usuario usuario;

    public Contribuicao(String tipo, Usuario usuario) {
        this.tipo = tipo;
        this.usuario = usuario;
        this.data = new Date();
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getData() {
        return data;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}