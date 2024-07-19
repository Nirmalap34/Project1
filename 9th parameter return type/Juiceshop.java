class Juiceshop{
 public static double price(String name,boolean ice){
 System.out.println("name of the juice:"+name);
 if(name=="apple")
 {
  if(ice==true){
	  return 80;
  }
  else 
  {
	 return 50; 	  
  }
 }
 if(name=="mango")
 {
  if(ice==true){
	  return 50;
  }
  else 
  {
	 return 30; 	  
  } 
 }
 if(name=="sapota")
 {
  if(ice==true){
	  return 60;
  }
  else 
  {
	 return 40; 	  
  } 
 }
 if(name=="watermelon")
 {
  if(ice==true){
	  return 70;
  }
  else 
  {
	 return 50; 	  
  }
 
 }
 if(name=="chiku")
 {
  if(ice==true){
	  return 60;
  }
  else 
  {
	 return 40; 	  
  }
 
 }
 System.out.println("Not found");
 return 0; 
 
 }



}