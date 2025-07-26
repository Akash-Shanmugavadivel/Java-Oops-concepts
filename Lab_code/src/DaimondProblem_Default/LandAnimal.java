package DaimondProblem_Default;

public interface LandAnimal extends Animal {
    default void sound(){
        System.out.println("Land Animal makes sound");
    }
    void walk();
}


