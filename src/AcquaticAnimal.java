/**
 * @author crkimberley on 04/10/2016.
 */
public abstract class AcquaticAnimal implements Animal, EggLayer {
    private String name;

    public AcquaticAnimal(String name) {
        this.name = name;
    }

    public void call() {
        System.out.println(name + " will not come");
    }

    public void reproduce() {
        layEggs();
    }

    public void layEggs() {
        System.out.println("Here come some eggs");
    }

    public void makeSound() {
        System.out.println(name + "'s making an acquatic animal sound");
    }
}