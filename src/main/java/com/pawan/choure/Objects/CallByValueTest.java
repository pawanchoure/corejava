package com.pawan.choure.Objects;

import java.util.Objects;

/**
 * Created by Pawan on 13-06-2019.
 */
public class CallByValueTest {
    public static void main(String[] args)
    {
      /*
       * Test 1: Methods can't modify numeric parameters
       */
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);

      /*
       * Test 2: Methods can change the state of object parameters
       */
        System.out.println("\nTesting tripleSalary:");
        EmployeeLocal harry = new EmployeeLocal("Harry", 50000);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());

      /*
       * Test 3: Methods can't attach new objects to object parameters
       */
        System.out.println("\nTesting swap:");
        EmployeeLocal a = new EmployeeLocal("Alice", 70000);
        EmployeeLocal b = new EmployeeLocal("Bob", 60000);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void tripleValue(double x) // doesn't work
    {
        x = 3 * x;
        System.out.println("End of method: x=" + x);
    }

    public static void tripleValueFinal(double x) // doesn't work
    {
        x = 3 * x;
        System.out.println("End of method: x=" + x);
    }


    public static void tripleSalary(EmployeeLocal x) // works
    {
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());
    }

    public static void swap(EmployeeLocal x, EmployeeLocal y)
    {
        EmployeeLocal temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }
}

class EmployeeLocal // simplified Employee class
{
    private String name;
    private double salary;

    public EmployeeLocal(String n, double s)
    {
        name = n;
        salary = s;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeLocal employee = (EmployeeLocal) o;
        return Double.compare(employee.salary, salary) == 0 &&
                name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}