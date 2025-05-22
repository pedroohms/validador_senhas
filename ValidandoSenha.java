public class ValidandoSenha {

    public boolean isValid(String password) {
        return isMinLength(password) &&
               hasUppercase(password) &&
               hasDigit(password);
    }

    private boolean isMinLength(String password) {
        return password.length() >= 8;
    }

    private boolean hasUppercase(String password) {
        return password.matches(".[A-Z].");
    }

    private boolean hasDigit(String password) {
        return password.matches(".\\d.");
    }
}