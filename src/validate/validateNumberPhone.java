package validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateNumberPhone {
    private static final String sodienthoai="^[0]{1}[0-9]{9}$";
    public static boolean ktsdt(String sdt)
    {
        Pattern pattern = Pattern.compile(sodienthoai);
        Matcher matcher = pattern.matcher(sdt);
        return matcher.matches();
    }
}
