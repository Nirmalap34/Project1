class AnanyaRunner
{
  public static void main(String[] args)
  {
  Knife knife=new Knife(90,12);
  Ananya ananya=new Ananya(9964736258L,knife);
  ananya.print();
  
  System.out.print("=============================");
  Knife knife1=new Knife(110,19);
  Ananya ananya1=new Ananya(9964736258L,knife1);
  ananya1.print();
  
  System.out.print("=============================");
  Knife knife2=new Knife(150,25);
  Ananya ananya2=new Ananya(9964736258L,knife2);
  ananya2.print();
  
  }

}