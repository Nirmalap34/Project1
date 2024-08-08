class Ganavi
{  
   String email;
   Clip clip;
   public Ganavi(String email,Clip clip)
  {
   System.out.println("created clip using string and clip");
   this.email=email;
   this.clip=clip;
  }
  public void print()
  {
   System.out.println("String email:"+email);
   clip.display();  
  }
}