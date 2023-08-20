package PracticeExam2;

import java.io.*;

public class Palace {
	public void openDrawbridge() throws Exception {
		try {
			throw new Exception("Problem");
		} catch (IOException e) {
			throw new IOException();
		} catch (FileNotFoundException e) {
			try {
				throw new IOException();
			} catch (Exception e) {
			} finally {
				System.out.println("Almost done");
			}
		} finally {
			throw new RuntimeException("Unending problem");
		}
	}

	public static void main(String[] moat) throws IllegalArgumentException {
		new Palace().openDrawbridge();
	}
}