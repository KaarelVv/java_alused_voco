package week5.overloaded_counter_ex84;

public class Counter {

    private int startingValue;
    private final boolean check;

    // Field naming / semantics
    //You use startingValue as the current value of the counter. That’s fine, but it’s clearer to name it value. (Not required, just cleaner.)

    //Encapsulation
    //Fields should be private (good practice). Not required by the exercise, but recommended.

    //increase(int increaseAmount)
    //*Requirement: if the parameter is negative, do nothing.
    //*Your code always adds the amount (even if negative).

    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0,check);
    }

    public Counter() {
        this(0,false);
    }

    public int value() {
        return this.startingValue;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount < 0) {
            return;
        }
        this.startingValue+= increaseAmount;
    }

    public void increase() {
        this.startingValue++;
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 0) {
            return;
        }
        if (this.check) {
            int result = this.startingValue - decreaseAmount;
            this.startingValue = (result < 0) ? 0 : result;
        } else {
            this.startingValue -= decreaseAmount;
        }
    }

    public void decrease() {
        if (this.check) {
            if (this.startingValue > 0) {
                this.startingValue--;
            }
        } else {
            this.startingValue--;
        }
    }
}

