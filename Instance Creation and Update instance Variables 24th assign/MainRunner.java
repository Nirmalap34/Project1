class MainRunner{
    public static void main(String[] args) {
        // Creating instances and printing default values
		System.out.println("start main in mainrunner");
        Rupee rupee = new Rupee();
		int ref1=rupee.value;
		String ref2=rupee.country;
		String ref3=rupee.symbol;
		System.out.println("rupee value is:"+ref1);
		System.out.println("rupee country is:"+ref2);
		System.out.println("rupee symbol is:"+ref3);
		
		AirCondition airCondition = new AirCondition();
		String air1=airCondition.type;
		int air2=airCondition.capacity;
		String air3=airCondition.Brand;
		System.out.println("airCondition type:"+air1);
		System.out.println("airCondition capacity:"+air2);
		System.out.println("airCondition Brand:"+air3);
		
		Autorikshaw autorikshaw = new Autorikshaw();
		String auto1=autorikshaw.model;
		int auto2=autorikshaw.seatingCapacity;
		String auto3=autorikshaw.fuelType;
		System.out.println("autorikshaw model:"+auto1);
		System.out.println("autorikshaw seatingCapacity:"+auto2);
		System.out.println("autorikshaw fuelType:"+auto3);
		
		AutoDriver autoDriver = new AutoDriver();
		String dri1=autoDriver.name;
		int dri2=autoDriver.age;
		char dri3=autoDriver.gender;
		System.out.println("autoDriver name:"+dri1);
		System.out.println("autoDriver age:"+dri2);
		System.out.println("autoDriver gender:"+dri3);
		
		Rapido rapido = new Rapido();
		String rap1=rapido.driverName;
		String rap2=rapido.bikeModel;
		String rap3=rapido.bikeNo;
		System.out.println("rapido driverName:"+rap1);
		System.out.println("rapido bikeModel:"+rap2);
		System.out.println("rapido bikeNo:"+rap3);
		
		CabCompany cabCompany = new CabCompany();
		String cab1=cabCompany.name;
		int cab2=cabCompany.numberOfCabs;
		String cab3=cabCompany.headquarters;
		System.out.println("cabCompany name:"+cab1);
		System.out.println("cabCompany numberOfCabs:"+cab2);
		System.out.println("cabCompany headquarters:"+cab3);
		
		Bmtc bmtc = new Bmtc();
		String bus1=bmtc.busModel;
		int bus2=bmtc.seatingCapacity;
		String bus3=bmtc.route;
		System.out.println("bmtc busModel:"+bus1);
		System.out.println("bmtc seatingCapacity:"+bus2);		
		System.out.println("bmtc route:"+bus3);
		
		FoodDeliveryCompany foodDeliveryCompany = new FoodDeliveryCompany();
		String fooddel1=foodDeliveryCompany.name;
		int fooddel2=foodDeliveryCompany.numberOfDeliveryPersons;
		String fooddel3=foodDeliveryCompany.branch;
		System.out.println("foodDeliveryCompany name:"+fooddel1);
		System.out.println("foodDeliveryCompany numberOfDeliveryPersons:"+fooddel2);
		System.out.println("foodDeliveryCompany branch:"+fooddel3);
		
		// Updating and printing values for the next set of classes
		
		Matrimony1 matrimony = new Matrimony1();
        matrimony.name = "akash";
        matrimony.age = 32;
        matrimony.address = "mysore";
		System.out.println("name:"+matrimony.name);
		System.out.println("age:"+matrimony.age);
		System.out.println("address:"+matrimony.address);
		
		Application application = new Application();
        application.appName = "WhatsApp";
        application.version = "2.23.15";
        application.developer = "WhatsApp LLC";
		System.out.println("appName:"+application.appName);
		System.out.println("version:"+application.version);
		System.out.println("developer:"+application.developer);
		
		Fruit fruit = new Fruit();
        fruit.name = "mango";
        fruit.color = "orange";
        fruit.shape = "Oval";
		System.out.println("name:"+fruit.name);
		System.out.println("color:"+fruit.color);
		System.out.println("shape:"+fruit.shape);
		
		Juice juice = new Juice();
        juice.name = "apple";
        juice.quantity = 250;
        juice.brand = "Juicy";
		System.out.println("name:"+juice.name);
		System.out.println("quantity:"+juice.quantity);
		System.out.println("brand:"+juice.brand);
		
		Place place = new Place();
        place.name = "mysore palace";
        place.location = "mysore";
        place.avalability = "morning";
		System.out.println("name:"+place.name);
		System.out.println("location:"+place.location);
		System.out.println("avalability:"+place.avalability);
		
		AlcoholBrand alcoholBrand = new AlcoholBrand();
        alcoholBrand.name = "blackdog whiskey";
        alcoholBrand.quantity = 1500;
        alcoholBrand.manufacture = "may 2024";
		System.out.println("name:"+alcoholBrand.name);
		System.out.println("quantity:"+alcoholBrand.quantity);
		System.out.println("manufacture:"+alcoholBrand.manufacture);
		
		Candy candy = new Candy();
        candy.name = "Lollipop";
        candy.price = 10.0;
        candy.flavor = "orange";
		System.out.println("name:"+candy.name);
		System.out.println("price:"+candy.price);
		System.out.println("flavor:"+candy.flavor);
		
		Medicine medicine = new Medicine();
        medicine.name = "Paracetamol";
        medicine.sickness = "Pain relief";
        medicine.price = 5.0;
		System.out.println("name:"+medicine.name);
		System.out.println("sickness:"+medicine.sickness);
		System.out.println("price:"+medicine.price);
		
		Food1 food = new Food1();
        food.name = "Pizza";
        food.quantity = 300;
        food.cuisine = "Italian";
		System.out.println("name:"+food.name);
		System.out.println("quantity:"+food.quantity);
		System.out.println("cuisine:"+food.cuisine);
		System.out.println("end main in mainrunner");
		}
		}