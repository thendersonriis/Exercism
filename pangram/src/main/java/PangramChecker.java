import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public class PangramChecker {

    public boolean isPangram(String input) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        input = input.toLowerCase();
        for (int x = 0; x < alphabet.length(); x++) {
            if (!input.contains(String.valueOf(alphabet.charAt(x)))) {
                return false;
            }
        }
        return true;
    }
}
