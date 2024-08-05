class Mask{
  double cost;
  char size;
  String material;
  Mask()
  {
  System.out.println("No parameter const");
  }
  Mask(double cost)
  {
  System.out.println("Constructor to init cost");
  this.cost=cost;
  }
  Mask(char size)
  {
  System.out.println("Constructor to init size");
  this.size=size;
  }
  Mask(String material )
  {
  System.out.println("Constructor to init material");
  this.material=material;
  }
  Mask(double cost,char size,String material )
  {
  System.out.println("Constructor to init cost ,size and material");
  this.cost=cost;
  this.size=size;
  this.material=material;
  }
  Mask(double cost,char size)
  {
  System.out.println("Constructor to init cost and size");
  this.cost=cost;
  this.size=size;
  } 
}