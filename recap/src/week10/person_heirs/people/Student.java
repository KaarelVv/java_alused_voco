package week10.person_heirs.people;

public class Student extends Person{

    private int credit;

    public Student(String name, String address) {
        super(name, address);
    }

    public void study(){
        credit += 1;
    }
    public int credits() {
        return this.credit;
    }

    @Override
    public String toString() {
        return  super.toString() + "\n"+
                '\t' +"credit " + credit;
    }
}
