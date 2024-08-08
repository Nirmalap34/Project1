class GanaviRunner
{
  public static void main(String[] args)
  {
  Clip clip=new Clip("white","butterfly");
  Ganavi ganavi=new Ganavi("ganavi@gmail.com",clip);
  ganavi.print();
  
  System.out.print("=============================");
  Clip clip1=new Clip("black","banana");
  Ganavi ganavi1=new Ganavi("ganavi@gmail.com",clip1);
  ganavi1.print();
  
  System.out.print("=============================");
  Clip clip2=new Clip("pink","snap");
  Ganavi ganavi2=new Ganavi("ganavi@gmail.com",clip2);
  ganavi2.print();
  }

}