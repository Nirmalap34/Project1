class Clip
{
  String color;
  String type;
  public Clip(String color,String type)
 {
   System.out.println("created clip using string and string");
   this.color=color;
   this.type=type;
 }
  public void display()
  {
   System.out.println("clip color:"+color);
   System.out.println("key type:"+type);  
  }
}