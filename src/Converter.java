class Converter {
    private long seconds;
    private long second, minute, hour, day, week, month, year, decade;

    private void howSeconds(){
        second = seconds % 60;
    }
    private void howMinutes(){
        if (seconds > 60) {
            minute = seconds / 60;
            seconds -= minute * 60;
        }
    }
    private void howHours(){
        if (seconds > 3600) {
            hour = seconds / 3600;
            seconds -= hour * 3600;
        }
    }
    private void howDays(){
        if (seconds > 86400){
            day = seconds / 86400;
            seconds -= day * 86400;
        }

    }
    private void howWeeks(){
        if (seconds > 604800){
            week = seconds / 604800;
            seconds -= week * 604800;
        }
    }
    private void howMonths(){
        if (seconds > 2628000){
            month = seconds / 2628000;
            seconds -= month * 2628000;
        }
    }
    private void howYears(){
        if (seconds > 31536000){
            year = seconds / 31536000;
            seconds -= year * 31536000;
        }
    }
    private void howDecades(){
        if (seconds > 315360000){
            decade = seconds / 315360000;
            seconds -= decade * 315360000;
        }
    }

    private void setSeconds(long value){
        seconds = value;
    }

    private void summarize(){
        setSeconds(551256235);
        //setSeconds(123545342);
        howDecades();
        howYears();
        howMonths();
        howWeeks();
        howDays();
        howHours();
        howMinutes();
        howSeconds();
    }
    private void show(){
        System.out.println("We have: \n" +
            decade + " dec " + year + " y " + month + " mon " + week + " w " + day + " days " + '\n' +
            hour + " h " + minute + " min " + second + "s ");
    }

    void run(){
        summarize();
        show();
    }
}
