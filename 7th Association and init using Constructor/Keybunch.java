class Keybunch
{
  String material;
  Key key;
  public Keybunch(String material,Key key)
  {
   System.out.println("created key using string and key");
   this.material=material;
   this.key=key;
  }
  public void print()
  {
  System.out.println("key material:"+material);
  key.display();  
  }
}