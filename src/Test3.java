import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Дмитрий Карпушов 25.09.2022
 */
public class Test3 {
    public static void main(String[] args) {
        /**
         *
         */
        String text = "Hello, Guys asdasd asdsad gsdfg email joe@gmail.ru asfdasf afsf \n" +
                "asdads as as. Rasfasf, adf! asdasdasd \n" +
                "asdads: tim@yandex.ru. asdsadasd...";

        Pattern email = Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ru)");
        Matcher matcher = email.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group(1));
        }

    }
}
