public class Local {
    private int id;
    private String endereco;
    private Coordenadas coordenadas;
    private Usuario proprietario;
    private boolean disponivel;

    public Local(String endereco, Coordenadas coordenadas) {
        this.endereco = endereco;
        this.coordenadas = coordenadas;
        this.disponivel = false;
    }

    public void marcarComoDisponivel() {
        this.disponivel = true;
    }

    public void marcarComoIndisponivel() {
        this.disponivel = false;
    }
    
    public boolean isDisponivel() { return disponivel; }
}