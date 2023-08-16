package com.dyt._1_object;

public class Demo01 {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student s1 = new Student("李华", 23, new double[]{99.5, 100.0});
		Student s2 = (Student) s1.clone();

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getSources());

		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getSources());

	}

}
