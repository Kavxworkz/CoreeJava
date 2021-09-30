class LibraryDTOUtil
{
	public static void main(String a[])
	{
		LibraryDTO library=new LibraryDTO();
		library.setLibraryId(12);
		library.setLibraryName("CK");
		library.setLocation("Devaya Park");
		System.out.println(library.getLibraryId() +" "+ library.getLibraryName() +" "+ library.getLocation());
	}
}