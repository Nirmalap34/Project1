class Train{
  public static void book(String source,String destination){
  System.out.println("runing book in Train");
  System.out.println("source"+source);
  System.out.println("destination"+destination);
  }
  public static void book(String source,String destination,int quantity){
  System.out.println("runing book in Train");
  System.out.println("source"+source);
  System.out.println("destination"+destination);
  System.out.println("quantity"+quantity);
  }   
  public static void book(String source,String destination,int quantity,int price){
  System.out.println("runing book in Train");
  System.out.println("source"+source);
  System.out.println("destination"+destination);
  System.out.println("quantity"+quantity);
  System.out.println("price"+price);
  }
  public static void cancle(int ticketNo){
  System.out.println("runing cancle in Train");
  System.out.println("ticketNo"+ticketNo);	  
  } 
  public static void quit(String source,String destination){
  System.out.println("runing quit in Train");
  System.out.println("source"+source);
  System.out.println("destination"+destination);
  }  
}