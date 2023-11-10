class Hardware{
String name;
String type;
Brand brand;
Hardware()
{
	System.out.println("no argument constructor");
	
}
void setName(String name)
{

 this.name=name;

}
void setType(String type)
{
 this.type=type;


}

void setBrand(Brand brand)
{
 this.brand=brand;


}
void show()
{
	
	System.out.println("starting in Hardware");
	System.out.println("name is:"+this.name);
	System.out.println("type is;"+this.type);
	System.out.println("brand is:"+this.brand);
	if(brand!=null)
	{
		brand.show();
	}
	System.out.println("ending in hardware");
	
}

}