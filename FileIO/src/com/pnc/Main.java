package com.pnc;

import com.pnc.modules.ReadFromFile;
import com.pnc.modules.WriteToFile;

public class Main {

	public static void main(String[] args) {
		//Instantiate
		WriteToFile file = new WriteToFile();

		file.startWrite(ReadFromFile.readFromFile());

	}// end main method

}// end class
