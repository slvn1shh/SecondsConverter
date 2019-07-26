import javafx.util.converter.TimeStringConverter;

import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

class Converter {
    private int seconds;
    void setSeconds(int value){
        seconds = value;
    }

    int howSeconds(){
        return seconds % 60;
    }
    int howMinutes(){
        return seconds / 60;
    }
    int howHours(){
        return seconds / 3600;
    }
    int howDays(){
        return seconds / 86400;
    }
    int howWeeks(){
        return seconds / 604800;
    }
    int howMonths(){
        return seconds / 2628000;
    }
    int howYears(){
        return seconds / 31536000;
    }
    int howDecades(){
        return seconds / 315360000;
    }

    void run(){
        long seconds = 5662463;
        long minutes = TimeUnit.SECONDS.toMinutes(seconds);
    }
}
