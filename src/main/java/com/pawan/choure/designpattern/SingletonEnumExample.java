package com.pawan.choure.designpattern;

public enum SingletonEnumExample {
	 
    INSTANCE;
     
    public static void doSomething(){
        //do something
    }
    
    public static void main(String[] args){
    	SingletonEnumExample.doSomething();
    }
}
