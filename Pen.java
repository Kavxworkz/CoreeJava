class Pen
{
	public String penColor;
	public String brand;
	public int price;
	public Refill refill;

	public Pen()
	{
		System.out.println(this.getClass().getSimpleName()+"Pen object is created");

	}

	public void setPenColor(String penColor)
	{
		this.penColor=penColor;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setRefill(Refill refill)
	{
		this.refill=refill;
	}

	@Override
	public String toString()
	{
		return "Pen-{penColor="+this.penColor+",brand="+this.brand+",price="+this.price+",refill="+refill+"}";
	}


}