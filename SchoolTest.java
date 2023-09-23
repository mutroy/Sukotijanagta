import java.util.Scanner;

public class SchoolTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        School mySchool = new School();

        System.out.printf("Name in the object is : %s%n%n",mySchool.getSchoolName());

        System.out.println("Please enter a school name");
        String theSchoolName = input.nextLine();
        mySchool.setSchoolName(theSchoolName);

        System.out.printf("The name in the object is %s",mySchool.getSchoolName());
    }
}
