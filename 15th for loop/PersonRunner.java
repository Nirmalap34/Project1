class PersonRunner{
public static void main(String[] personinfo){
if(personinfo.length==4){
String name=personinfo[0];
System.out.println("name:"+name);
String email=personinfo[1];
System.out.println("email:"+email);
String age=personinfo[2];
System.out.println("age:"+age);
String password=personinfo[3];
System.out.println("password:"+password);
}
else{
System.out.println("least 4 reference needed");
}

}
}