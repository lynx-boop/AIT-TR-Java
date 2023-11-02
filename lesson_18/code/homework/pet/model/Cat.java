package homework.pet.model;

public class Cat extends Pet{
    private String breed;
    private double weight;
    private double height;

    public Cat(int id, String name, String species, int age, String breed, double weight, double height) {
        super(id, name, species, age);
        this.breed = breed;
        this.weight = weight;
        this.height = height;
    }

    public void toVoice(String name, String species){
        super.toVoice(name, species);
        System.out.println("Meow!");
    }

    public void toEat(String name, String species, String breed) {
        super.toEat(name, species);
        System.out.print("food for " + breed);
        System.out.println();
    }

    public void printPet(int id, String name, String species, int age, String breed, double weight, double height) {
        super.printPet(id, name, species, age);
        this.breed = breed;
        this.weight = weight;
        this.height = height;
        System.out.println("breed: " + breed + ", weight: " + weight + ", height: " + height);
    }

}
