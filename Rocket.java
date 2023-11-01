class Rocket
{
double length;
String engine;
long speed;
String name;

Rocket()
{
super();
}

Rocket(double length)
{
super();
this.length=length;
}

Rocket(String engine,double length,long speed)
{
super();
this.engine=engine;
this.length=length;
this.speed=speed;
}

Rocket(long speed,double length,String engine)
{
super();
this.speed=speed;
this.length=length;
this.engine=engine;

}

Rocket(String name,long speed)
{
super();
this.name=name;
this.speed=speed;
}

Rocket(String name)
{
super();
this.name=name;
}
}