class JuiceRunner{
  public static void main(String[] args)
  {
   double withice=Juiceshop.price("apple",true);
   System.out.println("withice:"+withice);
   
   double withice1=Juiceshop.price("mango",true);
   System.out.println("withice:"+withice1);
   
   double withoutice=Juiceshop.price("sapota",false);
   System.out.println("withoutice:"+withoutice);
   
   double withice2=Juiceshop.price("watermelon",true);
   System.out.println("withice:"+withice2);
   
   double withoutice1=Juiceshop.price("chiku",false);
   System.out.println("withoutice:"+withoutice1);
   
   double ice=Juiceshop.price("graphs",false);
   }
   }	
   