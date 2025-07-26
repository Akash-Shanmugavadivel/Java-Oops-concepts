package DaimondProblem_Instance;

public class Frog implements LWAnimal{
    @Override
    public void sound() {
        System.out.println("Frog makes both croaking and aquatic sounds.");

        // LandAnimal.super.sound();   // Uncomment to use LandAnimal's version of sound
        // WaterAnimal.super.sound();  // Uncomment to use WaterAnimal's version of sound
    }

    @Override
    public void walk() {
        System.out.println("Frog walks on land.");
    }

    @Override
    public void swim() {
        System.out.println("Frog swims in water.");
    }
}
