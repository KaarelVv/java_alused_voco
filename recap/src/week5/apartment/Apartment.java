package week5.apartment;

import static java.lang.Math.abs;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }




    public boolean larger(Apartment otherApartment){
        return this.squareMeters > otherApartment.squareMeters;
    }

    public int priceDifference(Apartment otherApartment){
        int price = this.pricePerSquareMeter * this.squareMeters;
        int priceOfOther = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;

        return abs(price - priceOfOther);
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {

        return (this.pricePerSquareMeter * this.squareMeters) > (otherApartment.pricePerSquareMeter * otherApartment.squareMeters);
    }
}
