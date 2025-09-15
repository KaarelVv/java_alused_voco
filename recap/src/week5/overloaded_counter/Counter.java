package week5.overloaded_counter;

public class Counter {

    int startingValue;
    boolean check;


    public Counter(int startingValue, boolean check){
        this(startingValue);
        this.check = check;
    }
    public Counter(int startingValue){
        this.startingValue = startingValue;
        this.check = false;
    }
    public Counter(boolean check){
       this(0);
       this.check = check;
    }
    public Counter(){
        this.startingValue = 0;
    }
    public int value(){
        return this.startingValue;
    }
    public void increase(int increaseAmount){
        this.startingValue += increaseAmount;
    }

    public void increase(){
        this.startingValue ++;
    }

    public void decrease(int decreaseAmount){
        if(this.startingValue >= 0 && this.check){
          this.startingValue = decreaseAmount;
      }else{
            this.startingValue -=1;
        }
    }
    public void decrease(){
        if(this.startingValue <= 0 && this.check){
            this.startingValue = value();
        }else{
            this.startingValue -=1;
        }


    }
}

