class Chocolate
{
  String brand="Nestle";
  double price;
  String flavour;
  String size;
  public Chocolate(double price)
  {
   this.price=price;
  }
  public void setFlavour(String flavour)
  {
   this.flavour=flavour;
  }
  public void print()
  {
  System.out.println("brand:"+brand);
  System.out.println("price:"+price);
  System.out.println("flavour:"+flavour);
  System.out.println("size:"+size); 
  }

}