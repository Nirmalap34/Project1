class Laptop1
{
	public static boolean originalitem(String item)
	{
		System.out.println("Running originalitem in Laptop1");
		System.out.println("item is:" +item);
		
		if(item==" fan")
		{
			return true;
		}
		
		if(item=="washingmachine")
		{
			return true;
		}
		System.out.println("Not Found");
		return false;
		
	}
	
	public static double price(boolean Cancle )
{
  
  if(Cancle)

{
return -100;
}
else 
{
return 100;

}
}


public static void run()
{
String name="Salar";
if(name=="Salar")
{
System.out.println("will stop execution ");
return;
}
else
{
System.out.println("will continue execution ");
}
return;//stop the execution
}













}