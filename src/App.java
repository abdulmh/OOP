import javax.swing.event.SwingPropertyChangeSupport;
import javax.swing.text.GapContent;

public class App {
    public static void main(String[] args) throws Exception {
        // Abstraction is to work with something we know how to use without
        // knowing how it works internally
        Student student = new Student("Hafsah","Abdul-Malik","CHC");
        System.out.println(student.greeting());

        // write lines of code to create an undergradStudent object.
        // using the student object as the basis for creation.
        // Call the greeting, creditsRemaining, and isMajorComplrte methods
        // on the UndergradStudent object.

        undergradStudent underGrad = new undergradStudent(student.getFirstName() ,student.getLastName() ,student.getSchoolName(), 3.75, 40, "Computer Science");
        System.out.println(underGrad.greeting());
        System.out.println(underGrad.creditsRemaining(40));
        System.out.println(underGrad.isMajorComplete(40));

        Integer one = 1;
        Integer two = 2;
        String twoString = "2.0";
        // Boolean bool = false;

        // Strongly typed programming languages will attempt to determine the type for you
        System.out.println(one + two);
        System.out.println(one + twoString);

        // System.out.println(one + bool);
    }
}
