package DaimondProblem_Default;
public interface Animal {
    default void sound(){
        System.out.println("Generic Animal Sound");
    }
}

//interface Animal { }
//interface LandAnimal extends Animal { }
//interface WaterAnimal extends Animal { }
//
//class LandWaterAnimal implements LandAnimal, WaterAnimal { }
//class Dog implements LandAnimal { }
//class Frog implements LandAnimal, WaterAnimal { }
//class Dolphin implements WaterAnimal { }
