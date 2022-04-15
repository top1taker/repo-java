package date_8_4;

import java.io.Serializable;

public class Student extends Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2285223503513452034L;
	String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [major=" + major + ", name=" + name + ", age=" + age + "]";
	}
}
