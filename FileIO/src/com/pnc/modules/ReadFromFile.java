package com.pnc.modules;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ReadFromFile {
	public static Map<String, Integer> readFromFile() {
		BufferedReader reader = null;
		String[] strArray;

		Map<String, Integer> bookHashMap = new HashMap<>();

		try {
			File file = new File("Planet-x.txt");
			reader = new BufferedReader(new FileReader(file));
			String line;

			while ((line = reader.readLine()) != null) {
				strArray = line.toLowerCase().trim().replaceAll("[\\p{P}&&[^\u0027]]", " ").split(" ");
//				System.out.println(Arrays.toString(strArray));

				for (String word : strArray) {

					if (!bookHashMap.containsKey(word))
						bookHashMap.put(word, 1);

					else {
						bookHashMap.put(word, bookHashMap.get(word) + 1);
					}

				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		Map<String, Integer> sorted = new TreeMap<>(bookHashMap);
		return sorted;
	}// end method

}// end class
