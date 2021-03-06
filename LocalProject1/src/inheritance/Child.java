package inheritance;


public class Child {
	
	private int age;
	private String name;
	private String lastName;
	
	
	public Child(int age, String name, String lastName) {
		super();
		this.age = age;
		this.name = name;
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Child [age: " + age + ", name: " + name + ", last name: " + lastName + "]";
	}
	
	public void sayHelloPolymorphism() {
		System.out.println("Hella");
	}
}
