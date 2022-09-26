/**
 * @author Дмитрий Карпушов 25.09.2022
 */
public class Test {
    public static void main(String[] args) {
        /**
         * RegExlib
         * 1)matches - Проверяет, совпадают ли строки.
         */

        /**
         * 1)\\d - одна цифра
         *      + означает 1 или более
         *      * означает 0 или более
         *      ? - сивол который идет до него,он может быть или не быть
         *      () описываем вероятные вещи и разделяем "|" (x|y|z) - Одна строка из множества
         *      [] - описываем большие множества [a-zA-Z] - Все английские буквы
         *      [0-9] - все цифры описываем
         *      [^abc] - мы хотим все символы кроме abc
         *      . - Любой символ
         *      {2} - 2 символа до (\\d{2})
         *      {2,} - 2 или более символов (\\d{2,})
         *      {2,4} - от 2 до 4 символов(\\d{2,4})
         *
         * 2)\\w - одна букв
         * w = [a-zA-Z]
         */

        boolean x = true;
        boolean y = false;

        String a = "-45465";
        String b = "45465";
        String c = "+45465";
        System.out.println(a.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));

        String d = "aef123456";
        System.out.println(d.matches("[a-zA-Z]+\\d*"));
        //разрешены символы КРОМЕ
        String e = "hello";
        System.out.println(e.matches("[^abc]*"));

        String url = "http://www.google.com";
        String url2 = "http://www.yandex.ru";
        String url3 = "asfasfsaf";
        System.out.println("URL = " + url.matches("http://www\\..+\\.(com|ru)"));
        System.out.println("URL2 = " + url2.matches("http://www\\..+\\.(com|ru)"));
        System.out.println("URL3 = " + url3.matches("http://www\\..+\\.(com|ru)"));

        String f= "123";
        System.out.println("f = " + f.matches("\\d{2,}"));
    }
}
