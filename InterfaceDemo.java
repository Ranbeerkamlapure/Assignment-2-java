interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Student implements Printable, Showable {
    private String name;
    private int roll;
    private double marks;

    public Student(String name, int roll, double marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    public void print() {
        System.out.println("Printing Student Details…");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Marks: " + marks);
    }

    public void show() {
        System.out.println("Showing Student Information...");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Student s = new Student("Ranbeer",28, 8.5);
        s.print();
        s.show();
    }
}
