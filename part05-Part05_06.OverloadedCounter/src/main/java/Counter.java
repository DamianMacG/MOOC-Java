public class Counter {

    private int number;

    public Counter(int startValue) {
        number = startValue;

    }

    public Counter() {
        number = 0;
    }

    public int value() {
        return number;
    }

    public void increase() {
        number += 1;
    }

    public void decrease() {
        number -= 1;
    }

    public void increase(int num) {
        if (num > 0) {
            number += num;
        }

    }

    public void decrease(int num) {
        if (num > 0) {
            number -= num;
        }
    }
}
