class PrinterStarter{
	
	public static void main(String[] args){
		
		System.out.println("Starting Printer in PrinterStarter");
		
		Printer Printer=new Printer();
		System.out.println("Printer brand is: "+Printer.brand);
		System.out.println("Printer type is: "+Printer.type);
		System.out.println("Printer noOfPages is: "+Printer.noOfPages);
		System.out.println("Printer cost is: "+Printer.cost);
		System.out.println("Printer warranty is: "+Printer.warranty);
		
		Printer Printer1=new Printer("Cannon");
		System.out.println("Printer1 brand is: "+Printer1.brand);
		System.out.println("Printer1 type is: "+Printer1.type);
		System.out.println("Printer1 noOfPages is: "+Printer1.noOfPages);
		System.out.println("Printer1 cost is: "+Printer1.cost);
		System.out.println("Printer1 warranty is: "+Printer1.warranty);
		
		Printer Printer2=new Printer("Cannon","inkjet");
		System.out.println("Printer2 brand is: "+Printer2.brand);
		System.out.println("Printer2 type is: "+Printer2.type);
		System.out.println("Printer2 noOfPages is: "+Printer2.noOfPages);
		System.out.println("Printer2 cost is: "+Printer2.cost);
		System.out.println("Printer2 warranty is: "+Printer2.warranty);
		
		Printer Printer3=new Printer("Cannon","inkjet",100);
		System.out.println("Printer3 brand is: "+Printer3.brand);
		System.out.println("Printer3 type is: "+Printer3.type);
		System.out.println("Printer3 noOfPages is: "+Printer3.noOfPages);
		System.out.println("Printer3 cost is: "+Printer3.cost);
		System.out.println("Printer3 warranty is: "+Printer3.warranty);
		
		Printer Printer4=new Printer("Cannon","inkjet",100,1500);
		System.out.println("Printer4 brand is: "+Printer4.brand);
		System.out.println("Printer4 type is: "+Printer4.type);
		System.out.println("Printer4 noOfPages is: "+Printer4.noOfPages);
		System.out.println("Printer4 cost is: "+Printer4.cost);
		System.out.println("Printer4 warranty is: "+Printer4.warranty);
		
				
		Printer Printer5=new Printer("Cannon","inkjet",100,1500.2);
		System.out.println("Printer5 brand is: "+Printer5.brand);
		System.out.println("Printer5 type is: "+Printer5.type);
		System.out.println("Printer5 noOfPages is: "+Printer5.noOfPages);
		System.out.println("Printer5 cost is: "+Printer5.cost);
		System.out.println("Printer5 warranty is: "+Printer5.warranty);
		
		System.out.println("Ending Wallet in PrinterStarter");
	}
}