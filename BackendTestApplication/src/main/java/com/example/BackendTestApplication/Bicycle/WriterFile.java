package com.example.BackendTestApplication.Bicycle;

import java.io.BufferedWriter;
import java.io.FileWriter;

public abstract class WriterFile {
	
	public static void writeToFile(String check) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/resources/Check.txt", true))){
			bw.write(check);
			
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}
	}
}
