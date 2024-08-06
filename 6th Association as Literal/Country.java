class Country
{
	String name;
	String continent;
	State state=new State("Malayalam");
	public Country(String name,String continent)
	{	
	    System.out.println("created country with augments const");
		this.name=name;
		this.continent=continent;
	}
	
	public void display()
	{	
		System.out.println("country name:"+name);
		System.out.println("country continent:"+continent);
		state.display();
	}
	
	
	
}