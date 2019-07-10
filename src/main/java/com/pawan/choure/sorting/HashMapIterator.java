package com.pawan.choure.sorting;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String,String> mp = new HashMap<String,String>();
        Iterator<String>  it=mp.keySet().iterator();
/*       while(it.hasNext())
        {
            System.out.println("///"+mp.get(it.next()));
        }*/
      

        mp.put("a", "ketan");
        mp.put("g", "divya");
        mp.put("r", "amol");

        
        while(it.hasNext())
        {
            System.out.println(mp.get(it.next()));
        }
        for (Map.Entry<String,String> entry : mp.entrySet()) {
            System.out.println("key ->" + entry.getKey() + ", value->" + entry.getValue());
        }


	}

}
