class Projector
{
   String company;
   String type="LCD";
   String color;
   int weight;
   public Projector(String color)
  {
   this.color=color;
  }
  public void setCompany(String company)
  {
   this.company=company;
  }
  public void print()
  {
  System.out.println("type:"+type);
  System.out.println("color:"+color);
  System.out.println("company:"+company);
  System.out.println("weight:"+weight); 
  }
	

}