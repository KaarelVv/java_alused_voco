package week10.groups.movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
    private List<Movable> groups = new ArrayList<>();


    public void addToGroup(Movable movable) {
        this.groups.add(movable);


    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : this.groups) {
            movable.move(dx, dy);
        }

    }

    @Override
    public String toString() {

        int j = 0;
        for (int i = 0; i < this.groups.size(); i++) {
            System.out.println( groups.get(j));
            j = i + 1;
        }
       return "";
    }
}
