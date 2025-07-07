import org.junit.Test;
import static org.junit.Assert.*;


public class UsuarioTest {

    @Test 
    public void testLoginComSucesso() {
        Usuario usuario = new Usuario("Artista Teste", "artista@teste.com", "senha123");
        assertTrue("O login deveria ser bem-sucedido com credenciais corretas",
                   usuario.login("artista@teste.com", "senha123"));
    }

    @Test 
    public void testLoginComSenhaIncorreta() {
        Usuario usuario = new Usuario("Artista Teste", "artista@teste.com", "senha123");
        assertFalse("O login deveria falhar com uma senha incorreta",
                    usuario.login("artista@teste.com", "senha_errada"));
    }
}