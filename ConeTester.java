class ConeTester
{
	public static void main(String a[])
	{
		Cone cone=new Cone();
		cone.setPrice(30);
		cone.setConeColor("Cream");
		cone.setShape("Rectangle");

		IceCream iceCream=new IceCream();
		iceCream.flavour="Chocolate";

		cone.setIceCream(iceCream);
		System.out.println(cone.toString());
	}
}