class Hospital{
 public static double price(String medicineName){
 System.out.println("medicineName:"+medicineName);
 if(medicineName=="Paracetamol")
 {
  return 10;
 }
 if(medicineName=="Ibuprofen")
 {
  return 15; 
 }
 if(medicineName=="Amoxicillin")
 {
  return 12; 
 }
 System.out.println("not found");
 return 0;
 }
 public static String medicineName(String symptom){
 System.out.println("symptom:"+symptom);
 if(symptom=="Fever")
 {
  return "Paracetamol";
 }
 if(symptom=="Inflammation")
 {
  return "Ibuprofen";
 }
 if(symptom=="Bacterial infections")
 {
  return "Amoxicillin";
 }
 System.out.println("not found");
 return "not found";
 }
public static String availability(String doctorname){
 System.out.println("doctorname:"+doctorname);
 if(doctorname=="Yashwanth")
 {
  return "morning";
 }
 if(doctorname=="Suma")
 {
  return "afternoon";
 }
 if(doctorname=="Anusha")
 {
  return "morning";
 }
 System.out.println("not found");
 return "not found";
}
}