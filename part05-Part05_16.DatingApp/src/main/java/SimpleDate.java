
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        advance(1);
    }

    public void advance(int howManyDays) {
        this.day += howManyDays;
        while (this.day > 30) {
            this.day -= 30;
            this.month++;
            if (this.month > 12) {
                this.month = 1;
                this.year++;
            }
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        // Create a new date object based on the current date
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);

        // Advance the new date by the specified number of days
        newDate.advance(days);

        return newDate;
    }

}
