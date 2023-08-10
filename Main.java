import java.awt.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("First Commit");

        byte age = 30;
        Date date = new Date();
        System.out.println(date);

        //Primitives dont reference memory Copied by value
        int x = 1;
        int y = x;
        x = 2;
        System.out.println(y);

        //Object refer to memory Copied by Memory
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 3;
        System.out.println(point2);

        String message = " Hello World" + "!! ";
        message.endsWith("!!");


        System.out.println(message.length());
        System.out.println(message.indexOf("!"));

        System.out.println(message.replace("!!","**"));
        System.out.println(message + " In Java Strings are immutable that means they cannot be changed Any function will return new String Object");

        System.out.println(message.toLowerCase());

        System.out.println(message.trim());


        //Escape Sequences


        String message1 = "Hello \"Mohan\"";
        String message3 = "C:\n\\\tWindows\\...";
        System.out.println(message1);
        System.out.println(message3);







    }
}
