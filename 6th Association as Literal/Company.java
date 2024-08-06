class Company
{
	int id;
	String name;
	String location;
	SoftwareEngineer softwareEngineer=new SoftwareEngineer("Yashwant",5,"Backend developer",100000);
	public Company(int id,String name,String location)
	{	
		System.out.println("created company with augments const");
		this.id=id;
		this.name=name;
		this.location=location;
	}
	public void result()
	{
		System.out.println("company id:"+id);
		System.out.println("company name:"+name);
		System.out.println("company location:"+location);
		softwareEngineer.result();
		
	}
}