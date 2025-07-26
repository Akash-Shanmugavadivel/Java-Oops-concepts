package DaimondProblem_Instance;

public class Dog implements LandAnimal{
    @Override
    public void sound(){
//        LandAnimal.super.sound();
        System.out.println("Dog makes Barking");
    }
    @Override
    public void walk() {
        System.out.println("Dog walks on Land");
    }
}
