package week5.my_date;

import static java.lang.Math.abs;

public class MyDate {
    private int day;
    private int month;
    private int year;



    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        // first we'll compare years
        if ( this.year < compared.year ) {
            return true;
        }

        // if the years are the same, we'll compare the months
        if ( this.year == compared.year && this.month < compared.month ) {
            return true;
        }

        // years and months the same, we'll compare the days
        return this.year == compared.year && this.month == compared.month &&
                this.day < compared.day;
    }

    public void advance(){
        this.day += 1 ;

    }

    public void advance(int numberOfDays){
        int totalPresentDays = this.day + (this.month * 30) + (this.year * 360);

        this.day += numberOfDays ;
    }

    public MyDate afterNumberOfDays(int days){
        int totalPresentDays = this.day + (this.month * 30) + (this.year * 360);

        int totalFutureDays = totalPresentDays + days;

        int years = totalFutureDays / 360;
        int remainingDaysFromYear = totalFutureDays % 360;
        int month = remainingDaysFromYear / 30;
        int day  = remainingDaysFromYear % 30 ;


        return new MyDate(day, month, years);
    }

    public int differenceInYears(MyDate comparedDate){
        int totalPresentDays = this.day + (this.month * 30) + (this.year * 365);
        int totalComparedDays = comparedDate.day + (comparedDate.month * 30) + (comparedDate.year * 365);

        return abs(totalPresentDays / 365 - totalComparedDays / 365);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
