class Netflix
{
	static String series[]={"Money Hiest","Maid","Elite","Sweet Home","Dark home"};
	static String movies[]={"Roohi","Thalaivii","hey jawaani hey diwani"};
	public static void main(String a[])
	{
		System.out.println("Welcome to series department");
		System.out.println(series.length);
		for(int i=0;i<series.length;i++)
		{
			System.out.println(series[i]);
		}
		System.out.println("Welcome to movies department");
		System.out.println(movies.length);
		for(int i=0;i<movies.length;i++)
		{
			System.out.println(movies[i]);
		}

		System.out.println(series[0] +" "+ movies[0]);
	}
}