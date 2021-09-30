class GoldDTOUtil
{
	public static void main(String a[])
	{
		GoldDTO gold=new GoldDTO();
		gold.setGoldId(123);
		gold.setShopName("RR Gold palace");
		gold.setLocation("Malleshwarm");
		gold.setType("Earings");
		System.out.println(gold.getGoldId() +" "+ gold.getShopName() +" "+ gold.getType());
	}
}