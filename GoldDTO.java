public class GoldDTO 
{
	public GoldDTO()
	{
      System.out.println("GoldDTO object is created");

	}

	private int goldId;
	private String shopName;
	private String location;
	private String type;

	public int getGoldId()
	{
		return goldId;
	}
	public void setGoldId(int goldId)
	{
       this.goldId=goldId;
	}

	public String getShopName()
	{
		return shopName;
	}
	public void setShopName(String shopName)
	{
		this.shopName=shopName;
	}

	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}

	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type=type;
	}


}