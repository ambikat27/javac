class Course{

 String name;
 double duration;
 String stream;
 double noOfSubj;
 double fee;
 String instituteName;
  
  Course(String name ,double duration ,String Stream,double noOfSubj,double fee,String instituteName)
  {
   this.name=name;
   this.duration=duration;
   this.stream=stream;
   this.noOfSubj=noOfSubj;
   this.fee=fee;
   this.instituteName=instituteName;
  }
 void displayInfo()
 {
	 
	System.out.println("Starting displayInfo");
	 System.out.println(this.name);
	 System.out.println(this.duration);
	 System.out.println(this.stream);
	 System.out.println(this.noOfSubj);
	 System.out.println(this.fee);
	 System.out.println(this.instituteName);
	 System.out.println("Ending displayInfo");
 }

}