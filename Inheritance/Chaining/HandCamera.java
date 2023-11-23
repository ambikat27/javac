class HandCamera extends Camera{
 double weight;

 HandCamera(String brand,double pixel,int batteryDuration,double weight)
 {
  super(brand,pixel,batteryDuration);
  this.weight=weight;
 }
void setWeigth(double weight)
{
	System.out.println("Weight is:"+this.weight);
}
}