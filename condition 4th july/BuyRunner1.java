class BuyRunner1{
  public static void main(String[] args){
  System.out.println("running main in BuyRunner");
  Buy.product("Zudio",1500.34); 
  Buy.product("Puma",50); 
  Buy.product("shirt",5,"high",1200);
  Buy.product("tshirt",10,"low",200);
  Buy.bookMovieTicket("kalki","Navrang",10,350.2); 
  Buy.bookMovieTicket("kalki","Anjan",10,350.2);
  Buy.buyEgg(35,7);
  Buy.buyEgg(70,10);
  Buy.buyShampoo(500,150.4,"dove","may 2023");
  Buy.buyShampoo(1000,150.4,"dove","may 2023");
  Buy.buyCake('M',"triangle","venila",15.0,7);
  Buy.buyCake('s',"triangle","venila",35.0,7);
  Buy.buyLaptop("HP",1234,45000,5000,16.5,"windows 10",1000,16);
  Buy.buyLaptop("HP",1234,45000,5000,16.5,"windows 10",1000,4);
  Buy.buySmartWatch("firebolt",8176.7,2,'m',1);
  Buy.buySmartWatch("boat",1500.7,5,'s',2);
  }
  }