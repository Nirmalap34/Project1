class MainRunner{
public static void main(String[] args){
   System.out.println("starts main in mainrunner");
   Mask mask=new Mask();
   
   Mask mask1=new Mask(450);
   System.out.println("mask cost:"+mask1.cost);
   
   Mask mask2=new Mask('s');
   System.out.println("mask size:"+mask2.size);
   
   Mask mask3=new Mask("cotton");
   System.out.println("mask material:"+mask3.material);
   
   Mask mask4=new Mask(350,'M',"polystar");
   System.out.println("mask cost:"+mask4.cost);
   System.out.println("mask size:"+mask4.size);
   System.out.println("mask material:"+mask4.material);
    
   Mask mask5=new Mask(300,'M');
   System.out.println("mask cost:"+mask5.cost);
   System.out.println("mask size:"+mask5.size);	
   
   Kerosene kerosene=new Kerosene();
   
   Kerosene kerosene1=new Kerosene(100,5,true);
   System.out.println("kerosene price:"+kerosene1.price);
   System.out.println("kerosene quantity:"+kerosene1.quantity);
   System.out.println("kerosene quality:"+kerosene1.quality);
   
   Kerosene kerosene2=new Kerosene(false);
   System.out.println("kerosene quality:"+kerosene2.quality);
   
   Kerosene kerosene3=new Kerosene(150);
   System.out.println("kerosene price:"+kerosene3.price);
   
   Aeroplane aeroplane=new Aeroplane();
   
   Aeroplane aeroplane1=new Aeroplane("Air India",150,5000,"Mumbai","Delhi");
   System.out.println("Aeroplane company:"+aeroplane1.company);
   System.out.println("Aeroplane noOfSeats:"+aeroplane1.noOfSeats);
   System.out.println("Aeroplane ticketPrice:"+aeroplane1.ticketPrice);
   System.out.println("Aeroplane source:"+aeroplane1.source);
   System.out.println("Aeroplane destination:"+aeroplane1.destination);
   
   Aeroplane aeroplane2=new Aeroplane("SpiceJet", "Bangalore", "Hyderabad");
   System.out.println("Aeroplane company:"+aeroplane2.company);
   System.out.println("Aeroplane source:"+aeroplane2.source);
   System.out.println("Aeroplane destination:"+aeroplane2.destination);
   
   Aeroplane aeroplane3=new Aeroplane("Vistara", 5500.0, "Pune", "Goa");
   System.out.println("Aeroplane company:"+aeroplane3.company);
   System.out.println("Aeroplane ticketPrice:"+aeroplane3.ticketPrice);
   System.out.println("Aeroplane source:"+aeroplane3.source);
   System.out.println("Aeroplane destination:"+aeroplane3.destination);
  
}
}