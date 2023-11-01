class Ornament
{
String name;
String shape;
String item;
char size;

Ornament()
{
super();
}

Ornament(String name)
{
super();
this.name=name;
}

Ornament(String shape,char size)
{
super();
this.shape=shape;
this.size=size;
}

Ornament(char size,String name)
{
super();
this.size=size;
this.name=name;
}

Ornament(char size)
{
super();
this.size=size;
}
}


