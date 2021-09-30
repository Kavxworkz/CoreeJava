class ProjectDTOUtil
{
    public static void main(String a[])
    {
    	ProjectDTO project=new ProjectDTO();
    	project.setProjectId(12);
    	project.setProjectName("Twitter sentimental analysis");
    	project.setNoOfMembers(4);
    	project.setIsProjectComplete("Yes");

    	System.out.println(project.getProjectId() +" "+ project.getProjectName() +" "+ project.getNoOfMembers() +" "+ project.getIsProjectComplete());
    }
}