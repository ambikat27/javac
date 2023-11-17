class Brand{
 String name="dell";
 String origin="Us";
 String ceoname="Michael dell";
 City[] cities;
Brand()
{
	System.out.println("creating brand no argument constructor");
}
  void setCities(City[] cities)
  {
	  this.cities=cities;
  }
 void show()
 {
	 System.out.println("starting in brand");
	 System.out.println("name is:"+this.name);
	 System.out.println("origin is:"+this.origin);
	 System.out.println("ceoname is:"+this.ceoname);
	 System.out.println("cities is:"+this.cities);
	 if(cities!=null)
	 {
	 for(int seq=0;seq<this.cities.length;seq++)
	 {
		 City ref=this.cities[seq];
		 System.out.println("cities are:"+this.cities[seq]+"at sequence"+ref);
		 ref.show();
	 }
	 }
	 
	 System.out.println("Ending in brand");
 }
}