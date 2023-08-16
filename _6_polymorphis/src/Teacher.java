public class Teacher extends People {

	public String name = "子类Teacher";

	@Override
	public void run() {
		System.out.println("class: Teacher\t老师跑的比较慢");
	}

	public void question() {
		System.out.println("class: Teacher\t老师会出题");
	}

}
