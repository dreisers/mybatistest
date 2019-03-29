package net.mem;

public class MemDTO {

	private int num;
	private String name;
	private int age;

	public MemDTO() {}
//-----------------------------------------------------------
	// �ŰԺ����� �ٸ� ������ ������ �Լ� �߰�
	// 1) num
	public MemDTO(int num) {
		this.num = num;
	}
	// 2) num + age
	public MemDTO(int num, int age) {
		this.num = num;
		this.age = age;
	}
	// 3) name + age
	public MemDTO(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 4) num + name + age
	public MemDTO(int num, String name, int age) {
		this.num = num;
		this.name = name;
		this.age = age;
	}
//----------------------------------------------------------
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	@Override
	public String toString() {
		return "MemDTO [num=" + num + ", name=" + name + ", age=" + age + "]";
	}

}// class end
