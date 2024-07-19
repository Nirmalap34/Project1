class Country1
{
	public static void states(String[] states)
	
	{
		
		System.out.println("start states in Country");
		
		for(int position<states.length-1;position=>0;position--)
		{
			String ref=states[position];
			System.out.println("states:"+ref);
		}
		
		
		System.out.println("end states in Country");
	}
	
	
	
	public static void pincode(int[] pincode)
	{
		System.out.println("start pincode in Country ");
		for(int code<pincode.length;code=>0;code--)
		{
			int ref=pincode[code];
			System.out.println("pincode:"+ref);
		}
		System.out.println("end pincode in Country");
	}
	
	
	public static void primeminister(String[] primeminister)
	
	{
		
		System.out.println("start primeminister in Country");
		
		for(int minister<primeminister.length-1;minister=>0;minister--)
		{
			String ref1=primeminister[minister];
			System.out.println("primeminister:"+ref1);
		}
		
		
		System.out.println("end primeminister in Country");
	}
	
	
	
	public static void Cabinetministers(String[] Cabinetministers)
	
	{
		
		System.out.println("start Cabinet ministers in Country");
		
		for(int cabinet<Cabinetministers.length-1;cabinet=>0;cabinet--)
		{
			String ref2=Cabinetministers[cabinet];
			System.out.println("Cabinet ministers:"+ref2);
		}
		
		
		System.out.println("end Cabinet ministers in Country");
	}
	
	
	
	
	
	public static void politicalParties(String[] politicalParties)
	
	{
		
		System.out.println("start politicalParties in Country");
		
		for(int political<politicalParties.length-1;political=>0;political--)
		{
			String ref3=politicalParties[political];
			System.out.println("politicalParties:"+ref3);
		}
		
		
		System.out.println("end politicalParties in Country");
	}
	
}