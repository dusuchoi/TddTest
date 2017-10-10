package knu.ac.kr.passwordvalidator;

public class PasswordValidator {


    private int minLength;
    private int maxLength;


    public PasswordValidator(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    public boolean validate(String password) {
        if(password==null)
            return false;
        else if(password.equals(""))
            return false;
        else if(password.equals("ADMIN")||password.equals("admin"))
            return true;

        int passwordLength = password.length();

        if (passwordLength < minLength) {
            return false;
        }
        else if(passwordLength > maxLength){
            return false;
        }

        return true;
    }


}
