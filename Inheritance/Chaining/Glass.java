class Glass{
 double length;
 double thickness;
 GlassType type;
 String usage;
 String brand;
 Glass(double length,double thickness,String usage,String brand)
 {
  this.length=length;
  this.thickness=thickness;
  this.usage=usage;
  this.brand=brand;
  System.out.println("length is:"+this.length);
  System.out.println("thickness is:"+this.thickness);
  System.out.println("usage is:"+this.usage);
  System.out.println("brand is:"+this.brand);
  
 
 
 }
 void setType(GlassType glass)
 {
  this.type=type;
 }
void setValues(String usage,String brand)
{
	this.usage=usage;
	this.brand=brand;
	System.out.println("usage:"+this.usage);
	System.out.println("brand:"+this.brand);
}

}