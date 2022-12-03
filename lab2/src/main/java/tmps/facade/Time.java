package tmps.facade;

public class Time {
    int year, month, day, minute, second;

    Time( int year, int month, int day, int minute, int second ) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.minute = minute;
        this.second = second;
    }

    void setTime( int year, int month, int day, int minute, int second ) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.minute = minute;
        this.second = second;
    }
}