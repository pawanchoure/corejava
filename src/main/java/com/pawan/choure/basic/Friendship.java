package com.pawan.choure.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Friendship extends HashMap<String, List<String>> {

	public void put(String key, String number) {
		List<String> current = get(key);
		if (current == null) {
			current = new ArrayList<String>();
			super.put(key, current);
		}
		current.add(number);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * davidbowie omid davidbowie kim kim torsten torsten omid brendan
		 * torsten ziggy davidbowie mick ziggy
		 */
	

		Friendship user = new Friendship();
		user.put("davidbowie", "omid");
		user.put("davidbowie", "kim");
		user.put("kim", "torsten");
		user.put("torsten", "omid");
		user.put("brendan", "torsten");
		user.put("ziggy", "davidbowie");
		user.put("mick", "ziggy");

		// Putting the same value in reverse
		user.put("omid", "davidbowie");
		user.put("kim", "davidbowie");
		user.put("torsten", "kim");
		user.put("omid", "torsten");
		user.put("torsten", "brendan");
		user.put("davidbowie", "ziggy");
		user.put("ziggy", "mick");

		ArrayList<String> userEntryList = new ArrayList<>();

		// For N=1
		for (Entry e : user.entrySet()) {
			//System.out.println(e.getKey() + " -> " + e.getValue());
			userEntryList.add(String.valueOf(e.getKey()));
		}

		System.out.println("##########################");
		// For Rest Case
		for (int i = 0; i <= userEntryList.size() - 1; i++) {
			List<String> output = new ArrayList<>();
			output.add(userEntryList.get(i));

			// Get All Related Friend of User I
			List<String> friends = user.get(userEntryList.get(i));
			output.addAll(friends);

			for (int j = 0; j < friends.size(); j++) {
				List<String> a = new ArrayList<>();
				a.addAll(user.get(friends.get(j)));
				for (int k = 0; k < a.size(); k++) {
					if(!output.contains(a.get(k))){
						output.add(a.get(k));
						}
				}

			}
			System.out.println(output.toString());

		}

	}

}
