package com.pawan.choure.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionTester {
    public static void main(String[] args){
        String[] strings = "Heloo".split("_");
        Address a1= new Address("Punee");
        Address a2= new Address("Mumbai");
        Address a3= new Address("Nagar");
        List<Address> addressList = new ArrayList<>();
        addressList.add(a1);
        addressList.add(a2);
        List<Address> addressList2 = new ArrayList<>();
        addressList2.add(a3);
        Employee employee1= new Employee("Pawan",addressList);
        Employee employee2= new Employee("Sachin",addressList2);
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        List<Employee> filter= employeeList.stream().filter(emp -> {
            List<Address> addresses= emp.getAddresses();
            if(addresses==null) return false;
            return addresses.stream().map(Address::getCity).anyMatch(x->x.equalsIgnoreCase("Pune"));
        }).collect(Collectors.toList());

        employeeList.stream().findAny()


        System.out.println(filter.size());
    }
}
