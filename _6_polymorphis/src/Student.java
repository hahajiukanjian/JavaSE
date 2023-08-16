public class Student extends People {

	public String name = "子类Student";
	@Override
	public void run() {
		System.out.println("class: Student\t学生跑的非常快");
	}

	public void test() {
		System.out.println("class: Student\t学生需要考试～");
	}

}
