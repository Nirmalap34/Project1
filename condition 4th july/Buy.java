class Buy{
 public static void product(String brand,double price ){
 System.out.println("running product in Buy");
 System.out.println("brand:"+brand);
 System.out.println("price:"+price);
 if (price > 100) {
            System.out.println("This is an expensive product.");
        } else {
            System.out.println("This is an affordable product.");
        }
 }
 public static void product(String name,int quantity,String quality,double price){
 System.out.println("running  product in Buy");
 System.out.println("name:"+name);
 System.out.println("quantity:"+quantity);
 System.out.println("quality:"+ quality);
 System.out.println("price:"+price);
 if (quantity > 7) {
            System.out.println("The quantity is valid.");
        } else {
            System.out.println("The quantity is not valid.");
        }
 }
 public static void bookMovieTicket(String name,String theaterName,int quantity,double price){
 System.out.println("running bookMovieTicket in Buy");
 System.out.println("name:"+name);
 System.out.println("theaterName:"+theaterName);
 System.out.println("quantity:"+quantity);
 System.out.println("price:"+price);
 if (theaterName.equalsIgnoreCase("theaterName")) {
    System.out.println("The theater is valid.");
} else {
    System.out.println("The theater is not valid.");
}
 }
 public static void buyEgg(int total,double pricePerEgg){
 System.out.println("running buyEgg in Buy");
 System.out.println("total:"+total);
 System.out.println("pricePerEgg:"+pricePerEgg);
 if (pricePerEgg > 10) {
            System.out.println("The price per egg is valid.");
        } else {
            System.out.println("The price per egg is not valid.");
        }
 }
 public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate){
 System.out.println("running buyShampoo in Buy");
 System.out.println("quantityInMl:"+quantityInMl);
 System.out.println("price:"+price);
 System.out.println("brand:"+brand);
 System.out.println("manfDate:"+manfDate);
 if (quantityInMl > 750) {
            System.out.println("Quantity is valid.");
        } else {
            System.out.println("Invalid quantity.");
        }
 }
 public static void buyCake(char size,String type,String flavour,double cost,int quantity){
 System.out.println("running buyCake in Buy");
 System.out.println("size:"+size);
 System.out.println("type:"+type);
 System.out.println("flavour:"+flavour);
 System.out.println("cost:"+cost);
 System.out.println("quantity:"+quantity);
  if (cost >= 20) {
            System.out.println("Cost is valid.");
        } else {
            System.out.println("Invalid cost.");
        }
 }
 public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize){
 System.out.println("running buyLaptop in Buy");
 System.out.println("brand:"+brand);
 System.out.println("serialNo:"+serialNo);
 System.out.println("price:"+price);
 System.out.println("batteryCapacity:"+batteryCapacity);
 System.out.println("screenSize:"+screenSize);
 System.out.println("os:"+os);
 System.out.println("harddiskSize:"+harddiskSize);
 System.out.println("ramSize:"+ramSize);
 if (harddiskSize > 8) {
            System.out.println("Hard disk size is valid.");
        } else {
            System.out.println("Invalid hard disk size.");
        }
 
 }
 public static void buySmartWatch(String brand,double price,int color,char type,int mode) {
	 System.out.println("running buySmartWatch in Buy");
 System.out.println("brand:"+brand);
 System.out.println("price:"+price);
 System.out.println("color:"+color);
 System.out.println("type:"+type);
 System.out.println("mode:"+mode);
 if (color >= 7) {
    System.out.println("The color is valid.");
} else {
    System.out.println("The colo is not valid.");
}
 }
}