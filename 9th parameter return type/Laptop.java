class Laptop{
 public static String countryname(String code){
 System.out.println("code:"+code);
 if(code=="US")
 {
   return "United States";
 }
 if(code=="CA")
 {
   return "Canada";
 }
 if(code=="JA")
 {
   return "Japan";
 }
 if(code=="DE")
 {
   return "Germany";
 }
 if(code=="IN")
 {
   return "India";
 }
  System.out.println("Not found");
  return "Not found";
 }
 
public static double price(String item){
	System.out.println("item:"+item);
	if(item=="fan")
	{
		return 1500;
	}
	if(item=="tv")
	{
		return 15000;
	}
	if(item=="washingmachine")
	{
		return 25500;
	}
	if(item=="refrigerator")
	{
		return 30500;
	}
	if(item=="dishwash")
	{
		return 50000;
	}
	//System.out.println("Not found");
  return 0;	
}
 public static String produer(String movie){
	System.out.println("movie:"+movie);
	if(movie=="Mission: Impossible III")
	{
		return "J. J. Abrams";
	}
	if(movie=="Love All You Have Left")
	{
		return "Caroline Amiguet";
	}
	if(movie=="kalki2898AD")
	{
		return "Swapna datt";
	}
	if(movie=="KGF")
	{
		return "vijay kirgandoru";
	}
	if(movie=="Salar")
	{
		return "vijay tirgandoru";
	}
	System.out.println("Not found");
  return "Not found";	
}
 
 
}