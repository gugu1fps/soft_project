import org.junit.Test;
import static org.junit.Assert.*;


public class LocalTest {

    @Test 
    public void testMarcarLocalComoDisponivel() {
        Coordenadas coords = new Coordenadas(-26.30f, -48.84f);
        Local local = new Local("Muro Vazio", coords);

        assertFalse("O local não deveria iniciar como disponível", local.isDisponivel());

        local.marcarComoDisponivel();

        assertTrue("O local deveria ter sido marcado como disponível", local.isDisponivel());
    }
}