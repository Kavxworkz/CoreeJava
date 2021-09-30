class SwiggyDTOUtil
{
	public static void main(String a[])
	{
		SwiggyDTO swiggy=new SwiggyDTO();
		swiggy.setType("veg");
		swiggy.setRestaurantName("ABC");
		swiggy.setLocation("Indranagar");
		swiggy.setFood("Masala Dosa");
		swiggy.setPrice(100);
		
		System.out.println(swiggy.getType() +" "+ swiggy.getRestaurantName() +" "+ swiggy.getLocation() +" "+ swiggy.getFood() +" "+ swiggy.getPrice());
	}
		
		
	
}