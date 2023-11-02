class KeyChain{
	
	String brand;
	String type;
	String design;
	double cost;
	String size;
	
	KeyChain(){
		this("lucent","copper","resin",3000,"M");
	
		
		
		System.out.println("KeyChain is Created........");
	}
	KeyChain(String brand){
	
		this.brand=brand;
		System.out.println("KeyChain brand:"+brand);
		
	}
	KeyChain(String brand,String type){
	
		this.brand=brand;
		this.type=type;
		System.out.println("KeyChain brand:"+brand);
		System.out.println("KeyChain type:"+type);
	}
	KeyChain(String brand,String type,String design){
	
	
		this.brand=brand;
		this.type=type;
		this.design=design;
		System.out.println("KeyChain brand:"+brand);
		System.out.println("KeyChain type:"+type);
		System.out.println("KeyChain design:"+design);
	}
	KeyChain(String brand,String type,String design,double cost){
	
	
		this.brand=brand;
		this.type=type;
		this.design=design;
		this.cost=cost;
		System.out.println("KeyChain brand:"+brand);
		System.out.println("KeyChain type:"+type);
		System.out.println("KeyChain design:"+design);
		System.out.println("KeyChain cost:"+cost);
		
	}
	KeyChain(String brand,String type,String design,double cost,String size){
	
		
		this.brand=brand;
		this.type=type;
		this.design=design;
		this.cost=cost;
		this.size=size;
		System.out.println("KeyChain brand:"+brand);
		System.out.println("KeyChain type:"+type);
		System.out.println("KeyChain design:"+design);
		System.out.println("KeyChain cost:"+cost);
		System.out.println("KeyChain size:"+size);
	
    }
}