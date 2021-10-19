class LaptopTester
{
	public static void main(String a[])
	{
		Laptop laptop=new Laptop();
		laptop.setLaptopId(123);
		laptop.setBrand("Apple");
		laptop.setPrice(89000);

		HardDisk hardDisk=new HardDisk();
		hardDisk.color="Space Grey";
		hardDisk.storage="128Gb";

		laptop.setHardDisks(hardDisk);
		System.out.println(laptop.toString());
	}
}