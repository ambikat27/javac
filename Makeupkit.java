class Makeupkit
{
int items;
String brand;
double cost;
double rating;

Makeupkit()
{
super();
}

Makeupkit(int items)
{
super();
this.items=items;
}

Makeupkit(String brand,int items)
{
super();
this.brand=brand;
this.items=items;
}

Makeupkit(double cost,String brand)
{
super();
this.cost=cost;
this.brand=brand;
}

Makeupkit(double rating,int items)
{
super();
this.rating=rating;
this.items=items;
}
}