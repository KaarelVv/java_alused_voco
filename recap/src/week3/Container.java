package week3;

import java.util.ArrayList;

public class Container {
    private int maxWeightLimit;
    private ArrayList<Suitcase> suitcases;
    private int totalSuitcaseWeight = 0;

    public Container(int maxWeightLimit) {
        this.maxWeightLimit = maxWeightLimit;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = suitcase.totalWeight;
        totalSuitcaseWeight += totalWeight;
        this.suitcases.add(suitcase);
    }

    public void printThings(){
       for(Suitcase s: suitcases){
           for(int i = 0; i< s.getThings().size(); i++){
                Thing current = s.getThings().get(i);
               System.out.println(current);
           }
       }
    }

    @Override
    public String toString() {
        return
                suitcases.size() + " suitcases " +"("+totalSuitcaseWeight + " kg)";
    }
}
