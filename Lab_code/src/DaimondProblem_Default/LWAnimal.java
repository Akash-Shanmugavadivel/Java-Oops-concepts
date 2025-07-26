package DaimondProblem_Default;

public interface LWAnimal extends LandAnimal,WaterAnimal{

    @Override
    default void sound() {
//        LandAnimal.super.sound();
        System.out.println("Land Water Animal makes sound");
    }

    @Override
    default void swim() {
        System.out.println("Land Water Animal swims on water");
    }

    @Override
    default void walk() {
        System.out.println("Land Water Animal walks on land");
    }
}
