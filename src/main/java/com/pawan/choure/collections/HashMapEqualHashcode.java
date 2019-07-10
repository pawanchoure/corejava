package com.pawan.choure.collections;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pawan on 07-06-2019.
 */
public class HashMapEqualHashcode {
    public static void main(String[] args){
        HashMap<Employee,Employee> employeeHashmap= new HashMap<>();
        //Create 2 Employee Object
        Employee employee1= new Employee(1,"Pawan Choure");
        System.out.println("employee1.hashCode() = " + employee1.hashCode());
        Employee employee2= new Employee(2,"Sujoy Mukherjee");
        System.out.println("employee2.hashCode() = " + employee2.hashCode());
        employeeHashmap.put(employee1,employee1);
        employeeHashmap.put(employee2,employee2);

        Employee employee3= new Employee(1,"Pawan Choure");
        System.out.println("employee3.hashCode() = " + employee3.hashCode());
        employeeHashmap.put(employee3,employee2);
        //Check The Hashmap size
        System.out.println("Size : "+ employeeHashmap.size());

        for(Map.Entry<Employee,Employee> employeeEntry : employeeHashmap.entrySet()){
            System.out.println(" Key : "+ employeeEntry.getKey());
            System.out.println(" Value : "+ employeeEntry.getValue());
        }
        Employee employeefind= new Employee(1,"Pawan Choure");
        System.out.println("employeefind.hashCode() = " + employeefind.hashCode());
        Employee findEmployee=employeeHashmap.get(employeefind);
        findEmployee.toString();



    }
}


class Employee{
    int empId;
    String name;

    public Employee(int id, String name) {
        this.empId=id;
        this.name=name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return new EqualsBuilder()
                .append(empId, employee.empId)
                .append(name, employee.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(empId)
                .append(name)
                .toHashCode();
    }
}
