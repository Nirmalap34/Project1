class ChainRunner{
  public static void main(String[] args){
  System.out.println("running main in chainrunner");
  double carat=Chain.carat();
  System.out.println("the carat is:"+carat);
  double gram=Chain.costpergram();
  System.out.println("cost per gram is:"+gram);
  String gtype=Chain.type();
  System.out.println("type is:"+gtype);
  String quality=Chain.quality();
  System.out.println("quality is:"+quality);
  int quantity=Chain.quantity();
  System.out.println("quantity is:"+quantity);
  double wastage=Chain.wastage();
  System.out.println("wastage is:"+wastage);
  double serviceCharge=Chain.serviceCharge();
  System.out.println("serviceCharge is:"+serviceCharge);
  double gst=Chain.GST();
  System.out.println("GST:"+gst);
  
  }

}