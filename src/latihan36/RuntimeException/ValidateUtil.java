package latihan36.RuntimeException;

import latihan35.Exception.LoginRequest;

public class ValidateUtil {

    public static void validateRuntime(LoginRequest loginRequest){
        if (loginRequest.username() == null){
            throw new NullPointerException("username is null");
        }else if (loginRequest.username().isBlank()){
            throw new BlankException("username tidak boleh kosong");
        }else if (loginRequest.password() == null){
            throw new NullPointerException("password is null");
        }else if (loginRequest.password().isBlank()){
            throw new BlankException("password tidak boleh kosong");
        }
    }
}
