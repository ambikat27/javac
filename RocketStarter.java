class RocketStarter
{
public static void main(String[] args)
{
Rocket rocket=new Rocket(34);
System.out.println("rocket length is :"+rocket.length);

Rocket rocket5=new Rocket("cryogenic",34,4000);
System.out.println("rocket engine is :"+rocket5.engine);
System.out.println("rocket length is  :"+rocket5.length);
System.out.println("rocket speed is :"+rocket5.speed);

Rocket rocket2=new Rocket(4000,34,"cryogenic");
System.out.println("rocket speed is :"+rocket2.speed);
System.out.println("rocket length is :"+rocket2.length);
System.out.println("rocket enginename is :"+rocket2.engine);


Rocket rocket3=new Rocket("chandrayan",4000);
System.out.println("rocket name is :"+rocket3.name);
System.out.println("rocket speed is :"+rocket3.speed);

Rocket rocket4=new Rocket("chandrayan",4000);
System.out.println("rocket name is :"+rocket4.name);

}
}