package ch14_IO.questions;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ChimpanzeeTest {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		File dataFile = new File("chimpanzee.data");
		/*var chimpanzees = new ArrayList<Chimpanzee>();
		chimpanzees.add(new Chimpanzee("Ham", 2, 'A'));
		chimpanzees.add(new Chimpanzee("Enos", 4, 'B'));
		saveToFile(chimpanzees, dataFile);
		new Chimpanzee("smck", 1, 'g');*/
		var chimpanzeesFromDisk = readFromFile(dataFile);
		
		System.out.println(chimpanzeesFromDisk);
	}

	static void saveToFile(List<Chimpanzee> gorillas, File dataFile) throws IOException {
		try (var out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)))) {
			for (Chimpanzee gorilla : gorillas)
				out.writeObject(gorilla);
		}
	}

	static List<Chimpanzee> readFromFile(File dataFile) throws IOException, ClassNotFoundException {
		var gorillas = new ArrayList<Chimpanzee>();
		try (var in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))) {
			while (true) {
				var object = in.readObject();
				if (object instanceof Chimpanzee g)
					gorillas.add(g);
			}
		} catch (EOFException e) {
			// File end reached
		}
		return gorillas;
	}
}
