class Hotel
{
	
	String name="Rama hotel";
	Owner owner=new Owner("Anusha",22,'f');
	
	public Hotel()
	{
	System.out.println("created Hotel using no augments const");	
	}
	
	public void print()
	{	
		System.out.println("hotel name:"+name);
		owner.print();
	}
	
	
	
	
}