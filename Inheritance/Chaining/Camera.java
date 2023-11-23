class Camera{
     String brand;
     ColorType color;
	 double pixel;
	 int batteryDuration;
	 Camera(String brand,double pixel,int batteryDuration)
	 {
		 this.brand=brand;
		 this.pixel=pixel;
		 this.batteryDuration=batteryDuration;
		 System.out.println("brand,pixel,batteryDuration");
		 System.out.println("camera brand:"+this.brand);
         System.out.println("camera pixel:"+this.pixel);
		 System.out.println("camera batteryDuration:"+this.batteryDuration);
		 
		 
	}
 void setType(ColorType color)
 {
	 this.color=color;
	 System.out.println("color:"+this.color);
 }
}