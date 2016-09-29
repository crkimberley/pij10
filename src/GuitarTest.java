/**
 * @author crkimberley on 30/09/2016.
 */
public class GuitarTest {
    public static void main(String[] args) {
        new GuitarTest().launch();
    }

    private void launch() {
        Guitar guitar = new Guitar();
        guitar.play();
        guitar.burn();
    }
}
