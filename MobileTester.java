class MobileTester
{
	public static void main(String a[])
	{
		Mobile mob=new Mobile();
		mob.setBrand("Iphone");
		mob.setColor("Black");
		mob.setPrice(59000);

		Sim sim=new Sim();
		sim.network="Airtel";
		sim.simId=1222;
        
        mob.setSim(sim);
		System.out.println(mob.toString());
	}
}