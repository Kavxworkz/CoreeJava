class Airport
{
	public int airportId;
	public String airportName;
	public String location;
	public Terminal terminals;   //public classType ie if you have reference of classtype then only it has a has-A relationship,this is user-defined

	public Airport()
	{
		System.out.println(this.getClass().getSimpleName()+"Airport object is created");
	}

	public void setAirportId(int airportId)
	{
		this.airportId=airportId;
	}
	public void setAirportName(String airportName)
	{
		this.airportName=airportName;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	public void setTerminals(Terminal terminals)
	{
		this.terminals=terminals;
	}

    @Override
    public String toString()
    {
    	return "Airport-{airportId="+airportId+",airportName="+this.airportName+",location="+this.location+",terminals="+this.terminals+"}";
    }

}