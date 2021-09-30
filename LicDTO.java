public class LicDTO
{
	public LicDTO()
	{
		System.out.println("LicDTO object is created");

	}

	private int policyId;
	private String customerName;
	private String agentName;
	private int years;

	public int getPolicyId()
	{
		return policyId;
	}
	public void setPolicyId(int policyId)
	{
		this.policyId=policyId;
	}

	public String getCustomerName()
	{
		return customerName;
	} 
	public void setCustomerName(String customerName)
	{
		this.customerName=customerName;
	}

	public String getAgentName()
	{
		return agentName;
	}
	public void setAgentName(String agentName)
	{
        this.agentName=agentName;
	}

	public int getYears()
	{
		return years;
	}
	public void setYears(int years)
	{
		this.years=years;
	}
}