class Technology{
 String components;
 String parts;
 String division;
 String concepts;
 Technology(String components,String parts,String division,String concepts)
 {
 this.components=components;
 this.parts=parts;
 this.division=division;
 this.concepts=concepts;
	 
 }
  void displayInfo()
 {
	 
	System.out.println("Starting displayInfo");
	System.out.println(this.components);
	System.out.println(this.parts);
	System.out.println(this.division);
	System.out.println(this.concepts);
	System.out.println("Ending displayInfo");
 }



}