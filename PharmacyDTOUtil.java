class PharmacyDTOUtil
{
	public static void main(String a[])
	{
		PharmacyDTO pharmacy=new PharmacyDTO();
		pharmacy.setName("Apple Pharmacy");
		pharmacy.setLocation("Malleshwarm");

		System.out.println(pharmacy.getName() +" "+ pharmacy.getLocation());
	}
}