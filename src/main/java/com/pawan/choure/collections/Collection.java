package com.pawan.choure.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hashtable<String, String> hast=new Hashtable<>();
		HashMap<String, String> hasm=new HashMap<>();
		//hast.put("1", null);
		hasm.put(null, null);
		
		HashSet<String> hashSet=new HashSet<>();
		LinkedHashSet<String> LinkedhashSet=new LinkedHashSet<>();
		TreeSet<String> treeset=new TreeSet<>();
		
		hashSet.add("P");
		hashSet.add("S");
		hashSet.add("A");
		hashSet.add(null);
		
		LinkedhashSet.add("P");
		LinkedhashSet.add("S");
		LinkedhashSet.add("A");
		LinkedhashSet.add(null);
		
		treeset.add("P");
		treeset.add("S");
		treeset.add("A");
		//treeset.add(null);
		
		System.out.println("HashSet");
		for(String s:hashSet)
		{
			System.out.println(s);
		}
		
		System.out.println("LinkedhashSet");
		for(String s:LinkedhashSet)
		{
			System.out.println(s);
		}
		
		System.out.println("TreeSet");
		for(String s:treeset)
		{
			System.out.println(s);
		}
		
		TreeMap<String, String> tr=new TreeMap<>();
		tr.put("2", "A");
		tr.put("1", "A");
		tr.put("3", "A");
		
		
		for(Map.Entry<String, String> s:tr.entrySet())
		{
			System.out.println(s.getKey()+"  "+s.getValue());
		}
		

	}

}
