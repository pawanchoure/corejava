package com.pawan.choure.basic;

public class ToStringExample {
	private int Id;
	private String Name;
	
	public ToStringExample(){
		this.Id=1;
		this.Name="Pawan";
		
	}

	public static void main(String[] args) {
		ToStringExample toStringObject=new ToStringExample();
		System.out.println("ToStringExample : "+toStringObject.toString());

	}
	
	
	public String toString(){
		return "Name : "+ Name; 
	}

}
