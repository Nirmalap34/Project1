class CapitalCity
{
	String name;
	long population;
	public CapitalCity(String name,long population)
	{
		System.out.println("created capitalcity with augments const");
		this.name=name;
		this.population=population;
		
	}
	public void display()
	{	
		System.out.println("CapitalCity name:"+name);
		System.out.println("CapitalCity population:"+population);
	}
	
	
}