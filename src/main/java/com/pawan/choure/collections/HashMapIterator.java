package com.pawan.choure.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put("1", "Pawan");
		hash.put("2", "Sacin");
		hash.put("3", "Ketan");
		
		System.out.println("Print List of Keys"+hash.keySet());
		
		TreeMap<String, String> tree = new TreeMap<String, String>();
		tree.put("1", "Pawan");
		tree.put("2", "Sacin");
		tree.put("3", "Ketan");
		
        Set s = hash.entrySet();
        Iterator i = s.iterator();
        while (i.hasNext()) {
            //System.out.println(i.next());
        	
        	/*
        	 * The Code below with Throw Exception because i.next()  java.util.HashMap$Entry
        	 * 
        	 * Exception in thread "main" java.lang.ClassCastException: java.util.HashMap$Entry cannot be cast to java.util.HashMap
			   at com.pawanchoure.core.HashMapIterator.main(HashMapIterator.java:31)
        	 */
               
        	/*HashMap<String, String> a=new HashMap<>();
              a=(HashMap<String, String>) i.next();
              System.out.println("Key"+ a.keySet()+ "Values "+a.values());*/
            
            Entry<String, String> mapEntry=(Entry<String, String>) i.next();
            System.out.println("Key"+ mapEntry.getKey()+ "Values "+mapEntry.getValue());
        	
        	
        }
        
        for (Entry<String, String> entry : hash.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key+" "+value);
        }
        
        
        Set t = tree.entrySet();
        Iterator j = t.iterator();
        while (j.hasNext()) {
                System.out.println(j.next());
        }
	}

}
