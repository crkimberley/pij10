/**
 * @author crkimberley on 04/10/2016.
 */
public class LandAnimal implements Animal, Mammal {
    private String name;

    public LandAnimal(String name) {
        this.name = name;
    }

    public void call() {
        System.out.println(name + " coming");
    }

    public void reproduce() {
        giveBirth();
    }

    public void giveBirth() {
        System.out.println(name + " (or Mrs...) is having some babies");
    }

    public void makeSound() {
        System.out.println(name + "'s making an animal on land sound");
    }
}