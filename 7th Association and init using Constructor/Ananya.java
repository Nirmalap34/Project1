class Ananya
{
  long  mobile;
  Knife knife;
  public Ananya(long mobile,Knife knife)
  {
   System.out.println("created Ananya using string and knife");
   this.mobile=mobile;
   this.knife=knife;
  }
  public void print()
  {
  System.out.println("ananya mobile:"+mobile);
  knife.display();  
  }
}