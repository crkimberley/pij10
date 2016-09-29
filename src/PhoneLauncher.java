/**
 * @author crkimberley on 29/09/2016.
 */
public class PhoneLauncher {

    public static void main(String[] args) {
        new PhoneLauncher().launch();
    }

    private void launch() {
        SmartPhone smartPhone = new SmartPhone();

        smartPhone.ringAlarm("Get up!");

        smartPhone.playGame("Tetris");

        smartPhone.call("1001");
        smartPhone.call("1002");
        smartPhone.call("1003");
        smartPhone.call("1004");
        smartPhone.call("1005");
        smartPhone.call("1006");
        smartPhone.call("1007");
        smartPhone.call("1008");
        smartPhone.call("1009");
        smartPhone.call("1010");

        smartPhone.printLastNumbers();

        smartPhone.call("1011");

        smartPhone.printLastNumbers();

        smartPhone.call("1012");

        smartPhone.printLastNumbers();

        smartPhone.browseWeb("www.happypigs.com");

        System.out.println(smartPhone.findPosition());

        smartPhone.call("0013");

        smartPhone.printLastNumbers();

        smartPhone.call("1014");
        smartPhone.call("0015");

        smartPhone.printLastNumbers();
    }
}
