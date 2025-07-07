import java.util.Date;

public class Curtida {
    private int id;
    private Date data;

    public Curtida() {
        this.data = new Date();
    }

    public int getId() {
        return id;
    }

    public Date getData() {
        return data;
    }
}