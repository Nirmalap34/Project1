class BloodRunner{
  public static void main(String[] args){
  System.out.println("running main in bloodrunning");
  String type=Blood.group();
  System.out.println("blood group is:"+type);
  String name=Blood.personName();
  System.out.println("personName is:"+name);
  double cost=Blood.cost();
  System.out.println("blood cost is:"+cost);
  String hospital=Blood.hospitalTested();
  System.out.println("hospitalTested is:"+hospital);
  boolean sick=Blood.sickness();
  System.out.println("sickness is:"+sick);
  boolean given=Blood.donate();
  System.out.println("donated is:"+given);
  }

}