package DaimondProblem_Default;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Dolphin dolphin = new Dolphin();
        Frog frog=new Frog();
        System.out.println("======Dog======");
        dog.sound();
        dog.walk();
        System.out.println("======Dolphin======");
        dolphin.sound();
        dolphin.swim();
        System.out.println("======Frog======");
        frog.sound();
        frog.walk();
        frog.sound();
        System.out.println("======Land Water Animal======");
        LandWaterAnimal lwa=new  LandWaterAnimal();
        lwa.sound();
        lwa.swim();
        lwa.walk();

    }
}
