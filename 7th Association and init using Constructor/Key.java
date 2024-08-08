class Key
{
 double weight;
 String brand;
 
 public Key(double weight,String brand)
 {
   System.out.println("created key using double and brand");
   this.weight=weight;
   this.brand=brand;
 }
  public void display()
  {
   System.out.println("key weight:"+weight);
   System.out.println("key brand:"+brand);
  
  }
 }