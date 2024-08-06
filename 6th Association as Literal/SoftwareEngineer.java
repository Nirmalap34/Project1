class SoftwareEngineer
{	
	String name;
	int experience;
	String designation;
	double salary;
	public SoftwareEngineer(String name,int experience,String designation,long salary)
	{
		System.out.println("created SoftwareEngineer with augments const");
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
	}
	public void result()
	{	
		System.out.println("software engineer name:"+name);
		System.out.println("software engineer experience:"+experience);
		System.out.println("software engineer designation:"+designation);
		System.out.println("software engineer salary:"+salary);
	}
	
	
	
}