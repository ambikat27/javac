class BraceletStarter{

    public static void main(String[] args){

        System.out.println("Staring in Bracelet");

        Bracelet Bracelet=new Bracelet();
        System.out.println("Bracelet metal is: "+Bracelet.metal);
        System.out.println("Bracelet type is: "+Bracelet.type);
        System.out.println("Bracelet weight is: "+Bracelet.weight);
        System.out.println("Bracelet cost is: "+Bracelet.cost);
        System.out.println("Bracelet length is: "+Bracelet.length);

        Bracelet Bracelet1=new Bracelet("Gold");
        System.out.println("Bracelet metal is: "+Bracelet1.metal);
        System.out.println("Bracelet type is: "+Bracelet1.type);
        System.out.println("Bracelet weight is: "+Bracelet1.weight);
        System.out.println("Bracelet cost is: "+Bracelet1.cost);
        System.out.println("Bracelet length is: "+Bracelet1.length);

        Bracelet Bracelet2=new Bracelet("Gold","Twisted");
        System.out.println("Bracelet metal is: "+Bracelet2.metal);
        System.out.println("Bracelet type is: "+Bracelet2.type);
        System.out.println("Bracelet weight is: "+Bracelet2.weight);
        System.out.println("Bracelet cost is: "+Bracelet2.cost);
        System.out.println("Bracelet length is: "+Bracelet2.length);

        Bracelet Bracelet3=new Bracelet("Gold","Twisted",7);
        System.out.println("Bracelet metal is: "+Bracelet3.metal);
        System.out.println("Bracelet type is: "+Bracelet3.type);
        System.out.println("Bracelet weight is: "+Bracelet3.weight);
        System.out.println("Bracelet cost is: "+Bracelet3.cost);
        System.out.println("Bracelet length is: "+Bracelet3.length);

        Bracelet Bracelet4=new Bracelet("Gold","Twisted",7,25000);
        System.out.println("Bracelet metal is: "+Bracelet4.metal);
        System.out.println("Bracelet type is: "+Bracelet4.type);
        System.out.println("Bracelet weight is: "+Bracelet4.weight);
        System.out.println("Bracelet cost is: "+Bracelet4.cost);
        System.out.println("Bracelet length is: "+Bracelet4.length);


        Bracelet Bracelet5=new Bracelet("Gold","Twisted",7,25000,25);
        System.out.println("Bracelet metal is: "+Bracelet5.metal);
        System.out.println("Bracelet type is: "+Bracelet5.type);
        System.out.println("Bracelet weight is: "+Bracelet5.weight);
        System.out.println("Bracelet cost is: "+Bracelet5.cost);
        System.out.println("Bracelet length is: "+Bracelet5.length);

        System.out.println("Ending Bracelet");
    }
}