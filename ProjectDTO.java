public class ProjectDTO
{
	public ProjectDTO()
	{
		System.out.println("Project object is created");
	}

	private int projectId;
	private String projectName;
	private int noOfMembers;
	private String isProjectComplete;

	public int getProjectId()
	{
		return projectId;
	}
	public void setProjectId(int projectId)
	{
		this.projectId=projectId;
	}

	public String getProjectName()
	{
		return projectName;
	}
	public void setProjectName(String projectName)
	{
		this.projectName=projectName;
	}

	public int getNoOfMembers()
	{
		return noOfMembers;
	}
	public void setNoOfMembers(int noOfMembers)
	{
		this.noOfMembers=noOfMembers;
	}

	public String getIsProjectComplete()
	{
		return isProjectComplete;
	}
	public void setIsProjectComplete(String isProjectComplete)
	{
		this.isProjectComplete=isProjectComplete;
	}
}