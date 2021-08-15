package com.pawan.choure.defaultMethod;

public class DefaultMethod extends PersonObject implements Person, Named {

    public static void main(String[] args) {
        DefaultMethod defaultMethod = new DefaultMethod();
        System.out.println(defaultMethod.getName());
        System.out.println(defaultMethod.getHashCode());
    }

/*    public String getName() {
        System.out.println("DefaultMethod:getName");
        return getClass().getName();
    }*/

    @Override
    public int getHashCode() {
        System.out.println("DefaultMethod:getHashCode");
        //return Person.super.getHashCode();
        return 0;
    }

}

interface Persons {
    default String getName() {
        System.out.println("Person:getName");
        return getClass().getName() + "_" + hashCode();
    }

    default int getHashCode() {
        System.out.println("Person:getHashCode");
        return hashCode();
    }

}

interface Named {
    default String getName() {
        System.out.println("Named:getName");
        return hashCode() + "_" + getClass().getName();
    }

    default int getHashCode() {
        System.out.println("Named:getHashCode");
        return hashCode();
    }
}

class PersonObject {

    public String getName() {
        System.out.println("PersonObject:getName");
        return getClass().getName() + "_" + hashCode();
    }
}
