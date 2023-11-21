class Project{
Project()
{
System.out.println("no arg constructor in Project");
}
void validate(Person person)
{
	System.out.println("Staring displaying in validate");
	System.out.println("person is:"+person);
	if(person!=null)
	{
		person.sleep();
		person.eat();
		
	if(person instanceof Developer)
	{
		Developer developer=(Developer)person;
		developer.code();
	}
	if(person instanceof BusinessAnalyst)
	{
		BusinessAnalyst businessanalyst=(BusinessAnalyst)person;
		businessanalyst.checkRequirement();
	}
	if(person instanceof ProductOwner)
	{
		ProductOwner productowner=(ProductOwner)person;
		productowner.validate();
		
	}
	if(person instanceof Tester)
	{
		Tester tester=(Tester)person;
		tester.qualityCheck();
	}
	if(person instanceof DataBaseDeveloper)
	{
		DataBaseDeveloper databasedeveloper=(DataBaseDeveloper)person;
		databasedeveloper.runScript();
	}
	if(person instanceof Devops)
	{
		Devops devops=(Devops)person;
		devops.runBuild();
	}
	}
	System.out.println("ending displaying validate");
}

}