package 项目中学习到的.抛错;

import com.qingqing.common.util.NestedExceptionUtils;

public class XXRuntimeException extends RuntimeException{

//    private static final long serialVersionUID =
    private String reason;

    public XXRuntimeException(String message) {
        this(message, "");
    }

    public XXRuntimeException(String message, Throwable cause) {
        this(message, cause, "");
    }

    public XXRuntimeException(String message, String reason) {
        super(message);
        this.reason = reason;
    }

    public XXRuntimeException(String message, Throwable cause, String reason) {
        super(message, cause);
        this.reason = reason;
    }

    public String getReason() {
        return reason == null ? "" : reason;
    }

    @Override
    public String getMessage() {
        return NestedExceptionUtils.buildMessage(super.getMessage(), getCause());
    }
}
