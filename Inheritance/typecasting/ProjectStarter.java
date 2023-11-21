class ProjectStarter{

public static void main(String... args)
{
System.out.println("Starting of ProjectStarter .....");
Person person=new Person();
Developer developer=new Developer();
Tester tester=new Tester();
BusinessAnalyst businessanalyst=new BusinessAnalyst();
ProductOwner productowner= new ProductOwner();
DataBaseDeveloper databasedeveloper=new DataBaseDeveloper();
Devops devops =new Devops();
Project project=new Project();
project.validate(person);
project.validate(developer);

project.validate(tester);

project.validate(businessanalyst);
project.validate(productowner);

project.validate(databasedeveloper);
project.validate(devops);

}
}