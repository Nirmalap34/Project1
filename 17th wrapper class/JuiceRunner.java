class JuiceRunner{
public static void main(String[] args)
{
if(args.length==5)
{
 String name=args[0];
 String brand=args[1];
 String flavour=args[2];
 String price=args[3];
 String quantity=args[4];
 Double convertedPrice=Double.parseDouble(price);
 Integer convertedQuantity=Integer.parseInt(quantity);
 Juice.juiceInfo(name,brand,flavour,convertedPrice,convertedQuantity);
 }
 else{
 System.out.println("least 4 reference needed");
 }
}
}