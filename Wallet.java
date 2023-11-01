class Wallet
{
String color;
String brand;
double length;
int noofrows;


Wallet()
{
super();
}

Wallet(String color)
{
super();
this.color=color;
}

Wallet(String brand,double length)
{
super();
this.brand=brand;
this.length=length;
}


Wallet(int noofrows,String brand,double length)
{
super();
this.noofrows=noofrows;
this.brand=brand;
this.length=length;
}
Wallet(int noofrows)
{
super();
this.noofrows=noofrows;
}
}