package BLL.util;

public class BusinessRuleViolationException extends RuntimeException {

    private static final long serialVersionUID = -3627361219981541481L;

    public BusinessRuleViolationException(String message) {
        super(message);
    }
}

