package assignement6;

public class Customer {
	protected String name;
	protected int age;
	public Customer(String nameOfCustomer, int ageOfCustomer)
	{
		name = nameOfCustomer;
		age = ageOfCustomer;
	}
	public Customer(Customer a)
	{
		name = a.name;
		age = a.age;
	}
	public String toString()
	{
		return "Name of Customer " + name + " Age of Customer: " + age;
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
