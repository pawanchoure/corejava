package com.pawan.choure.streams;

public class Address {
    String city;

    public Address(String city) {
        this.city=city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        return city.equals(address.city);
    }

    @Override
    public int hashCode() {
        return city.hashCode();
    }
}
