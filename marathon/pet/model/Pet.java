package pet.model;

public class Pet {
    private int id;
    private String name;
    private String species;
    private int age;

    public Pet(int id, String name, String species, int age) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void toSleep(String name, String species) {
        this.name = name;
        this.species = species;
        System.out.println(species + " " + name + " is sleeping ");
    }
    public void toVoice(String name, String species) {
        this.name = name;
        this.species = species;
        System.out.print(species + " " + name + " sounds ");
    }
    public void toEat(String name, String species) {
        this.name = name;
        this.species = species;
        System.out.print(species + " " + name + " is eating ");
    }

    public void toPlay(String name, String species) {
        this.name = name;
        this.species = species;
        System.out.println(species + " " + name + " is playing ");
    }
    public void goWalk(String name, String species) {
        this.name = name;
        this.species = species;
        System.out.println(species + " " + name + " is walking ");
    }

    public void printPet(int id, String name, String species, int age) {
        System.out.print("ID: " + id + ", name: " + name + ", species: " + species + ", age: " + age + " ");
    }

}
