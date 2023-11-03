class Carrom {
		
		String color;
        String type;
		int size;
        double cost;
        String shape;
	Carrom() {
            
			this("Cream","Wood",19,600,"square");
			System.out.println("Carrom is Created");
        }
        Carrom(String color) {

            this.color = color;
            System.out.println("Carrom color:" + color);

        }
        Carrom(String color, String type) {

            this(color);
            this.type = type;
            System.out.println("Carrom color" + color);
            System.out.println("Carrom type:" + type);
        }
        Carrom(String color, String type, int size){


            this(color,type);
            this.size = size;
            System.out.println("Carrom color" + color);
			System.out.println("Carrom type" + type);
            System.out.println("Carrom size:" + size);
        }
        Carrom(String color, String type, int size,double cost){

             this(color,type,size);
            this.cost = cost;
            System.out.println("Carrom color" + color);
			System.out.println("Carrom type" + type);
            System.out.println("Carrom size:" + size);
            System.out.println("Carrom cost:" + cost);

        }
        Carrom(String color, String type, int size,double cost, String shape){

            this(color,type,size,cost);
            this.shape = shape;
			
			System.out.println("Carrom color" + color);
			System.out.println("Carrom type" + type);
            System.out.println("Carrom size:" + size);
            System.out.println("Carrom cost:" + cost);
			System.out.println("Carrom shape:" + shape);

        }
}