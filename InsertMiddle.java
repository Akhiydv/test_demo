package Program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InsertMiddle {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Orange", "Grapes", "Mango");

        // Insert '&' in the middle of each word
        List<String> modified = fruits.stream()
            .map(word -> {
                int mid = word.length() / 2; // find middle index
                return word.substring(0, mid) + "&" + word.substring(mid);
            })
            .collect(Collectors.toList());

        System.out.println(modified);
    }
}
