package com.pnc.modules;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteToFile {

	public void writeToFile(Map<String, Integer> sorted, FileWriter writer) {
		// print sorted treemap to file
		sorted.forEach((k, v) -> {
			try {

				writer.write(String.format("%-15s %d\n", k, v));
			} catch (Exception e) {
				e.printStackTrace();
			}

		});
		try {
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Finished with write to file copy.txt");

	}

	public void startWrite(Map<String, Integer> sorted) {
		// create file and writer
		File copy = new File("copy.txt");

		try {
			FileWriter writer = new FileWriter(copy, true);
			writeToFile(sorted, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
