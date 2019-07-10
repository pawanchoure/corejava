package com.pawan.choure.thread;


public class TestClass extends Thread{
    private String firtname;
    private String lastName;

    public String getFirtname() {
        return firtname;
    }

    public void setFirtname(String firtname) {
        this.firtname = firtname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestClass testClass = (TestClass) o;

        if (!firtname.equals(testClass.firtname)) return false;
        return lastName.equals(testClass.lastName);

    }

    @Override
    public int hashCode() {
        int result = firtname.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }

    public static synchronized boolean getFirstName(){
        System.out.println("In Method get FirstName" );
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Out Method get FirstName" );
        return true;
    }

    public static synchronized boolean getFName(){
        System.out.println("In Method getFName" );
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Out Method getFName" );
        return true;
    }

    public  synchronized boolean getLast(){
        System.out.println("In Method get getLast" );
        return true;
    }

    public void run() {
        System.out.println("Starting the thread " + getName());

        if(getName().equalsIgnoreCase("Pawan")){
            System.out.println("In thread " + getName());
            TestClass.getFirstName();
        }
        else if(getName().equalsIgnoreCase("Sunita")){
            System.out.println("In thread " + getName());
            TestClass.getFName();
        }
        else {
            System.out.println("In thread " + getName());
            new TestClass().getLast();
        }
    }

    public static void main(String args[]) {
        TestClass asyncThread1 = new TestClass();
        TestClass asyncThread2 = new TestClass();
        TestClass asyncThread3 = new TestClass();
        // start both the threads around the same time
        asyncThread1.setName("Pawan");
        asyncThread1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        asyncThread2.setName("Hrishi");
        asyncThread3.setName("Sunita");

        asyncThread2.start();
        asyncThread3.start();
    }
}
