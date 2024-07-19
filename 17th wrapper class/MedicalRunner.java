class MedicalRunner{
public static void main(String[] args){
 if(args.length==4)
 {
 String name=args[0];
 String manfDate=args[1];
 String price=args[2];
 String quantity=args[3];
 Double convertedPrice=Double.parseDouble(price);
 Integer convertedQuantity=Integer.parseInt(quantity);
 Medical.medicineInformation(name,manfDate,convertedPrice,convertedQuantity);
 }
 else{
 System.out.println("least 4 reference needed");
 }
 
 }
}
