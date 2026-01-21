package validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateEmail {
//    private static Pattern pattern;
//    private static Matcher matcher;
    private static final String Email="^[A-Z][A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
//    public validateEmail() {
//        pattern=Pattern.compile(Email);
//    }
    public static boolean validate(String email){
       Pattern pattern=Pattern.compile(Email);
       Matcher matcher=pattern.matcher(email);
        return matcher.matches();
    }
}
