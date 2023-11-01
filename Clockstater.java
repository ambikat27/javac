class Clockstater
{
public static void main(String[] args)
{
Clock clock=new Clock(12);
System.out.println("clock no is :"+clock.no);

Clock clock1=new Clock(350,12);
System.out.println("clock cost is :"+clock1.cost);
System.out.println("clock no is :"+clock1.no);

Clock clock2=new Clock("lotous",12);
System.out.println("clock brand is :"+clock2.brand);
System.out.println("clock no is :"+clock2.no);

Clock clock3=new Clock("black",350,12);
System.out.println("clock color is :"+clock3.color);
System.out.println("clock cost is :"+clock3.cost);
System.out.println("clock no is :"+clock3.no);
}
}