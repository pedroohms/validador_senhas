import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    public void testHasDigit() {
        assertFalse(validator.isValid("SenhaSegura")); // sem dígito
        assertTrue(validator.isValid("Senha123"));     // com dígito
    }
}