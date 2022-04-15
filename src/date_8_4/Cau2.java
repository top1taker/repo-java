package date_8_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Cau2 {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("D:\\repo-java\\src\\date_8_4\\obj.txt"));
			Student[] students = new Student[3];

			students[0] = new Student("Truong", 20, "CNTT");
			students[1] = new Student("Vinh", 21, "DTVT");
			students[2] = new Student("Hieu", 22, "BC");
			// write students
			for (int i = 0; i < 3; i++) {
				oos.writeObject(students[i]);
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			oos.flush();
			oos.close();
		}

		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new FileInputStream("D:\\repo-java\\src\\date_8_4\\obj.txt"));
			Student[] studentsFromFile = new Student[3];
			for (int i = 0; i < 3; i++) {
				studentsFromFile[i] = (Student) ois.readObject();
			}

			// show students
			for (int i = 0; i < 3; i++) {
				System.out.println("Student " + i + " from file: " + studentsFromFile[i]);
			}
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} finally {
			ois.close();
		}
	}
}
