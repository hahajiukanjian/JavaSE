public class Test {

	public static void main(String[] args) {

		People pt = new Teacher();
		People ps = new Student();

		pt.run();
		ps.run();

		System.out.println(pt.name);
		System.out.println(ps.name);

		People p1 = new Teacher();

		if (p1 instanceof Student) {
			Student s1 = (Student) p1;
			s1.test();
		} else {
			Teacher t1 = (Teacher) p1;
			t1.question();
		}

	}

}