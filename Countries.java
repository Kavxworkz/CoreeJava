class Countries
{
	static String countryNames[]={"India","America","New Zealand","South Africa","Afganisthan","Sri Lanka","Londan","Paris"};

	public static void main(String a[])
	{
		System.out.println(countryNames.length);

		for(int i=0;i<countryNames.length;i++)
		{
			System.out.println(countryNames[i]);
		}
        
        
		System.out.println(countryNames[1]);
	}
}