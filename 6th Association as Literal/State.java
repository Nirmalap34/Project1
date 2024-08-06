class State
{
	String name="Kerala";
	String language;
	CapitalCity capitalcity=new CapitalCity("Iritty",276897);
	
	public State(String language)
	{
	    System.out.println("created state with augments const");
		this.language=language;
	}
	
	public void display()
	{	
		System.out.println("State name:"+name);
		System.out.println("State language:"+this.language);
		capitalcity.display();
	}
	
	
	
}