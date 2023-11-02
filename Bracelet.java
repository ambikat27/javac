class Bracelet {
		
		String metal;
        String type;
		double weight;
        double cost;
        double length;
		

        Bracelet() {
            
			this("Gold","Twisted",7,25000,25);
			System.out.println("Bracelet is Created");
        }
        Bracelet(String metal) {

            this.metal = metal;
            System.out.println("Bracelet metal:" + metal);

        }
        Bracelet(String metal, String type) {

            this.metal = metal;
            this.type = type;
            System.out.println("Bracelet metal" + metal);
            System.out.println("Bracelet type:" + type);
        }
        Bracelet(String metal, String type, double weight){


            this.metal = metal;
            this.type = type;
            this.weight = weight;
            System.out.println("Bracelet metal" + metal);
			System.out.println("Bracelet type" + type);
            System.out.println("Bracelet weight:" + weight);
        }
        Bracelet(String metal, String type, double weight,double cost){

            this.metal = metal;
            this.type = type;
            this.weight = weight;
            this.cost = cost;
            System.out.println("Bracelet metal" + metal);
			System.out.println("Bracelet type" + type);
            System.out.println("Bracelet weight:" + weight);
            System.out.println("Bracelet cost:" + cost);

        }
        Bracelet(String metal, String type, double weight,double cost, double length){

            this.metal = metal;
            this.type = type;
            this.weight = weight;
            this.cost = cost;
            this.length = length;
			
			System.out.println("Bracelet metal" + metal);
			System.out.println("Bracelet type" + type);
            System.out.println("Bracelet weight:" + weight);
            System.out.println("Bracelet cost:" + cost);
			System.out.println("Bracelet length:" + length);

        }
}