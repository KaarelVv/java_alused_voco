package week5;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }


    public boolean larger(Apartment testApartment){
        if(this.squareMeters > testApartment.squareMeters) {
            return true;
        }else{
         return false;
        }
    }
}
