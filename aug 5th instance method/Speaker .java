class Speaker 
{
  String brand;
  int size;
  double cost;
  String output="Stereo";
  public Speaker(int size)
  {
   this.size=size;
  }
  public void setCost(double cost)
  {
   this.cost=cost;
  }
  public void display()
  {
  System.out.println("output:"+output);
  System.out.println("size:"+size);
  System.out.println("cost:"+cost);
  System.out.println("brand:"+brand);
  }

}