package week10.groups.movable;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

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
        StringJoiner sj = new StringJoiner(System.lineSeparator());
        for (Movable m : groups) {
            sj.add(String.valueOf(m));
        }
        return sj.toString();

    }
}
