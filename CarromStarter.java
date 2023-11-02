class CarromStarter{

    public static void main(String[] args){

        System.out.println("Staring in Carrom");

        Carrom Carrom=new Carrom();
        System.out.println("Carrom color is: "+Carrom.color);
        System.out.println("Carrom type is: "+Carrom.type);
        System.out.println("Carrom size is: "+Carrom.size);
        System.out.println("Carrom cost is: "+Carrom.cost);
        System.out.println("Carrom shape is: "+Carrom.shape);

        Carrom Carrom1=new Carrom("Cream");
        System.out.println("Carrom color is: "+Carrom1.color);
        System.out.println("Carrom type is: "+Carrom1.type);
        System.out.println("Carrom size is: "+Carrom1.size);
        System.out.println("Carrom cost is: "+Carrom1.cost);
        System.out.println("Carrom shape is: "+Carrom1.shape);

        Carrom Carrom2=new Carrom("Cream","Wood");
        System.out.println("Carrom color is: "+Carrom2.color);
        System.out.println("Carrom type is: "+Carrom2.type);
        System.out.println("Carrom size is: "+Carrom2.size);
        System.out.println("Carrom cost is: "+Carrom2.cost);
        System.out.println("Carrom shape is: "+Carrom2.shape);

        Carrom Carrom3=new Carrom("Cream","Wood",19);
        System.out.println("Carrom color is: "+Carrom3.color);
        System.out.println("Carrom type is: "+Carrom3.type);
        System.out.println("Carrom size is: "+Carrom3.size);
        System.out.println("Carrom cost is: "+Carrom3.cost);
        System.out.println("Carrom shape is: "+Carrom3.shape);

        Carrom Carrom4=new Carrom("Cream","Wood",19,600);
        System.out.println("Carrom color is: "+Carrom4.color);
        System.out.println("Carrom type is: "+Carrom4.type);
        System.out.println("Carrom size is: "+Carrom4.size);
        System.out.println("Carrom cost is: "+Carrom4.cost);
        System.out.println("Carrom shape is: "+Carrom4.shape);


        Carrom Carrom5=new Carrom("Cream","Wood",19,600,"square");
        System.out.println("Carrom color is: "+Carrom5.color);
        System.out.println("Carrom type is: "+Carrom5.type);
        System.out.println("Carrom size is: "+Carrom5.size);
        System.out.println("Carrom cost is: "+Carrom5.cost);
        System.out.println("Carrom shape is: "+Carrom5.shape);

        System.out.println("Ending Caroom");
    }
}