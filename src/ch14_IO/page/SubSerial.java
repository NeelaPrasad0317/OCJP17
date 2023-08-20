package ch14_IO.page;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class SubSerial extends ParentSerial implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SubSerial() {
		super(10);
		b = 20;
		System.out.println("sub 0-arg const");
	}

	private int b;

	public static void main(String[] args) {
		/*try (var out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(Path.of("E:/test.json").toFile())));) {
		
			var obj = new SubSerial();
			obj.b = 50;
		//			obj.a=50;
			out.writeObject(obj);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} */

		try (var in = new ObjectInputStream(new BufferedInputStream(
				new FileInputStream(FileSystems.getDefault().getPath("E:/test.json").toFile())));) {
			var obj2 = in.readObject();
			if (obj2 instanceof SubSerial sub) {
				System.out.println(sub);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public String toString() {
		return "SubSerial [b=" + b + ", getA()=" + getA() + "]";
	}



}
