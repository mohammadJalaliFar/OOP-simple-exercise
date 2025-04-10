import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        String name;
        int age;

    System.out.println("please enter a name:");
    name = scanner.nextLine();
    System.out.println("please enter the age: ");
    age = scanner.nextInt();

    //creating a new object
    Person person = new Person(name , age);

    //displaying persons info...
    person.Display();

    }
}
