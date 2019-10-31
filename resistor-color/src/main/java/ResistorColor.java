import java.util.ArrayList;
import java.util.HashMap;


class ResistorColor {
    private static String[] answer = new String[10];
    public ResistorColor(){
        answer[0] = "black";
        answer[1] = "brown";
        answer[2] = "red";
        answer[3] = "orange";
        answer[4] = "yellow";
        answer[5] = "green";
        answer[6] = "blue";
        answer[7] = "violet";
        answer[8] = "grey";
        answer[9] = "white";
    }


    int colorCode(String color) {
        for (int x = 0; x < answer.length; x++){
            if(answer[x] == color){
                return x;
            }
        }
        return -1;
    }

    String[] colors() {
        return answer;

    }
}
