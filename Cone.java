class Cone
{
	public int price;
	public String coneColor;
	public String shape;
	public IceCream iceCream;

	public Cone()
	{
		System.out.println(this.getClass().getSimpleName()+"Cone object is created ");
	}

	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setConeColor(String coneColor)
	{
		this.coneColor=coneColor;
	}
	public void setShape(String shape)
	{
		this.shape=shape;
	}
	public void setIceCream(IceCream iceCream)
	{
		this.iceCream=iceCream;
	}

	@Override
	public String toString()
	{
		return "Cone-{price="+this.price+",coneColor="+this.coneColor+",shape="+this.shape+",iceCream="+this.iceCream+"}";
	}
}