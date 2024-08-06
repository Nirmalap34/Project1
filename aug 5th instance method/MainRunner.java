class MainRunner{
public static void main(String[] args)
{
  Speaker speaker=new Speaker(10);
  speaker.setCost(10000);
  speaker.brand="Sony";
  speaker.display();
  
  Speaker speaker1=new Speaker(12);
  speaker1.setCost(20000);
  speaker1.brand="LG";
  speaker1.display();
  
  Speaker speaker2=new Speaker(14);
  speaker2.setCost(25000);
  speaker2.brand="Bose";
  speaker2.display();
  
  System.out.println("===============================");
  Rocket rocket=new Rocket(1000);
  rocket.setFuelCapacity(5000);
  rocket.country="india";
  rocket.display();
  
  Rocket rocket1=new Rocket(1500);
  rocket1.setFuelCapacity(4000);
  rocket1.country="USA";
  rocket1.display();
  
  Rocket rocket2=new Rocket(1200);
  rocket2.setFuelCapacity(6000);
  rocket2.country="UA";
  rocket2.display();
  
  System.out.println("===============================");
  Chocolate chocolate=new Chocolate(150);
  chocolate.setFlavour("Milk");
  chocolate.size="small";
  chocolate.print();
  
  Chocolate chocolate1=new Chocolate(250);
  chocolate1.setFlavour("Dark");
  chocolate1.size="medium";
  chocolate1.print();
  
  Chocolate chocolate2=new Chocolate(350);
  chocolate2.setFlavour("Hazelnut");
  chocolate2.size="Large";
  chocolate2.print();
  
  System.out.println("===============================");
  Projector projector=new Projector("white");
  projector.setCompany("Epson");
  projector.weight=4;
  projector.print();
  
  Projector projector1=new Projector("green");
  projector1.setCompany("Sony");
  projector1.weight=5;
  projector1.print();
  
  Projector projector2=new Projector("black");
  projector2.setCompany("Epson");
  projector2.weight=6;
  projector2.print();
  
  System.out.println("===============================");
  Paper paper=new Paper("A4");
  paper.setQuality("High");
  paper.thickness="Thin";
  paper.print();
  
  Paper paper1=new Paper("A3");
  paper1.setQuality("Medium");
  paper1.thickness="Thick";
  paper1.print();
  
  Paper paper2=new Paper("A2");
  paper2.setQuality("High");
  paper2.thickness="Thin";
  paper2.print();
  
  }
}