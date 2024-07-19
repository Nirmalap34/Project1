class ForestRunner{
public static void main(String[] forestinfo){
if(forestinfo.length==4){
String name=forestinfo[0];
System.out.println("name:"+name);
String area=forestinfo[1];
System.out.println("area:"+area);
String establishedYear=forestinfo[2];
System.out.println("establishedYear:"+establishedYear);
String state=forestinfo[3];
System.out.println("state:"+state);
}
else{
System.out.println("least 4 reference needed");
}

}
}