class MachineStarter{

public static void main(String[] args)
{
  Generator generator=new Generator();
  generator.electric();
  Machine machine=new Generator();
  machine.electric();
  generator=(Generator)machine;
  genrator.electric();
  generator.loadBalance();

}
}