class Human
{
	private int age;
	private String name;
	
	public int getAge()
	{
		return age;
	}
	public void SetAge(int age)
	{
        this.age=age;
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}

public class getSet {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
		obj.SetAge(30);
		obj.setName("cici");
		
		System.out.println(obj.getName()+" : "+obj.getAge());
	
	}
}