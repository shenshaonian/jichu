package 项目中学习到的.抛错;

public class ConvertException  extends XXRuntimeException{

//    private static final long serialVersionUID =

    public ConvertException(String message) {
        super(message);
    }

    public ConvertException(String message, Exception cause) {
        super(message, cause);
    }

    public ConvertException(String message, String reason) {
        super(message, reason);
    }

    public ConvertException(String message, Throwable cause, String reason) {
        super(message, cause, reason);
    }
}
