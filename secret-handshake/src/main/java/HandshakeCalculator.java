import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> signals = new ArrayList<Signal>();
        boolean reverse = true;
        if (number - 16 >= 0){
            number -= 16;
            reverse = false;
        }

        if (number - 8 >= 0){
            number -= 8;
            signals.add(Signal.JUMP);
        }

        if (number - 4 >= 0){
            number -= 4;
            signals.add(Signal.CLOSE_YOUR_EYES);
        }

        if (number - 2 >= 0){
            number -= 2;
            signals.add(Signal.DOUBLE_BLINK);
        }

        if (number - 1 >=0){
            number -= 1;
            signals.add(Signal.WINK);
        }

        if (reverse){
            Collections.reverse(signals);
        }

        return signals;

    }

}
