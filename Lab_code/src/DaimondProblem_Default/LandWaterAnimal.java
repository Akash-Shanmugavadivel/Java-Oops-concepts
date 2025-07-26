package DaimondProblem_Default;

public class LandWaterAnimal  implements LandAnimal,WaterAnimal{

//    //Solve using Interfaces by (calling methods with Interface Name)
//    public void sound() {
//        LandAnimal.super.sound();
//        WaterAnimal.super.sound();
//    }
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
