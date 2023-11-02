class KeyChainStarter{
	
	public static void main(String[] args){
		
		System.out.println("Starting KeyChain in KeyChainStarter");
		
		KeyChain KeyChain=new KeyChain();
		System.out.println("KeyChain brand is: "+KeyChain.brand);
		System.out.println("KeyChain type is: "+KeyChain.type);
		System.out.println("KeyChain design is: "+KeyChain.design);
		System.out.println("KeyChain cost is: "+KeyChain.cost);
		System.out.println("KeyChain size is: "+KeyChain.size);
		
		KeyChain KeyChain1=new KeyChain("lucent");
		System.out.println("KeyChain1 brand is: "+KeyChain1.brand);
		System.out.println("KeyChain1 type is: "+KeyChain1.type);
		System.out.println("KeyChain1 design is: "+KeyChain1.design);
		System.out.println("KeyChain1 cost is: "+KeyChain1.cost);
		System.out.println("KeyChain1 size is: "+KeyChain1.size);
		
		KeyChain KeyChain2=new KeyChain("lucent","copper");
		System.out.println("KeyChain2 brand is: "+KeyChain2.brand);
		System.out.println("KeyChain2 type is: "+KeyChain2.type);
		System.out.println("KeyChain2 design is: "+KeyChain2.design);
		System.out.println("KeyChain2 cost is: "+KeyChain2.cost);
		System.out.println("KeyChain2 size is: "+KeyChain2.size);
		
		KeyChain KeyChain3=new KeyChain("lucent","copper","resin");
		System.out.println("KeyChain3 brand is: "+KeyChain3.brand);
		System.out.println("KeyChain3 type is: "+KeyChain3.type);
		System.out.println("KeyChain3 design is: "+KeyChain3.design);
		System.out.println("KeyChain3 cost is: "+KeyChain3.cost);
		System.out.println("KeyChain3 size is: "+KeyChain3.size);
		
		KeyChain KeyChain4=new KeyChain("lucent","copper","resin",3000);
		System.out.println("KeyChain4 brand is: "+KeyChain4.brand);
		System.out.println("KeyChain4 type is: "+KeyChain4.type);
		System.out.println("KeyChain4 design is: "+KeyChain4.design);
		System.out.println("KeyChain4 cost is: "+KeyChain4.cost);
		System.out.println("KeyChain4 size is: "+KeyChain4.size);
		
				
		KeyChain KeyChain5=new KeyChain("lucent","copper","resin",3000,"M");
		System.out.println("KeyChain5 brand is: "+KeyChain5.brand);
		System.out.println("KeyChain5 type is: "+KeyChain5.type);
		System.out.println("KeyChain5 design is: "+KeyChain5.design);
		System.out.println("KeyChain5 cost is: "+KeyChain5.cost);
		System.out.println("KeyChain5 size is: "+KeyChain5.size);
		
		System.out.println("Ending KeyChain in KeyChainStarter");
	}
}