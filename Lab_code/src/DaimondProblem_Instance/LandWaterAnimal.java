package DaimondProblem_Instance;

public class LandWaterAnimal  implements LandAnimal,WaterAnimal{
    @Override
    public void sound(){
        System.out.println("Land Water Animal makes a Sound");
    }

    public void walk() {
        System.out.println("Walk");
    }


    public void swim() {
        System.out.println("Swim");
    }
}
