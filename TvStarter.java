class TvStarter{
 public static void main(String[] args)
 {
  System.out.println("Starting in PlacementStarter");
  Speaker speaker=new Speaker(100);
  Tv tv=new Tv(speaker);
  tv.showInfo();
  
 System.out.println("Ending in PlacementStarter");
 
 }



}