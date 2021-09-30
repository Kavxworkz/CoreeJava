class SuperMarket
		{
		  static String biscuits[]={"Hide & Seek","Moms Magic","Good Day","Marie Gold","Parle G","Oreo","Dark Fantasy","Marie Lite"};
		  static String vegetables[]={"carrot","onion","potato","tomato"};
		  static String dairyProducts[]={"Milk","Curd","Cheese","Paneer","Butter","Ghee","ButterMilk"};
		  static String softDrinks[]={"MoguMogu","BadamMilk","Fanta","Pepsi","Maaza","7up"};
		  static int priceOfBiscuits[]={30,20,10,10,5,20,30,20};
		  public static void main(String a[])
		  {
		   System.out.println("Welcome to biscuits department");
		   System.out.println(biscuits.length);
		   //System.out.println(biscuits[0] +" "+ biscuits[1] +" "+ biscuits[2] +" "+ biscuits[3] +" "+biscuits[4]);
		   //System.out.println(vegetables[0] +" "+ vegetables[1] +" "+ vegetables[2]);
		   
		   for(int i=0;i<biscuits.length;i++)   //biscuits.length is property of array
		   {
		     System.out.println(biscuits[i]);
		   }
		   
		   System.out.println(vegetables.length);
		   System.out.println("Welcome to vegetable department");
		   for(int i=0;i<vegetables.length;i++)
		   {
		     System.out.println(vegetables[i]);
			 
		   }

		   System.out.println(dairyProducts.length);
		   System.out.println("Welcome to dairy department");
		   for(int i=0;i<dairyProducts.length;i++)
		   {
		    System.out.println(dairyProducts[i]);
		   }

		   System.out.println(softDrinks.length);
		   System.out.println("Welcome to soft drink department");
		   for(int i=0;i<softDrinks.length;i++)
		   {
		    System.out.println(softDrinks[i]);
		   }

		   System.out.println(priceOfBiscuits.length);
		   System.out.println("Welcome to price department");
		   for(int i=0;i<priceOfBiscuits.length;i++)
		   {
		    System.out.println(priceOfBiscuits[i]);
		   }
		  }
		}