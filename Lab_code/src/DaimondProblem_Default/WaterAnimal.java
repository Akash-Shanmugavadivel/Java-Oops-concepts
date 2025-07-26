package DaimondProblem_Default;

public interface WaterAnimal extends Animal{
    default void sound(){
        System.out.println("Water animal makes a Sound");
    }
    void swim();
}
