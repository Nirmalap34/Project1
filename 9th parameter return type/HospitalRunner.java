class HospitalRunner{
  public static void main(String[] args)
  {
   System.out.println("running main in hospitalrunner");
   double value=Hospital.price("Paracetamol");
   System.out.println("value:"+value);
   
   double value1=Hospital.price("Ibuprofen");
   System.out.println("value:"+value1);
   
   double value2=Hospital.price("Amoxicillin");
   System.out.println("value:"+value2);
   
   double value3=Hospital.price("Azture");
   //System.out.println("value:"+value3);
   
   String mname=Hospital.medicineName("Fever");
   System.out.println("mname:"+mname);
   
   String mname1=Hospital.medicineName("Inflammation");
   System.out.println("mname1:"+mname1);
   
   String mname3=Hospital.medicineName("Bacterial infections");
   System.out.println("mname3:"+mname3);
   
   String mname4=Hospital.medicineName("cold");
   //System.out.println("symptom4:"+symptom4);
   
    String dname=Hospital.availability("Yashwanth");
   System.out.println("dname:"+dname);
   
   String  dname1=Hospital.availability("Suma");
   System.out.println("dname1:"+dname1);
   
   String  dname3=Hospital.availability("Anusha");
   System.out.println("dname3:"+dname3);
   
   String dname4=Hospital.availability("Chetan");
   
   
   
   
   }
   }