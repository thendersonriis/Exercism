import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ReverseString {

    String reverse(String inputString) {

        String[] input = inputString.split("");
        List<String> inputList = Arrays.asList(input);
        Collections.reverse(inputList);
        String answer = String.join("", inputList);
        return answer;
    }
  
}