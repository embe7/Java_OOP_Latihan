package latihan35.Exception;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidateException, NullPointerException {
        if (loginRequest.username() == null){
            throw new NullPointerException("username is null");
        }else if (loginRequest.username().isBlank()){
            throw new ValidateException("username is blank");
        }else if (loginRequest.password() == null){
            throw new NullPointerException("Password is null");
        }else if (loginRequest.password().isBlank()){
            throw new ValidateException("password is blank");
        }
    }
}
