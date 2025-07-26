package DaimondProblem_Default;

import DaimondProblem_Instance.LandAnimal;
import DaimondProblem_Instance.WaterAnimal;

public class Frog implements LandAnimal, WaterAnimal {
    @Override
    public void sound() {
        System.out.println("Frog makes both croaking and aquatic sounds.");
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
