package DaimondProblem_Instance;

public interface LWAnimal extends LandAnimal,WaterAnimal{

    @Override
    default void sound() {
        System.out.println("land Water Animal makes Sound");
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
