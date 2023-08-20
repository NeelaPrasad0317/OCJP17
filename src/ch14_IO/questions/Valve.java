package ch14_IO.questions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Valve implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int chambers = -1;
	private transient Double size = null;
	private static String color;

	public Valve() {
		this.chambers = 3;
		color = "BLUE";
	}

	public static void main(String[] love) throws Throwable {
		try (var o = new ObjectOutputStream(new FileOutputStream("scan.txt"))) {
			final Valve v = new Valve();
			v.chambers = 2;
			v.size = 10.0;
			v.color = "RED";
			o.writeObject(v);
		}
		new Valve();
		try (var i = new ObjectInputStream(new FileInputStream("scan.txt"))) {
			Valve v = (Valve) i.readObject();
			System.out.print(v.chambers + "," + v.size + "," + v.color);
		}
	}

	{
		chambers = 4;
	}
}