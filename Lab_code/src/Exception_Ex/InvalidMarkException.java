package Exception_Ex;

public class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super("---->"+message);
    }
}
