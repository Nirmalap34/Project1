class Paper{
  String thickness;
  String size;
  String quality;
  String color="white";
  public Paper(String size)
  {
   this.size=size;
  }
  public void setQuality(String quality)
  {
   this.quality=quality;
  }
  public void print()
  {
  System.out.println("color:"+color);
  System.out.println("size:"+size);
  System.out.println("quality:"+quality);
  System.out.println("thickness:"+thickness); 
  }

}