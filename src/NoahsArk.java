/**
 * @author crkimberley on 04/10/2016.
 */
public class NoahsArk {
    public static void main(String[] args) {
        new NoahsArk().launch();
    }

    private void launch() {
        Animal bear = new Bear();
        bear.call();
        bear.reproduce();
        bear.makeSound();
        Animal salmon = new Salmon();
        salmon.call();
        salmon.reproduce();
        salmon.makeSound();
        Animal eagle = new Eagle();
        eagle.call();
        eagle.reproduce();
        eagle.makeSound();
    }
}
