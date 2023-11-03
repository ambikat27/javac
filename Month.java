 class Month{
	  String name;
      double noOfDays;
      double noOfWeekends;
      double noOfHolidays;

  Month(String name,double noOfDays,double noOfWeekends,double noOfHolidays)
 {
	 this.name=name;
	 this.noOfDays=noOfDays;
	 this.noOfWeekends=noOfWeekends;
      this.noOfHolidays=noOfHolidays;
	 System.out.println("noOfHolidays is:"+noOfHolidays);
 }
 void displayInfo()
 {
	 System.out.println("Starting displayinfo method");
	System.out.println(this.name);
	System.out.println(this.noOfDays);
	System.out.println(this.noOfWeekends);
	System.out.println(this.noOfHolidays);
	System.out.println("sEnding displayinfo method");
 }
 }