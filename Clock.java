class Clock
{
int no;
double cost;
String brand;
String color;

Clock()
{

}

Clock(int no)
{
super();
this.no=no;
System.out.println("clock no is :"+no);
}

Clock(double cost,int no)
{
super();
this.cost=cost;
this.no=no;
}
Clock(String brand,int no)
{
super();
this.brand=brand;
this.no=no;
}
Clock(String color,double cost,int no)
{
super();
this.color=color;
this.cost=cost;
this.no=no;
}
}