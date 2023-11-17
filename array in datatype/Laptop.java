class Laptop{
 Hardware[] hardware;
 Owner owner;
 Brand brand;
 Laptop()
 {
	 System.out.println("no arguments");
 }
 void setHardware(Hardware[] hardware)
 {
	 this.hardware=hardware;
 }
 void setOwner(Owner owner)
 {
	 
	this.owner=owner;
 }
 void setBrand(Brand brand)
 {
	 this.brand=brand;
 }
 void show()
 {
	  System.out.println("starting in Laptop");
	  System.out.println("hardware are:"+this.hardware);
	  if(hardware!=null)
	  {
	  for(int i=0;i<this.hardware.length;i++)
	  {
		  Hardware ref=this.hardware[i];
		  System.out.println("hardware are:"+this.hardware[i]+"at the seq:"+ref);
	  }
	  }
	 System.out.println("Ending in Laptop");
	 
 }
}