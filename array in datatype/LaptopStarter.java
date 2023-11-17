class LaptopStarter{
 public static void main(String[] args)
 {
  System.out.println("Starting main method");
  City cities=new City();
  cities.name="davangere";
  cities.statename="karnataka";
  
  City cities1=new City();
  cities1.name="kochi";
  cities1.statename="kerala";
  
  City cities2=new City();
  cities2.name="whyzag";
  cities.statename="hydrabad";
  
  City cities3=new City();
  cities3.name="salem";
  cities3.statename="Tamilnadu";
  
  City cities4=new City();
  cities4.name="Raybag";
  cities.statename="Maharastra";
  
  City cities5=new City();
  cities5.name="panaji";
  cities.statename="goa";
  
  City[] citieArray={cities,cities1,cities2,cities3,cities4,cities5};
  Brand brand=new Brand();
  brand.setCities(citieArray);
  
  Hardware hardware=new Hardware();
  hardware.setBrand(brand);
  hardware.setName("keyboard");
  hardware.setType("input");
  
  Hardware hardware1=new Hardware();
  hardware1.setBrand(brand);
  hardware1.setName("Monitor");
  hardware1.setType("output");
  
  Hardware hardware2=new Hardware();
  hardware2.setBrand(brand);
  hardware2.setName("screw");
  hardware2.setType("material");
  
  Hardware hardware3=new Hardware();
  hardware3.setBrand(brand);
  hardware3.setName("mouse");
  hardware3.setType("input");
  
  Hardware hardware4=new Hardware();
  hardware4.setBrand(brand);
  hardware4.setName("graphic card");
  hardware4.setType("graphics");
  
  Hardware hardware5=new Hardware();
  hardware5.setBrand(brand);
  hardware5.setName("data storage");
  hardware5.setType("storage");
  
  Hardware hardware6=new Hardware();
  hardware6.setBrand(brand);
  hardware6.setName("RAM");
  hardware6.setType("store");
  
  Hardware hardware7=new Hardware();
  hardware7.setBrand(brand);
  hardware7.setName("monitor");
  hardware7.setType("display");
  
  Hardware hardware8=new Hardware();
  hardware8.setBrand(brand);
  hardware8.setName("inkjet");
  hardware8.setType("input");
  
  Hardware hardware9=new Hardware();
  hardware9.setBrand(brand);
  hardware9.setName("camera");
  hardware9.setType("pitcure");
  
  Hardware[] hardwareArray={hardware,hardware1,hardware2,hardware3,hardware4,hardware5,hardware6,hardware7,hardware8,hardware9};
  
  Address address=new Address();
  address.setCity(cities);
  address.show();
  
  
  Owner owner=new Owner();
  owner.setPermanentAddress(address);
  owner.setTemporaryAddress(address);
  
  
  Laptop laptop=new Laptop();
  
  laptop.setHardware(hardwareArray);
  laptop.setBrand(brand);
  laptop.setOwner(owner);
  laptop.show();
  
  
  
  
  System.out.println("Ending main method");
 }



}