package LambdaDemo;

//class Employee implements Comparable<Employee> {
class Employee {
    private int ID;
    private String Name;   
    private int Age; 

    public Employee() {}
    public Employee(String name, int id, int age) {
        this.ID = id;
        this.Name = name;
        this.Age = age;
    }
    
	public int getId() {
		return ID;
	}
	public void setId(int id) {
		this.ID = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		this.Age = age;
	}
	
	@Override
    public String toString() {
        return  Name +" "+ ID +" "+ Age;
    }
	
}