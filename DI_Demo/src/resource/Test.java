package resource;

public class Test {
	private String name;
	private int age;
	private String email;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void printdata() {
		System.out.println("name "+name);
		System.out.println("Age "+age);
		System.out.println("Email id"+email);
	}
}
