package week8.carRegistrationCenter;

import java.util.ArrayList;

import java.util.Objects;

public class RegistrationPlate {

    private final String regCode;
    private final String country;
    private final ArrayList<RegistrationPlate> list = new ArrayList<>();

    public RegistrationPlate( String country,String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    public String getRegCode() {
        return regCode;
    }

    public String getCountry() {
        return country;
    }

    public void add(RegistrationPlate registrationPlates) {
        list.add(registrationPlates);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        RegistrationPlate compared = (RegistrationPlate) object;
        return Objects.equals(country, compared.country) &&
                Objects.equals(regCode, compared.regCode);
    }


    @Override
    public int hashCode() {
        return Objects.hash(regCode, country);
    }

    @Override
    public String toString() {
        return
                country + " " + regCode;
    }
}
