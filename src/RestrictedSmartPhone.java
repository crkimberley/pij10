/**
 * @author crkimberley on 29/09/2016.
 */
public class RestrictedSmartPhone extends SmartPhone {

    public RestrictedSmartPhone(String brand) {
        super(brand);
    }

    @Override
    public void playGame(String game) {
        System.out.println("Games are forbidden!");
    }
}
