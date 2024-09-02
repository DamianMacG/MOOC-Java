
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int totalEuros = addition.euros;
        int totalCents = addition.cents;
        totalEuros += this.euros;
        totalCents += this.cents;

        // return the new Money object
        return new Money(totalEuros, totalCents);
    }

    public boolean lessThan(Money compared) {
        // Convert both money objects to total cents
        int thisTotalCents = this.euros * 100 + this.cents;
        int comparedTotalCents = compared.euros * 100 + compared.cents;

        // Compare the total cents
        return thisTotalCents < comparedTotalCents;
    }

    public Money minus(Money decreaser) {
        // Convert current Money and decreaser Money to total cents
        int thisTotalCents = this.euros * 100 + this.cents;
        int decreaserTotalCents = decreaser.euros * 100 + decreaser.cents;

        // Calculate the difference in total cents
        int differenceTotalCents = thisTotalCents - decreaserTotalCents;

        // If difference is negative, set to zero
        if (differenceTotalCents < 0) {
            differenceTotalCents = 0;
        }

        // Convert back to euros and cents
        int resultEuros = differenceTotalCents / 100;
        int resultCents = differenceTotalCents % 100;

        // Create and return a new Money object with the result
        return new Money(resultEuros, resultCents);
    }
}
