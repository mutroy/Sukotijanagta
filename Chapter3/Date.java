package Chapter3;

public class Date {
    private int month;
    private int day;
    private int year;


    public Date(int month, int day, int year) {

        if (month > 0 && month < 13) {
            this.month = month;
        } else {
            System.out.println("Invalid Month");
        }

        if (day > 0 && day < 31) {
            this.day = day;
        } else {
            System.out.println("Invalid Day");
        }

    }
}
