public class Person {

    private String name;
    private int age;

    //constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter
    public void getName(String name) {
        this.name = name;
    }

    public void getAge(int age) {
        this.age = age;
    }

    //setter
    public String setName() {
        return name;
    }

    public int age() {
        return age;
    }

    //age checker
    public String ageChecker(){
        if( age >= 18){
             return name +" is an old person";
        }else{
           return name+" is not an old person";
        }
    }

    public void Display() {
        System.out.println("name: " + name + "\nage: " + age + "\n" + ageChecker());
    }
}