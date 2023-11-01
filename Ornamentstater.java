class Ornamentstater
{
public static void main(String[] args)
{
Ornament ornament=new Ornament("gold");
System.out.println("ornament name is :"+ornament.name);

Ornament ornament1=new Ornament("lotus",'s');
System.out.println("ornament shape is :"+ornament1.shape);
System.out.println("ornament size is :"+ornament1.size);

Ornament ornament2=new Ornament('s',"gold");
System.out.println("ornament size is :"+ornament2.size);
System.out.println("ornament name is :"+ornament2.name);

Ornament ornament3=new Ornament('s');
System.out.println("ornament size is :"+ornament3.size);


}
}