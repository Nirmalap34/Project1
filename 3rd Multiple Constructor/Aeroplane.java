class Aeroplane{
   String company;
   int noOfSeats;
   double ticketPrice;
   String source;
   String destination;
   Aeroplane()
   {
	System.out.println("No parameter const");	
    }
   Aeroplane(String company,int noOfSeats,double ticketPrice,String source,String destination)
   {
   System.out.println("Constructor to init all instance variables");
   this.company=company;
   this.noOfSeats=noOfSeats;
   this.ticketPrice=ticketPrice;
   this.source=source;
   this.destination=destination;
   }
   Aeroplane(String company,String source,String destination)
   {
   System.out.println("Constructor to init company,source,destination");
   this.company=company;
   this.source=source;
   this.destination=destination;
   }
   Aeroplane(String company,double ticketPrice,String source,String destination)
   {
   System.out.println("Constructor to init company,ticketPrice,source,destination");
   this.company=company;
   this.ticketPrice=ticketPrice;
   this.source=source;
   this.destination=destination;
   }

}