class Tv{
 boolean display;
 Speaker speaker;
 Tv(boolean display)
 {
	  this.display=display;

 } 
 Tv(Speaker speaker)
 {
	  this.speaker=speaker;

 }  
 void showInfo()
 {
	 
	System.out.println("Starting displayInfo");
	System.out.println("display is:"+this.display);
	System.out.println("speaker is:"+this.speaker);
	System.out.println(+this.speaker.maxVolume);
	System.out.println("Ending displayInfo");
 }
  }