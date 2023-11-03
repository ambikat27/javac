class Placement{
 String poname;
 double noOfCompanies;
 double noOfStud;
 double highestPackage;
 double avgPackage;
 Placement(String poname,double noOfCompanies,double noOfStud,double highestPackage,double avgPackage)
 {
	  this.poname=poname;
	  this.noOfCompanies=noOfCompanies;
	  this.noOfStud=noOfStud;
	  this.highestPackage=highestPackage;
	  this.avgPackage=avgPackage;
 }
 void displayInfo()
 {
	 
	System.out.println("Starting displayInfo");
	System.out.println(this.poname);
	System.out.println(this.noOfCompanies);
	System.out.println(this.noOfStud);
	System.out.println(this.highestPackage);
	System.out.println(this.avgPackage);
	System.out.println("Ending displayInfo");
 }
  }