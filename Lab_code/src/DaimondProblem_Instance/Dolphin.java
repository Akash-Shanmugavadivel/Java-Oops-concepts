package DaimondProblem_Instance;

public class Dolphin implements WaterAnimal{
    @Override
    public void sound() {
        System.out.println("Dolphin makes Whistles and Clicks");
//        WaterAnimal.super.sound();
    }

    @Override
    public void swim() {
        System.out.println("Dolphin swims on Water");
    }
}
