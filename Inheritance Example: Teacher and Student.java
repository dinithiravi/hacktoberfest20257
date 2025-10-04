class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void display() {
        super.display();
        System.out.println("Subject: " + subject);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Dinithi", 28, "Java Programming");
        t1.display();
    }
}
