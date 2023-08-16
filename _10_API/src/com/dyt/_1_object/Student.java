package com.dyt._1_object;

import java.util.Arrays;
import java.util.Objects;

public class Student implements Cloneable {

	private String name;
	private int age;
	private double[] sources;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return age == student.age && Objects.equals(name, student.name) && Arrays.equals(sources, student.sources);
	}

	public double[] getSources() {
		return sources;
	}

	public void setSources(double[] sources) {
		this.sources = sources;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Student s2 = (Student) super.clone();
		s2.sources = s2.sources.clone();
		return s2;
	}

	public Student() {
	}

	public Student(String name, int age, double[] sources) {
		this.name = name;
		this.age = age;
		this.sources = sources;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				", sources=" + Arrays.toString(sources) +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
