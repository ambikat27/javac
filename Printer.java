class Printer{
	
	String brand;
	String type;
	double noOfPages;
	double cost;
	String warranty;
	
	Printer(){
		this("cannon","inkjet",100,3000,"2");
	
	System.out.println("Printer is Created........");
	}
	Printer(String brand){
	
		this.brand=brand;
		System.out.println("Printer brand:"+brand);
		
	}
	Printer(String brand,String type){
	
		this(brand);
		this.type=type;
		System.out.println("Printer brand:"+brand);
		System.out.println("Printer type:"+type);
	}
	Printer(String brand,String type,double noOfPages){
	
	
		this(brand,type);
		this.noOfPages=noOfPages;
		System.out.println("Printer brand:"+brand);
		System.out.println("Printer type:"+type);
		System.out.println("Printer noOfPages:"+noOfPages);
	}
	Printer(String brand,String type,double noOfPages,double cost){
	
	
		this(brand,type,noOfPages);
		this.noOfPages=noOfPages;
		this.cost=cost;
		System.out.println("Printer brand:"+brand);
		System.out.println("Printer type:"+type);
		System.out.println("Printer noOfPages:"+noOfPages);
		System.out.println("Printer cost:"+cost);
		
	}
	Printer(String brand,String type,double noOfPages,double cost,String warranty){
	
		
		this(brand,type,noOfPages,cost);
		this.cost=cost;
		this.warranty=warranty;
		System.out.println("Printer brand:"+brand);
		System.out.println("Printer type:"+type);
		System.out.println("Printer noOfPages:"+noOfPages);
		System.out.println("Printer cost:"+cost);
		System.out.println("Printer warranty:"+warranty);
	
    }
}