import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class Gigasecond {
    LocalDateTime localD = null;
    Gigasecond(LocalDate moment) {
        LocalDateTime dt = moment.atStartOfDay();
        localD = dt.plus(1000000000, ChronoUnit.SECONDS);
    }

    Gigasecond(LocalDateTime moment) {
        localD = moment.plus(1000000000, ChronoUnit.SECONDS);
    }

    LocalDateTime getDateTime() {
            return localD;
    }

}
