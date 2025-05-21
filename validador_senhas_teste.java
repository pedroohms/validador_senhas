import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    public void testMinLength() {
        assertFalse(validator.isValid("Ab1!abc"));    // 7 caracteres → inválida
        assertTrue(validator.isValid("Ab1!abcd"));    // 8 caracteres → válida
    }
}
