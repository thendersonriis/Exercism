import java.math.BigDecimal;
import java.math.RoundingMode;

class SpaceAge {
    private double seconds = 0;
    private double earthAge = 0;
    SpaceAge(double seconds) {
        this.seconds = seconds;
        earthAge = seconds/ 31557600;
    }

    double getSeconds() {
        return seconds;
    }
    double calculate(double period){
        BigDecimal bd = new BigDecimal((Double.toString(earthAge/period)));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    double onEarth() {
        return calculate(1);
    }

    double onMercury() {
        return calculate(0.2408467);
    }

    double onVenus() {
        return calculate(0.61519726 );
    }

    double onMars() {
        return calculate(1.8808158);
    }

    double onJupiter() {
        return calculate(11.862615 );
    }

    double onSaturn() {
        return calculate(29.447498);
    }

    double onUranus() {
        return calculate(84.016846 );
    }

    double onNeptune() {
        return calculate(164.79132 );
    }

}
