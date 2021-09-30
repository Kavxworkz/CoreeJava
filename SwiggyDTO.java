public class SwiggyDTO
{
	public SwiggyDTO()
	{
		System.out.println("SwiggyDTO object is created");
	}

	private String type;
	private String restaurantName;
	private String location;
	private String food;
	private int price;

	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type=type;
	}

	public String getRestaurantName()
	{
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName)
	{
		this.restaurantName=restaurantName;
	}

	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}

	public String getFood()
	{
		return food;
	}
	public void setFood(String food)
	{
		this.food=food;
	}

	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}

}