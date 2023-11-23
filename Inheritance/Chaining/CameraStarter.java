class CameraStarter{

public static void main(String... args)
{
 System.out.println("Starting of cameraStarter main method");
 DigitalCamera digitalcamera=new DigitalCamer("cannon",26,2,7);
 digitalcamera.setColor(colorType.BLACK);
 handCamera handCamera=new HandCamera("nikon Z6",24.5,4);
 HandCamera.setColor(ColorType.GRAY);
 HandCamera.setWeight(200);
 System.out.println("Ending of cameraStarter main method");
}

}