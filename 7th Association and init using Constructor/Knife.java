class Knife
{
 double weight;
 int height;
  public Knife(double weight,int height)
  {
   System.out.println("created key using double and int");
   this.weight=weight;
   this.height=height;
  }
  public void display()
  {
   System.out.println("knife weight:"+weight);
   System.out.println("knife height:"+height);  
  }

}