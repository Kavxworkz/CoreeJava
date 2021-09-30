public class DrivingLicenseDTO
{
	public DrivingLicenseDTO()
	{
		System.out.println("DrivingLicenseDTO object is created");
	}

	private String name;
	private String address;
	private long dateOfBirth;
	private long expiryOn;
    
    public String getName()
    {
    	return name;
    }
    public void setName(String name)
    {
    	this.name=name;
    }

    public String getAddress()
    {
    	return address;
    }
    public void setAddress(String address)
    {
    	this.address=address;
    }

    public long getDateOfBirth()
    {
    	return dateOfBirth;
    }
    public void setDateOfBirth(long dateOfBirth)
    {
    	this.dateOfBirth=dateOfBirth;
    }

    public long getExpiryOn()
    {
    	return expiryOn;
    }
    public void setExpiryOn(long expiryOn)
    {
    	this.expiryOn=expiryOn;
    }
}