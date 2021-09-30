class KfcDTOUtil
{
	public static void main(String a[])
	{
		KfcDTO kfc=new KfcDTO();
		kfc.setType("non-veg");
		kfc.setLocation("Banshankari");

		System.out.println(kfc.getType() +" "+ kfc.getLocation());
	}
}