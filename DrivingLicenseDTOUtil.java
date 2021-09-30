class DrivingLicenseDTOUtil
{
	public static void main(String a[])
	{
		DrivingLicenseDTO driving=new DrivingLicenseDTO();
		driving.setName("Kavya");
		driving.setAddress("11/1, 7th cross 7th main Malleshwarm Bangalore");
		driving.setDateOfBirth(1998);
		driving.setExpiryOn(2035);

		System.out.println(driving.getName() +" "+ driving.getAddress() +" "+ driving.getDateOfBirth() +" "+ driving.getExpiryOn());

	}
}