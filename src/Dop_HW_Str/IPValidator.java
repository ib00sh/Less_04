package Dop_HW_Str;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidator {
    private Pattern pattern;
    private Matcher matcher;

    public static void main(String[] args) {
        IPValidator ipValidator = new IPValidator();

            System.out.println("Результат: " + ipValidator.validate("192.168.0.0"));
            System.out.println("Результат: " + ipValidator.validate("300.168.0.400"));
            System.out.println("Результат: " + ipValidator.validate("192"));
            System.out.println("Результат: " + ipValidator.validate("225.225.225.0"));
            System.out.println("Результат: " + ipValidator.validate("8.8.8.8"));

            }

    private static final String IPADDRESS_PATTERN =
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public IPValidator(){
        pattern = Pattern.compile(IPADDRESS_PATTERN);
    }

    public boolean validate(final String ip){
        matcher = pattern.matcher(ip);
        return matcher.matches();
    }

}