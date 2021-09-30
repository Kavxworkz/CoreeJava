class LicDTOUtil
{
	public static void main(String a[])
	{
		LicDTO lic=new LicDTO();
		lic.setPolicyId(1234);
		lic.setCustomerName("Kavya");
		lic.setAgentName("Kushi");
		lic.setYears(10);

		System.out.println(lic.getPolicyId() +" "+ lic.getCustomerName() +" "+ lic.getAgentName() +" "+ lic.getYears());
	}
}