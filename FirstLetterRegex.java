import java.util.regex.*;

public class FirstLetterRegex {
    public static void main(String[] args) {

        String str = "Java is easy";

        Pattern p = Pattern.compile("\\b[a-zA-Z]");

        Matcher m = p.matcher(str);

        while(m.find()) {
            System.out.println(m.group());
        }
    }
}