import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class validador_senhas_testando {

    ValidadorSenha validador = new ValidadorSenha();

    @Test
    public void testHasUppercase() {
        assertFalse(validador.isValid("senha123"));   // nenhuma maiúscula
        assertTrue(validador.isValid("Senha123"));    // tem maiúscula
    }


