class BatStarter{

public static void main(String[] arg)
{
	System.out.println("Starting of Wood");
	Bat bat=new Bat();
	bat.hitting();
	bat.trim();
	Wood wood=new Bat();
	wood.trim();
	 bat=(Bat)wood;
	bat.hitting();

	
}

}