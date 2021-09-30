public class PropertyDTO
{
	public PropertyDTO()
	{
		System.out.println("Property object is created");
	}

	private int propertyId;
	private String ownerName;
	private int propertySize;
	private String type;
	private String location;

	public int getPropertyId()
	{
		return propertyId;
	}
	public void setPropertyId(int propertyId)
    {
		this.propertyId=propertyId;
    }

	public String getOwnerName()
	{
		return ownerName;
	}
	public void setOwnerName(String ownerName)
	{
		this.ownerName=ownerName;
	}

	public int getPropertySize()
	{
		return propertySize;
	}
	public void setPropertySize(int propertySize)
	{
		this.propertySize=propertySize;
	}

	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type=type;
	}

	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}


}