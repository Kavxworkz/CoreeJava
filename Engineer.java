class Engineer
{
	static String university[]={"VTU","Autonomous"};
	static String branches[]={"Computer Science","Information Science","Electronic Communication","Electrical","Civil","Mechanical"};
    static long fees[]={85000,75000,80000,75000,75000,75000};

	public static void main(String a[])
	{
		System.out.println("Welcome to types of university");
		System.out.println(university.length);
		for(int i=0;i<university.length;i++)
		{
			System.out.println(university[i]);

		}

		System.out.println("Welcome to types of branches");
		System.out.println(branches.length);
		for(int i=0;i<branches.length;i++)
		{
			System.out.println(branches[i]);
		}

		System.out.println("Fees Structure");
		System.out.println(fees.length);
		for(int i=0;i<fees.length;i++)
		{
			System.out.println(fees[i]);
		}	

		System.out.println(university[0] +" "+ branches[0] +" "+ fees[0]);

	}
}