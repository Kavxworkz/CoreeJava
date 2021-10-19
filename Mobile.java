class Mobile
{
	public String brand;
	public String color;
	public long price;
	public Sim sim;

	public Mobile()
	{
		System.out.println(this.getClass().getSimpleName() +"object is created");
	}

	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setPrice(long price)
	{
		this.price=price;
	}
	public void setSim(Sim sim)
	{
		this.sim=sim;
	}

	@Override
	public String toString()
	{
		return "Mobile-{brand="+this.brand+",color="+this.brand+",price="+this.price+",sim="+this.sim+"}";

	}
}