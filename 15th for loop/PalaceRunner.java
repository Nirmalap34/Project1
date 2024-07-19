class PalaceRunner{
public static void main(String[] palaceinfo){
if(palaceinfo.length==4){
String name=palaceinfo[0];
System.out.println("name:"+name);
String location =palaceinfo[1];
System.out.println("location :"+location );
String builtBy=palaceinfo[2];
System.out.println("builtBy:"+builtBy);
String buildYear=palaceinfo[3];
System.out.println("buildYear:"+buildYear);
}
else{
System.out.println("least 4 reference needed");
}

}
}