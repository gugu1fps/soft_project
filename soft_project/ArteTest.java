import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArteTest {

   
    private Usuario autor;
    private Local local;
    private Arte arte;

    
    @Before
    public void setUp() {
        autor = new Usuario("Autor", "autor@email.com", "123");
        Coordenadas coords = new Coordenadas(-26.30f, -48.84f);
        local = new Local("Rua das Artes, 123", coords);
        arte = new Arte("Mural da Cidade", "Um mural sobre a natureza", autor, local);
    }

    @Test 
    public void testAdicionarComentario() {
        Usuario comentarista = new Usuario("Comentarista", "comenta@email.com", "456");
        Comentario comentario = new Comentario(comentarista, "Que arte incrível!");

        arte.adicionarComentario(comentario);

        assertEquals("A lista de comentários deveria conter 1 item", 1, arte.getComentarios().size());
        assertEquals("A mensagem do comentário está incorreta", "Que arte incrível!", arte.getComentarios().get(0).getMensagem());
    }

    @Test 
    public void testExcluirArtePropria() {
        try {
            arte.excluir(autor); 
            assertTrue(true);
        } catch (SecurityException e) {
            fail("O autor deveria ter permissão para excluir sua própria arte.");
        }
    }

    @Test 
    public void testFalhaAoExcluirArteDeOutroUsuario() {
        Usuario outroUsuario = new Usuario("Outro", "outro@email.com", "789");
        try {
            arte.excluir(outroUsuario); 
            fail("Uma exceção de segurança deveria ter sido lançada.");
        } catch (SecurityException e) {
            assertEquals("Usuário não autorizado a excluir esta arte.", e.getMessage());
        }
    }
}