class LaptopRunner{
  public static void main(String[] args)
  {
   System.out.println("running main in laptoprunner");
   String cname=Laptop.countryname("US");
   System.out.println("cname:"+cname);
   
   String cname1=Laptop.countryname("CA");
   System.out.println("cname1:"+cname1);
   
   String cname3=Laptop.countryname("JA");
   System.out.println("cname3:"+cname3);
   
   String cname4=Laptop.countryname("DE");
   System.out.println("cname4:"+cname4);
   
   String cname5=Laptop.countryname("IN");
   System.out.println("cname5:"+cname5);
   
   String cname6=Laptop.countryname("CI");
  //System.out.println("code:"+cod6);
   
   double value=Laptop.price("fan");
   System.out.println("value:"+value);
   
   double value1=Laptop.price("tv");
   System.out.println("value:"+value1);
   
   double value2=Laptop.price("washingmachine");
   System.out.println("value:"+value2);
   
   double value3=Laptop.price("refrigerator");
   System.out.println("value:"+value3);
   
   double value4=Laptop.price("dishwash");
   System.out.println("value:"+value4);
   
   double value5=Laptop.price("laptop");
   System.out.println("value:"+value5);
   
   String mname=Laptop.produer("Mission: Impossible III");
   System.out.println("name:"+mname);
   
   String mname1=Laptop.produer("Love All You Have Left");
   System.out.println("name:"+mname1);
   
   String mname2=Laptop.produer("kalki2898AD");
   System.out.println("name:"+mname2);
   
   String mname3=Laptop.produer("KGF");
   System.out.println("name3:"+mname3);
   
   String mname4=Laptop.produer("Salar");
   System.out.println("name:"+mname4);
   
   String mname5=Laptop.produer("prasad devineni");
   //System.out.println("code:"+code1);
   
   
  }


}