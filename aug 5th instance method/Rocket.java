class Rocket
{
   String country;
   int speed;
   double fuelCapacity;
   int noOfThrusters=4;
   public Rocket(int speed)
  {
   this.speed=speed;
  }
  public void setFuelCapacity(double fuelCapacity)
  {
   this.fuelCapacity=fuelCapacity;
  }
  public void display()
  {
  System.out.println("noOfThrusters:"+noOfThrusters);
  System.out.println("speed:"+speed);
  System.out.println("fuelCapacity:"+fuelCapacity);
  System.out.println("country:"+country);
  }


}