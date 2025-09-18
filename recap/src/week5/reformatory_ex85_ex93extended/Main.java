package week5.reformatory_ex85_ex93extended;

import week5.my_date_ex91_extended.MyDate;

public class Main {
    public static void main(String[] args) {
//        Reformatory eastHelsinkiReformatory = new Reformatory();
//
//        Person brian = new Person("Brian", 1, 110, 7);
//        Person pekka = new Person("Pekka", 33, 176, 85);
//
//        System.out.println(brian.getName() + " weight: " + eastHelsinkiReformatory.weight(brian) + " kilos");
//        System.out.println(pekka.getName() + " weight: " + eastHelsinkiReformatory.weight(pekka) + " kilos");
//
//        eastHelsinkiReformatory.feed(brian);
//        eastHelsinkiReformatory.feed(brian);
//        eastHelsinkiReformatory.feed(brian);
//
//        System.out.println();
//
//        System.out.println(brian.getName() + " weight: " + eastHelsinkiReformatory.weight(brian) + " kilos");
//        System.out.println(pekka.getName() + " weight: " + eastHelsinkiReformatory.weight(pekka) + " kilos");
//
//        System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightMeasured());
//
//        eastHelsinkiReformatory.weight(brian);
//        eastHelsinkiReformatory.weight(pekka);
//
//        System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightMeasured());
//
//        eastHelsinkiReformatory.weight(brian);
//        eastHelsinkiReformatory.weight(brian);
//        eastHelsinkiReformatory.weight(brian);
//        eastHelsinkiReformatory.weight(brian);
//
//        System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightMeasured());

//        Person pekka = new Person("Pekka", 15, 2, 1993);
//        Person steve = new Person("Thomas", 1, 3, 1955);
//
//        System.out.println( steve.getName() + " age " + steve.age() + " years");
//        System.out.println( pekka.getName() + " age " + pekka.age() + " years");

//        Person pekka = new Person("Pekka", 15, 2, 1983);
//        Person martin = new Person("Martin", 1, 3, 1983);
//
//        System.out.println( martin.getName() + " is older than " +  pekka.getName() + ": "+ martin.olderThan(pekka) );
//        System.out.println( pekka.getName() + " is older than " +  martin.getName() + ": "+ pekka.olderThan(martin) );

        Person pekka = new Person("Pekka", new MyDate(15, 2, 1983));
        Person steve = new Person("Steve");

        System.out.println( pekka );
        System.out.println( steve );
    }
}
