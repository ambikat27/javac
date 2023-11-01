class MakupStater
{
public static void main(String[] args)
{
Makeupkit makeupkit=new Makeupkit(30);
System.out.println("makeupkit items is :"+makeupkit.items);

Makeupkit makeupkit1=new Makeupkit("lakme",30);
System.out.println("makeupkit brand is :"+makeupkit1.brand);
System.out.println("makeupkit items is :"+makeupkit1.items);

Makeupkit makeupkit2=new Makeupkit(600,"lakme");
System.out.println("makeupkit cost is :"+makeupkit2.cost);
System.out.println("makeupkit brand is :"+makeupkit2.brand);


Makeupkit makeupkit3=new Makeupkit(4.5,30);
System.out.println("makeupkit rating is :"+makeupkit3.rating);
System.out.println("makeupkit items is :"+makeupkit3.items);

}
}