import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit." +
                " Integer eu feugiat tellus. Nam molestie diam sed libero egestas pellentesque. Nulla.";

        countCharFrequency(str);

    }

    public static void countCharFrequency(String string) {
        String str = string.replaceAll("\\W","");

        char[] arr = str.toCharArray();

        HashMap <Character, Integer> charMap = new HashMap();

        for (char iterator : arr) {
            charMap.put(iterator, charMap.containsKey(iterator) ? charMap.get(iterator) + 1 : 1);
        }
        charMap.entrySet()
                .stream()
                .sorted((Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) -> o2.getValue().compareTo(o1.getValue()))
                .forEach(x-> System.out.printf("Symbol %s occur %s times \n",x.getKey(),x.getValue()));
    }
}
