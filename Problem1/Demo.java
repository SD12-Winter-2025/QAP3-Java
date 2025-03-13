// Demo.java
// This class tests the Person, Student, Teacher, and CollegeStudent classes


package Problem1;
public class Demo {
    public static void main(String[] args) {
        // Create and display instances of Person
        System.out.println("");
        System.out.println("");
        System.out.println("=== Person ===");
        Person alice = new Person("Alice Johnson", 45, "F");
        System.out.println("1. " + alice);

        Person mark = new Person("Mark Brown", 30, "M");
        System.out.println("2. " + mark);

        System.out.println("\n=== Student ===");
        // Create and display instances of Student
        Student emily = new Student("Emily Taylor", 17, "F", "HS12345", 3.8);
        System.out.println("3. " + emily);

        Student ryan = new Student("Ryan Davis", 15, "M", "HS67890", 3.2);
        System.out.println("4. " + ryan);

        System.out.println("\n=== Teacher ===");
        // Create and display instances of Teacher
        Teacher msClark = new Teacher("Ms. Clark", 40, "F", "Mathematics", 60000.0);
        System.out.println("5. " + msClark);

        Teacher mrSmith = new Teacher("Mr. Smith", 50, "M", "History", 65000.0);
        System.out.println("6. " + mrSmith);

        System.out.println("\n=== CollegeStudent ===");
        // Create and display instances of CollegeStudent
        CollegeStudent kate = new CollegeStudent("Kate Wilson", 19, "F", "UCB001", 3.9, 1, "Biology");
        System.out.println("7. " + kate);

        CollegeStudent james = new CollegeStudent("James Lee", 21, "M", "UCB002", 3.5, 3, "Mechanical Engineering");
        System.out.println("8. " + james);

        CollegeStudent sophia = new CollegeStudent("Sophia Carter", 20, "F", "UCB003", 4.0, 2, "Psychology");
        System.out.println("9. " + sophia);

        CollegeStudent liam = new CollegeStudent("Liam Martin", 22, "M", "UCB004", 3.6, 4, "Computer Science");
        System.out.println("10. " + liam);

        System.out.println("\n=== Testing Completed ===");
    }
}
