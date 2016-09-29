/**
 * @author crkimberley on 30/09/2016.
 */
// Code won't compile - shows you can't extend final class String
public class ExtendedString extends String {

    public void printEven() {
        for (int i=0; i<this.length(); i=i+2) {
            System.out.print(this.charAt(i));
        }
    }
}
