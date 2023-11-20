class PlantStarter{
public static void main(String[] args)
{
  Food food=new Food();
  food.eat();
  food.growth();
  Plant plant=new Food();
  plant.growth();
  food=(Food)plant;
  food.growth();


}

}