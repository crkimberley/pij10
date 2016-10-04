/**
 * @author crkimberley on 04/10/2016.
 */
public abstract class FlyingAnimal implements Animal, EggLayer {
    private String name;

    public FlyingAnimal(String name) {
        this.name = name;
    }

    public void call() {
        System.out.println(name + " now flying, will come later when tired");
    }

    public void reproduce() {
        layEggs();
    }

    public void layEggs() {
        System.out.println("Here come some eggs");
    }

    public void makeSound() {
        System.out.println(name + "'s making a flying animal sound");
    }
}
