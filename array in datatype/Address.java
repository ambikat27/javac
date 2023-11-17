class Address{
	
  String street="jayanagar";
  long pincode=560069;
  City city;
  Address()
  {
	  System.out.println("no argument constructor");
  }
   void setCity(City city)
  {
	  this.city=city;
	  
  }
  
  void show()
  {
	  System.out.println("Starting of Address");
	  System.out.println("street is:"+this.street);
	  System.out.println("pincode is:"+this.pincode);
	  System.out.println("city is:"+this.city);
	  if(this.city!=null)
	  {
		  this.city.show();
	  }
	  System.out.println("Ending of Address");
	  
  }
  
}