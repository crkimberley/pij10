/**
 * @author crkimberley on 30/09/2016.
 */
public class LecturerTest {

    public static void main(String[] args) {
        new LecturerTest().launch();
    }

    private void launch() {
        Lecturer lecturer = new Lecturer("Trevor");

        lecturer.teach("Scala");
        lecturer.doResearch("Data structures");
    }
}
