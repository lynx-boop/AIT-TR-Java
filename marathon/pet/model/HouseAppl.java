package pet.model;

public class HouseAppl {
    public static void main(String[] args) {
        System.out.println("There is 3 cats in the house: ");
        Cat cat1 = new Cat(1, "Sally", "Cat", 3, "Scotland cat", 5.2, 20.5);
        cat1.printPet(1, "Sally", "Cat", 3, "Scotland cat", 5.2, 20.5);
        Cat cat2 = new Cat(2, "Spielberg", "Cat", 11, "Sphinx", 6.1, 24.5);
        cat2.printPet(2, "Spielberg", "Cat", 11, "Sphinx", 6.1, 24.5);
        Cat cat3 = new Cat(3, "King Lee Johnson", "Cat", 4, "Maine Coon", 17.6, 40.5);
        cat3.printPet(3, "King Lee Johnson", "Cat", 4, "Maine Coon", 17.6, 40.5);

        System.out.println();
        System.out.println("And 2 dogs: ");
        Dog dog1 = new Dog(1, "Buddy", "Dog", 5, "German shepard", 45.7, 121.2);
        dog1.printPet(1, "Buddy", "Dog", 5, "German shepard", 45.7, 121.2);
        Dog dog2 = new Dog(2, "Lucky", "Dog", 2, "Labrador", 51.7, 125.2);
        dog2.printPet(2, "Lucky", "Dog", 2, "Labrador", 51.7, 125.2);

        System.out.println();
        System.out.println("And this is how they spend their day: ");
        cat1.toSleep("Sally", "Cat");
        cat3.toVoice("King Lee Johnson", "Cat");
        cat2.toPlay("Spielberg", "Cat");
        dog1.toSleep("Buddy", "Dog");
        dog2.toVoice("Lucky", "Dog");
        cat1.toPlay("Sally", "Cat");
        dog2.toPlay("Lucky", "Dog");
        System.out.println();

        System.out.println("Theirs mommy came home, so: ");
        cat1.toEat("Sally", "Cat", "Scotland cat");
        cat3.toEat("King Lee Johnson", "Cat", "Maine Coon");
        cat2.toEat("Spielberg", "Cat", "Sphinx");
        dog1.toEat("Buddy", "Dog", "German shepard");
        dog2.toEat("Lucky", "Dog", "Labrador");
        System.out.println();

        System.out.println("And then all family: ");
        System.out.println("Mommy is walking");
        cat1.goWalk("Sally", "Cat");
        cat3.goWalk("King Lee Johnson", "Cat");
        cat2.goWalk("Spielberg", "Cat");
        dog1.goWalk("Buddy", "Dog");
        dog2.goWalk("Lucky", "Dog");
        System.out.println();
    }
}
