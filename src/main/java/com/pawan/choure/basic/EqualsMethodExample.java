package com.pawan.choure.basic;

import java.util.HashMap;
import java.util.Map;

public class EqualsMethodExample {
	private Integer id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EqualsMethodExample(Integer id, String name) {
		this.id = id;
		this.name = name;

	}

	public static void main(String[] args) {
		HashMap<Integer, EqualsMethodExample> equalExampleHashmap = new HashMap<>();
		EqualsMethodExample equalExampleObject1 = new EqualsMethodExample(1,"Pawan");
		EqualsMethodExample equalExampleObject2 = new EqualsMethodExample(2,"Vinod");
		equalExampleHashmap.put(equalExampleObject1.getId(),equalExampleObject1);
		equalExampleHashmap.put(equalExampleObject2.getId(),equalExampleObject2);

		for (Map.Entry<Integer, EqualsMethodExample> mapset : equalExampleHashmap.entrySet()) {

			System.out.println("Key : " + mapset.getKey() + " value : "+ mapset.getValue());
		}

		HashMap<EqualsMethodExample, EqualsMethodExample> equalExampleHashmaps = new HashMap<>();
		equalExampleHashmaps.put(equalExampleObject1, equalExampleObject1);
		equalExampleHashmaps.put(equalExampleObject2, equalExampleObject2);

		for (Map.Entry<EqualsMethodExample, EqualsMethodExample> mapset : equalExampleHashmaps.entrySet()) {

			EqualsMethodExample equalExampleObject = mapset.getKey();
			System.out.println("Key : " + equalExampleObject.getId()+ " value : " + equalExampleObject.getName());

		}

		// Finding Object Inside Hashmap
		EqualsMethodExample equalExampleObjectSearch = equalExampleHashmaps.get(equalExampleObject1);
		if (equalExampleObjectSearch != null)
			System.out.println(" Search Object Key : "
					+ equalExampleObjectSearch.getId() + " value : "
					+ equalExampleObjectSearch.getName());
		
		//Why Hashcode should be overridden
		
		
		/*distinct integers for distinct objects. (This is typically implemented by converting the internal address of the object into an integer [...])".
		The method in java.lang.Object is declared as native, which means the implementation is provided by the JVM and may vary 
		depending on your runtime environment.*/
		EqualsMethodExample equalExampleObject3 = new EqualsMethodExample(1,"Pawan");
		// Finding Object Inside Hashmap
		EqualsMethodExample equalExampleObjectSearchHashcode = equalExampleHashmaps.get(equalExampleObject3);
		if (equalExampleObjectSearchHashcode != null)
			System.out.println(" HashCode Object Key : "
					+ equalExampleObjectSearchHashcode.getId() + " value : "
					+ equalExampleObjectSearchHashcode.getName());

	}
	
	

	public boolean equals(Object o) {
		if (o instanceof EqualsMethodExample
				&& ((EqualsMethodExample) o).id.equals(this.id)
				&& ((EqualsMethodExample) o).name.equals(this.name))
			return true;
		return false;

	}

}
