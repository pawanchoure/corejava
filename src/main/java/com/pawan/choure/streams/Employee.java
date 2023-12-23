package com.pawan.choure.streams;

import java.util.List;

public class Employee {
    String name;
    List<Address> addresses;

    public Employee(String name,List<Address> addresses) {
        this.name=name;
        this.addresses= addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
