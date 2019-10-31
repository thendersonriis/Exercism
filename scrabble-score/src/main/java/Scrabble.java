import javax.print.DocFlavor;
import java.util.HashMap;

class Scrabble {
    private final static String ONE = "A E I O U L N R S T";
    private final static String TWO = "D G";
    private final static String THREE = "B C M P";
    private final static String FOUR = "F H V W Y";
    private final static String FIVE = "K";
    private final static String EIGHT = "J X";
    private final static String TEN = "Q Z";
    private int score = 0;


    Scrabble(String word) {
        word = word.toUpperCase();
        HashMap<Character, Integer> letters = new HashMap<>();
        for(int x = 0; x <word.length(); x++){
            char c = word.charAt(x);
            if (letters.containsKey(c)){
                letters.put(c, letters.get(c) + 1);
            }

            else{
                letters.put(c, 1);
            }
        }
        setScore(word,letters);

    }

    void setScore(String word, HashMap<Character, Integer> letters){
        for ( char x: letters.keySet()) {
            if (ONE.indexOf(x) != -1) {
                score += letters.get(x)*1;
            }
            else if (TWO.indexOf(x) != -1) {
                score += letters.get(x)*2;
            }
            else if (THREE.indexOf(x) != -1) {
                score += letters.get(x)*3;
            }
            else if (FOUR.indexOf(x) != -1) {
                score += letters.get(x)*4;
            }
            else if (FIVE.indexOf(x) != -1) {
                score += letters.get(x)*5;
            }
            else if (EIGHT.indexOf(x) != -1) {
                score += letters.get(x)*8;
            }
            else if (TEN.indexOf(x) != -1) {
                score += letters.get(x)*10;
            }
        }
    }

    int getScore() {
        return score;
    }

}
