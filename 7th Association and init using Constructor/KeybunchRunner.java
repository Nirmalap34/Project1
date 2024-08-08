class KeybunchRunner
{
  public static void main(String[] args)
  {
  Key key=new Key(50,"royal");
  Keybunch keybunch=new Keybunch("silver",key);
  keybunch.print();
  
  System.out.println("==========================");
  Key key1=new Key(60,"zifting");
  Keybunch keybunch1=new Keybunch("metal",key1);
  keybunch1.print();
  
  System.out.println("==========================");
  Key key2=new Key(40,"KGN misal");
  Keybunch keybunch2=new Keybunch("stainless steel",key2);
  keybunch2.print();
  }

}