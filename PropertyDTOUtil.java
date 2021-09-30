class PropertyDTOUtil
{
	public static void main(String a[])
	{
		PropertyDTO property=new PropertyDTO();
		property.setPropertyId(123);
		property.setOwnerName("Kavya");
		property.setPropertySize(1200);
		property.setType("A");
		property.setLocation("JP-Nagar");

		System.out.println(property.getPropertyId() +" "+ property.getOwnerName() +" "+ property.getPropertySize() +" "+ property.getType() +" "+ property.getLocation());
	}
}