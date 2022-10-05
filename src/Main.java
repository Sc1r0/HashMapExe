import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Create new HashMap<K, V>
        HashMap<Students, Integer> ObjectStudents = new HashMap<>();

        // Make some new students
        Students A = new Students("Albert", 23, 'M');
        Students B = new Students("Berta", 24, 'F');
        Students C = new Students("Robert", 28, 'M');
        Students D = new Students("Aisha", 18, 'F');

        // Print out the default system hashcode for an object
        System.out.println("Alberts Hash Code is: " + A.hashCode());
        System.out.println("Bertas Hash Code is: " + B.hashCode());
        System.out.println("Robert Hash Code is: " + C.hashCode());
        System.out.println("Aisha Hash Code is: " + D.hashCode() + "\n");

        // Add some students to the ObjectStudents HashMap.
        // ObjectStudents.put(K, V) -->
        // K = Key (with which the specified Value is to be associated with)
        // V = Value (the value to be associated with the specified Key)
        ObjectStudents.put(A, 7); // We associate the integer 7 to Student A.
        ObjectStudents.put(B, 7); // We associate the integer 7 to Student B.
        ObjectStudents.put(C, 12); // We associate the integer 12 to Student C.
        ObjectStudents.put(D, 2); // We associate the integer 2 to Student D.

        // Create an iterator to iterate through objects
        Iterator iterator = ObjectStudents.entrySet().iterator();

        // The almighty while loop to iterate through the objects
        while (iterator.hasNext()){
            // Define the Map Entries.
            // Map.Entry<K, V> -->
            // <K> = type of Key
            // <V> = type of Value
            Map.Entry<Students, Integer> pair = (Map.Entry) iterator.next();
            // Get the Key value
            Students student = pair.getKey();
            // Get the Value value
            int studentGrade = pair.getValue();
            // Print information about all objects in ObjectStudents
            System.out.println("Student: " + student.getName() + ", age: " + student.getAge() + ", sex: " +
                    student.getSex() + ", grade: " + studentGrade);

        }
    }
}