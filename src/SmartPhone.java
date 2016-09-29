/**
 * @author crkimberley on 29/09/2016.
 */
public class SmartPhone extends MobilePhone {

    public void browseWeb(String address) {
        System.out.println("Browsing: " + address);
    }

    public String findPosition() {
        return "Position: London, WC1";
    }
}
