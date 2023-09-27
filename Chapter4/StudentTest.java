package Chapter4;

public class StudentTest {

    public static void main(String[] args) {

        Student account1 = new Student("NARPAVI", 96);
        Student account2 = new Student("NIRVITA", 86);

        System.out.printf("%s's letter grade is: %s%n", account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n", account2.getName(), account2.getLetterGrade());
    }
}
