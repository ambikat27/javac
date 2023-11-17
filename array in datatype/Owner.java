class Owner{
String name;
Address permanentAddress;
Address temporaryAddress;
Owner()
{
	System.out.println("no argument constructor");
}
void setPermanentAddress(Address permanentAddress)
{
	this.permanentAddress=permanentAddress;
}
void setTemporaryAddress(Address temporaryAddress)
{
	this.temporaryAddress=temporaryAddress;
}

 void show()
 {
	 System.out.println("Starting in Owner");
	 System.out.println("name is:"+this.name);
	 System.out.println("permanetAddress is:"+this.permanentAddress);
	 if(permanentAddress!=null)
	 {
		 //System.out.println("permanetAddress is:"+this.permanentAddress.street);
		 //System.out.println("permanetAddress is:"+this.permanentAddress.pincode);
		 //System.out.println("permanetAddress is:"+this.permanentAddress.street);
		 //System.out.println("permanetAddress is:"+this.permanentAddress.city);
		 permanentAddress.show();
	 }
	 System.out.println("temporaryAddress"+this.temporaryAddress);
	 if(temporaryAddress!=null)
	 {
		 // System.out.println("temporaryAddress is:"+this.temporaryAddressstreet);
		 // System.out.println("temporaryAddress is:"+this.temporaryAddress.pincode);
		 // System.out.println("temporaryAddress is:"+this.temporaryAddress.street);
		 // System.out.println("temporaryAddress is:"+this.temporaryAddress.city);
		   temporaryAddress.show();
	 }
		
	 
	 System.out.println("ending in Owner");
 }

}