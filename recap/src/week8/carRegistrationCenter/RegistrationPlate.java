package week8.carRegistrationCenter;

import java.util.ArrayList;

import java.util.Objects;

public class RegistrationPlate {

    private final String regCode;
    private final String country;
    private ArrayList<RegistrationPlate> list = new ArrayList<>();

    public RegistrationPlate(String regCode, String country) {
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
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) object;

        if (this.country != compared.country) {
            return false;
        }

        if (this.regCode == null || !this.regCode.equals(compared.regCode)) {
            return false;
        }

        return true;
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
