class Kerosene{
    double price;
	int quantity;
	boolean quality;
	Kerosene()
	{
	System.out.println("No parameter const");	
	}
	Kerosene(double price,int quantity,boolean quality)
	{
	System.out.println("Constructor to init price,quantity and quality");
     this.price=price;
     this.quantity=quantity;
     this.quality=quality;	 
	}
	Kerosene(boolean quality)
	{
	System.out.println("Constructor to init quality");
     this.quality=quality;	
	}
	Kerosene(double price)
	{
	System.out.println("Constructor to init price");
     this.price=price;	
	}
}