import java.util.Arrays;

/**
 * @author Дмитрий Карпушов 25.09.2022
 */
public class Test2 {
    public static void main(String[] args) {
        String d = "Hello123123there12124214hey123123asdasd";
        String[] words = d.split("\\d+");
        System.out.println(Arrays.toString(words));

        String b = "Hello123123there123123hey";
        String modfString = b.replace(" ",".");

        String modfString1 = b.replaceAll("\\d+","-");
        String modfString2 = b.replaceFirst("\\d+","-");
        System.out.println("modfString = "+modfString1);
    }
}
