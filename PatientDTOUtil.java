class PatientDTOUtil
 {
	 public static void main(String a[])
	 {
		 PatientDTO dto=new PatientDTO();
		 dto.setPatientId(1234567);   
		 dto.setPatientName("dev");   
		 dto.setAge(90);                 
		 dto.setGender("Male");         
		 dto.setAddress("Nagarbhavi Circle");  
		 dto.setBloodGroup("B+");          
				
		 System.out.println(dto.getPatientId() +" "+ dto.getPatientName() +" "+ dto.getAge() +" "+ dto.getGender() +" "+ dto.getAddress() +" " +" "+ dto.getBloodGroup());
	 }
}	      