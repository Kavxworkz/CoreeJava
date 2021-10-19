class Laptop
{
	public int laptopId;
	public String brand;
	public long price;
	public HardDisk hardDisks;  //a super-class is having relationship with sub-class

	public Laptop()
	{
		System.out.println(this.getClass().getSimpleName()+"Laptop object is created");
	}

	public void setLaptopId(int laptopId)
	{
		this.laptopId=laptopId;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public void setPrice(int price)
	{
		this.price=price;

	}
	public void setHardDisks(HardDisk hardDisks)
	{
		this.hardDisks=hardDisks;
	}

	@Override
	public String toString()
	{
		return "Laptop-{laptopId="+this.laptopId+",brand="+this.brand+",price="+this.price+",hardDisks="+this.hardDisks+"}";
	}
}