package vo;

public class Actor {
	private int id;
	private String name;
	private String sex;
	private int age;

	public int getId() {
		return id;
	}

	public Actor setId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Actor setName(String name) {
		this.name = name;
		return this;
	}

	public String getSex() {
		return sex;
	}

	public Actor setSex(String sex) {
		this.sex = sex;
		return this;
	}

	public int getAge() {
		return age;
	}

	public Actor setAge(int age) {
		this.age = age;
		return this;
	}
}
